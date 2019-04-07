import java.net.*;
import java.io.*;
import java.util.*;

  public class Server 
{
    private final int PORT_NUM;  
    private LinkedList<Record> clientList = new LinkedList<Record>();
    private StringBuilder allText = new StringBuilder();
            
    public Server(int portNum)
  {
      PORT_NUM = portNum;
      keepListening();
  }    
    
    private void keepListening()
  {
      try
        {
           DatagramSocket socket = new DatagramSocket(PORT_NUM);      
           System.out.println("The server is running");
           while(true)
             {
                byte[] tempData = new byte[50000];
                DatagramPacket receivePacket = new DatagramPacket(tempData,tempData.length);
                socket.receive(receivePacket);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tempData);
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                
                Object objectRead = objectInputStream.readObject();
                String clientName = "";
                String clientText = "";
                if(objectRead instanceof Initial)
                  {
                     Initial clientInitial = (Initial)objectRead;                 
                     clientName = clientInitial.getName();
                     int clientPortNum = clientInitial.getPortNum();  
                     InetAddress clientIP = receivePacket.getAddress();
                     Record currentClient = new Record(clientName,clientIP,clientPortNum);
                     clientList.add(currentClient);
                     clientText =  clientInitial.getText();
                  }
                else if(objectRead instanceof NameWithText)
                  {
                     NameWithText clientNameWithText = (NameWithText)objectRead;
                     clientName = clientNameWithText.getName();
                     clientText = clientNameWithText.getText();
                  }
                
                allText.append(clientName + ": " + clientText + "\n");
                multicastConversation();
                
                objectInputStream.close(); 
                byteArrayInputStream.close();
             }
        }
      catch(Exception ex)
        {
           ex.printStackTrace();
        }
  }
    
    private void multicastConversation() throws Exception
  {
      DatagramSocket socket = new DatagramSocket();
      ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
      ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
      objectOutputStream.writeObject(allText.toString()); 
      objectOutputStream.flush();                
      byte[] data = byteArrayOutputStream.toByteArray();
      for( int i=0; i<=clientList.size()-1; i++)
         {
            DatagramPacket sendPacket = new DatagramPacket(data,data.length,clientList.get(i).getClientIP(),clientList.get(i).getClientPortNum()); 
            socket.send(sendPacket); 
         }
      objectOutputStream.close();
      byteArrayOutputStream.close();      
  }
}
