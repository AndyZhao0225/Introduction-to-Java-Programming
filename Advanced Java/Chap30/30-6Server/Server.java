import java.io.*;
import java.net.*;
import java.util.*;

  public class Server 
{
    private int cursorPointer = 0;
    private List<Address> addrList = new ArrayList<Address>();  

    public static void main(String[] args) 
  {
      new Server();
  }

    public Server() 
  {
      try
       {
          ServerSocket serverSocket = new ServerSocket(8000);
          System.out.println("Server started");
             
          while(true) 
             {
                Socket socket = serverSocket.accept();
                ObjectInputStream inputFromClient = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream outputToClient = new ObjectOutputStream(socket.getOutputStream());
                String clientRequest = (String)inputFromClient.readObject();
                
                if(clientRequest.equals("add"))
                  {
                     Address address = (Address)inputFromClient.readObject();
                     if(!addrList.contains(address)) 
                       {
                          addrList.add(address);
                          System.out.println("A new student address is stored");
                          cursorPointer = addrList.size() - 1;
                       }
                  }
                else if(clientRequest.equals("first"))
                  {
                     Object address; 
                     if(addrList.size()>0) 
                       {
                          cursorPointer = 0; 
                          address = addrList.get(cursorPointer);
                       }
                     else address = "The databse is empty";
                     outputToClient.writeObject(address);
                     System.out.println("Sent the first address to the client");                   
                  }
                else if(clientRequest.equals("next"))
                  {
                     Object address; 
                     if(addrList.size()>0)
                       {
                          cursorPointer++;
                          if(cursorPointer>=addrList.size()) cursorPointer = addrList.size() - 1;
                          address = addrList.get(cursorPointer);
                       }
                     else address = "The databse is empty";
                     outputToClient.writeObject(address);
                     System.out.println("Sent the next address to the client"); 
                  }
                else if(clientRequest.equals("previous"))
                  {
                     Object address; 
                     if(addrList.size()>0) 
                       {
                          cursorPointer--;
                          if(cursorPointer<=0) cursorPointer = 0;
                          address = addrList.get(cursorPointer);
                       }
                     else address = "The databse is empty";
                     outputToClient.writeObject(address);
                     System.out.println("Sent the next address to the client"); 
                  }
                else if(clientRequest.equals("last"))
                  {
                     Object address; 
                     if(addrList.size()>0) 
                       {
                          cursorPointer = addrList.size() - 1;
                          address = addrList.get(cursorPointer);
                       }
                     else address = "The databse is empty";
                     outputToClient.writeObject(address); 
                     System.out.println("Sent the previous address to the client");
                  }
               inputFromClient.close();
               outputToClient.close();
             }
       }  
      catch(Exception ex) 
           {
              ex.printStackTrace();
           }
  }
}
