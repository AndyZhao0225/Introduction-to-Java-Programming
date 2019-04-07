import javax.swing.*;
import java.net.*;
import javax.swing.border.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

  public class Client extends JFrame 
{
    private ObjectInputStream fromServer;
    private ObjectOutputStream toServer;
    private JTextArea inputArea = new JTextArea();
    private JTextArea messageArea = new JTextArea();
    
    public Client()
  {
      setTitle("Client");
      setSize(500,600);
      setLocationRelativeTo(null);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      JPanel panel1 = new JPanel();
      TitledBorder border1 = new TitledBorder("Me");
      inputArea.setBorder(border1);
      panel1.setLayout(new BorderLayout());
      panel1.add(inputArea,BorderLayout.CENTER);
      
      JPanel panel2 = new JPanel();
      TitledBorder border2 = new TitledBorder("Him/Her");
      messageArea.setBorder(border2);
      panel2.setLayout(new BorderLayout());
      panel2.add(new JScrollPane(messageArea),BorderLayout.CENTER);          
      
      this.setLayout(new GridLayout(2,1));
      this.add(panel1);
      this.add(panel2);
      
      MyListener listener = new MyListener();
      inputArea.addKeyListener(listener);
      
      messageArea.setEditable(false);
      
      connectToServer();
  }
    
    public void connectToServer()
  {
      try
        {
           Socket socket;
           socket = new Socket("localhost",8000);
           fromServer = new ObjectInputStream(socket.getInputStream());
           toServer = new ObjectOutputStream(socket.getOutputStream());
           while(true)
             {
                String serverMessage = (String)fromServer.readObject();
                messageArea.setText(serverMessage);
             }
        }
      catch(Exception ex)
        {
           System.err.println(ex);
        }
  }
    
    private class MyListener extends KeyAdapter
  {
      public void keyPressed(KeyEvent e)
    {
           if(e.getKeyCode()==e.VK_ENTER) 
             {
                try
                  {
                     String userInput = inputArea.getText();
                     toServer.writeObject(userInput);
                  }
                catch(Exception ex)
                  {
                     System.err.println(ex);
                  }
             }
    }
 }  
}