import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;

  public class Server extends JFrame 
{
    private JTextArea jta = new JTextArea();

    public static void main(String[] args) 
  {
      new Server();
  }

    public Server() 
  {
      setLayout(new BorderLayout());
      add(new JScrollPane(jta),BorderLayout.CENTER);

      setTitle("Server");
      setSize(500,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true); 

      try 
        {
           ServerSocket serverSocket = new ServerSocket(8000);
           jta.append("Server started at " + new Date() + '\n');
           Socket socket = serverSocket.accept();
           Scanner inputFromClient = new Scanner(socket.getInputStream());
           PrintWriter outputToClient = new PrintWriter(socket.getOutputStream(),true);
           
           while(true) 
             {
                double radius = inputFromClient.nextDouble();//readDouble();

                double area = radius * radius * Math.PI;

                outputToClient.println(area);

                jta.append("Radius received from client: " + radius + '\n');
                jta.append("Area found: " + area + '\n');
             }
        }
      catch(IOException ex) 
        {
           System.err.println(ex);
        }
  }
}
