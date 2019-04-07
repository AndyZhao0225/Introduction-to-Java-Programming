import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DecimalFormat;    

  public class Client extends JFrame
{
    private JLabel label1 = new JLabel("Annual Interest Rate");
    private JLabel label2 = new JLabel("Number Of Years");
    private JLabel label3 = new JLabel("Loan Amount");
    private JTextField field1 = new JTextField();
    private JTextField field2 = new JTextField();
    private JTextField field3 = new JTextField();
    private JButton button = new JButton("Submit");
    private JTextArea area = new JTextArea();
    private DataOutputStream toServer;
    private DataInputStream fromServer;
    private DecimalFormat df = new DecimalFormat("#.00"); 
    
    public Client()
  {
      setTitle("Client");
      setSize(500,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      setLayout(new GridLayout(2,1));
      
      JPanel panel = new JPanel(new BorderLayout());
      JPanel panel1 = new JPanel(new GridLayout(3,1));
      panel1.add(label1);
      panel1.add(label2);
      panel1.add(label3);
      JPanel panel2 = new JPanel(new GridLayout(3,1));
      panel2.add(field1);
      field1.setHorizontalAlignment(JTextField.RIGHT);
      panel2.add(field2);
      field2.setHorizontalAlignment(JTextField.RIGHT);
      panel2.add(field3);
      field3.setHorizontalAlignment(JTextField.RIGHT);
      panel.add(panel1,BorderLayout.WEST);
      panel.add(panel2,BorderLayout.CENTER);
      panel.add(button,BorderLayout.EAST);
      
      add(panel);
      add(new JScrollPane(area));
      
      button.addActionListener(new MyListener());
      
      try
        {
           Socket socket = new Socket("localhost",8000);
           fromServer = new DataInputStream(socket.getInputStream());
           toServer = new DataOutputStream(socket.getOutputStream());
        }
      catch(IOException ex)
        {
           area.append(ex.toString() + '\n');
        }
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        try
          {
             double annualInterestRate = Double.parseDouble(field1.getText().trim())/100.0;
             int numberOfYears = Integer.parseInt(field2.getText().trim());
             double loanAmount = Double.parseDouble(field3.getText().trim());
             
             toServer.writeDouble(annualInterestRate);
             toServer.writeInt(numberOfYears);
             toServer.writeDouble(loanAmount);
             toServer.flush();
             
             double monthlyPayment = fromServer.readDouble();
             double totalPayment = fromServer.readDouble();
             
             area.append("Annual Interest Rate: " + annualInterestRate + "  ");
             area.append("Number of Years: " + numberOfYears + "  ");
             area.append("Loan Amount: " + loanAmount + "\n");
             area.append("Monthly Payment: " + df.format(monthlyPayment) + "  ");
             area.append("Total Payment: " + df.format(totalPayment) + "\n\n");
          }
        catch(IOException ex)
          {
             System.err.println();
          }
    }
  }
}
