import java.awt.*;
import javax.swing.*;
import java.net.*;
import javax.swing.border.*;
import java.io.*;
import java.awt.event.*;

  public class Server extends JFrame 
{
    private JTextArea inputArea = new JTextArea();
    private JTextArea messageArea = new JTextArea();
    private ServerSocket serverSocket;
    private ObjectOutputStream outputToClient;
       
       public Server()
     {
         setTitle("Server");
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
         TitledBorder border2 = new TitledBorder("Him/her");
         messageArea.setBorder(border2);
         panel2.setLayout(new BorderLayout());
         panel2.add(messageArea,BorderLayout.CENTER);
         messageArea.setEditable(false);
      
         this.setLayout(new GridLayout(2,1));
         this.add(panel1);
         this.add(panel2);
         
         MyListener listener = new MyListener();
         inputArea.addKeyListener(listener);
              
         working();
     }
       
       public void working()
     {
         try
           {
              serverSocket = new ServerSocket(8000);
              Socket socket = serverSocket.accept();
              
              outputToClient = new ObjectOutputStream(socket.getOutputStream());
              ObjectInputStream inputFromClient = new ObjectInputStream(socket.getInputStream());
              while(true)
                {
                   String clientMessage = (String)inputFromClient.readObject();
                   messageArea.setText(clientMessage);
                   
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
                     outputToClient.writeObject(userInput);
                  }
                catch(Exception ex)
                  {
                     System.err.println(ex);
                  }
             }
       }
     }  
}
