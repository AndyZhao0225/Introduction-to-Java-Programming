import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

  public class Client extends JFrame 
{
    private JTextField jtf = new JTextField();
    private JTextArea jta = new JTextArea();
    private PrintWriter toServer;
    private Scanner fromServer;

    public static void main(String[] args) 
  {
      new Client();
  }

    public Client() 
  {
      JPanel p = new JPanel();
      p.setLayout(new BorderLayout());
      p.add(new JLabel("Enter radius"),BorderLayout.WEST);
      p.add(jtf,BorderLayout.CENTER);
      jtf.setHorizontalAlignment(JTextField.RIGHT);

      setLayout(new BorderLayout());
      add(p,BorderLayout.NORTH);
      add(new JScrollPane(jta),BorderLayout.CENTER);

      jtf.addActionListener(new ButtonListener());

      setTitle("Client");
      setSize(500,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true); 

      try 
        {
           Socket socket = new Socket("localhost",8000);
           
           fromServer = new Scanner(socket.getInputStream());
           toServer = new PrintWriter(socket.getOutputStream(),true);
        }
      catch(IOException ex) 
        {
           jta.append(ex.toString() + '\n');
        }
  }

    private class ButtonListener implements ActionListener 
  {
      public void actionPerformed(ActionEvent e) 
    { 
        double radius = Double.parseDouble(jtf.getText().trim());
        toServer.println(radius);

        double area = fromServer.nextDouble();

        jta.append("Radius is " + radius + "\n");
        jta.append("Area received from the server is " + area + '\n');       
    }
  }
}
