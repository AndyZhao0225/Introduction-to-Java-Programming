import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

  public class Client extends JFrame 
{
    private final int PORT_NUM;  
    private JTextArea messageArea = new JTextArea();
    private JTextField nameField = new JTextField(38);
    private JTextField textField = new JTextField(36);
    private boolean initialized = false;
    private final InetAddress SERVER_IP;
    private final int SERVER_PORT_NUM;
    
    public Client(int newPortNum, InetAddress serverIP, int serverPortNum)
  {
      PORT_NUM = newPortNum;
      SERVER_IP = serverIP;
      SERVER_PORT_NUM = serverPortNum;
      
      createGUI();
      
      MyListener listener = new MyListener();
      textField.addActionListener(listener);
      
      messageArea.setEditable(false);
      
      new Thread(new PacketListener()).start(); 
  }    
    
    private void createGUI()
  {
      setTitle("Client");
      setSize(500,600);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setResizable(false);
      
      JLabel nameLabel = new JLabel("Name");
      JPanel p1 = new JPanel();
      p1.add(nameLabel,BorderLayout.WEST);
      p1.add(nameField,BorderLayout.CENTER);
       
      JLabel textLabel = new JLabel("Enter text");
      JPanel p2 = new JPanel();
      p2.add(textLabel,BorderLayout.WEST);
      p2.add(textField,BorderLayout.CENTER);
      
      JPanel panel1 = new JPanel();
       
      panel1.setLayout(new GridLayout(2,1));
      panel1.add(p1);
      panel1.add(p2);
      
      JPanel panel2 = new JPanel();
      panel2.setLayout(new BorderLayout());   
      JScrollPane pane = new JScrollPane(messageArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      panel2.add(pane,BorderLayout.CENTER);         
      
      this.add(panel1,BorderLayout.NORTH);
      this.add(panel2,BorderLayout.CENTER);
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {         
        try
          {
             String userInput = textField.getText();
             String userName = nameField.getText(); 
             
             DatagramSocket socket = new DatagramSocket();
             ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
             
             if(!initialized)
               {
                  Initial initialization = new Initial(userName,PORT_NUM,userInput);                  
                  objectOutputStream.writeObject(initialization);               
                  initialized = true;
               }
             else 
               {
                  NameWithText sendingText = new NameWithText(userName,userInput);
                  objectOutputStream.writeObject(sendingText);   
               }
             
             objectOutputStream.flush();                
             byte[] data = byteArrayOutputStream.toByteArray();
             DatagramPacket sendPacket = new DatagramPacket(data,data.length,SERVER_IP,SERVER_PORT_NUM);
             objectOutputStream.close();
             byteArrayOutputStream.close();
             socket.send(sendPacket);       
          }
        catch(Exception ex)
          {
             System.err.println(ex);
          }   
    }
  }  
    
    private class PacketListener implements Runnable
  {
      public void run()
    {
        try
          {
             DatagramSocket socket = new DatagramSocket(PORT_NUM);      
             while(true)
               { 
                  byte[] tempData = new byte[50000];
                  DatagramPacket receivePacket = new DatagramPacket(tempData,tempData.length);
                  socket.receive(receivePacket);
                  ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(tempData);
                  ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                
                  String allText = (String)objectInputStream.readObject();
                  messageArea.setText(allText);
                
                  objectInputStream.close();  
                  byteArrayInputStream.close();
             }
          }
        catch(Exception ex)
          {
             ex.printStackTrace();
          }
    }  
  }
}
