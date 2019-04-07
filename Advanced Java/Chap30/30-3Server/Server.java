import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.InetAddress;
import java.util.Date;
import java.text.DecimalFormat;    

  public class Server extends JFrame
{
    private JTextArea area = new JTextArea();   
    private DecimalFormat df = new DecimalFormat("#.00");
    
    public Server()
  {
      setLayout(new BorderLayout());
      add(new JScrollPane(area),BorderLayout.CENTER);
      
      setTitle("Server");
      setSize(500,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      
      try
        {
           ServerSocket serverSocket = new ServerSocket(8000);  
           area.append("Server started at " + new Date() + '\n');
                  
           int clientNo = 1;
           while(true)
             {
                Socket socket = serverSocket.accept();
                area.append("\nStarting thread for client " + clientNo + " at " + new Date() + '\n');
                InetAddress inetAddress= socket.getInetAddress();
                area.append("Client's host name is " + inetAddress.getHostName() + "\n");
                area.append("Client's IP address is " + inetAddress.getHostAddress() + "\n");
                
                HandleAClient task = new HandleAClient(socket,clientNo);
                new Thread(task).start();
                
                clientNo++;
             }
        }
      catch(IOException ex)
        {
           System.err.println(ex);
        }
  }
    
    private class HandleAClient implements Runnable
  {
      private Socket socket;
      private int clientNo;
      
      public HandleAClient(Socket newSocket, int newClientNo)
    {
        socket = newSocket; 
        clientNo = newClientNo;
    }
      
      public void run()
    {
        try
          {
             DataInputStream inputFromClient = new DataInputStream(socket.getInputStream());
             DataOutputStream outputToClient = new DataOutputStream(socket.getOutputStream());
           
             while(true)
           {
               double annualInterestRate = inputFromClient.readDouble();
               int numberOfYears = inputFromClient.readInt();
               double loanAmount = inputFromClient.readDouble();
                
               double monthlyInterestRate = annualInterestRate/12;
               double monthlyPayment = loanAmount*monthlyInterestRate/(1 - 1/Math.pow(1 + monthlyInterestRate,numberOfYears*12));
               double totalPayment = monthlyPayment*12*numberOfYears;
                
               outputToClient.writeDouble(monthlyPayment);
               outputToClient.writeDouble(totalPayment);
           
               area.append("\nClient" + clientNo + ":\n");
               area.append("Annual Interest Rate: " + annualInterestRate + "  ");
               area.append("Number of Years: " + numberOfYears + "  ");
               area.append("Loan Amount: " + loanAmount + "\n");
               area.append("Monthly Payment: " + df.format(monthlyPayment) + "  ");
               area.append("Total Payment: " + df.format(totalPayment) + "\n\n");
           }
          }
        catch(IOException ex)
          {
             System.err.println(ex);
          }
    }
  }    
}
