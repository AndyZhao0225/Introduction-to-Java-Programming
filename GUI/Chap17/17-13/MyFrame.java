import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyFrame extends JFrame
{
    private JTextField amountField = new JTextField(10);
    private JTextField yearsField = new JTextField(3);
    private JButton button = new JButton("Show Table");
    private JTextArea area = new JTextArea();
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      Border lineBorder = new LineBorder(Color.BLACK,1);
      
      JPanel panel = new JPanel();
      panel.add(new JLabel("Loan Amount"));
      panel.add(amountField);
      panel.add(new JLabel("Number of Years"));
      panel.add(yearsField);
      panel.add(button);
      panel.setBorder(lineBorder);
      
      JScrollPane scrollPane = new JScrollPane(area);
      scrollPane.setBorder(lineBorder);
      
      this.add(panel,BorderLayout.NORTH);
      this.add(scrollPane,BorderLayout.CENTER);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
  }    
    
    public static String computeLoan(double loanAmount, int numberOfYears)
  {
      String loanForm = "";
      double annualInterestRate = 0.05;
      loanForm += "Interest Rate\t\tMonthly Payment\tTotal Payment\n";
              
      while(annualInterestRate<=8.125/100.0)
        {
           double monthlyInterestRate = annualInterestRate/12.0;
           double monthlyPayment = (loanAmount * monthlyInterestRate) / (1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
           double totalPayment = monthlyPayment * numberOfYears * 12;
           
           String temp = String.format("%.3f%%\t\t%.2f\t\t%.2f\n",
                         annualInterestRate*100.0,monthlyPayment,totalPayment);
           loanForm += temp;
           
           annualInterestRate += 0.125/100;
        }
      
      return loanForm;
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        double loanAmount = Double.parseDouble(amountField.getText());
        int numberOfYears = Integer.parseInt(yearsField.getText());
        String loanForm = computeLoan(loanAmount,numberOfYears);
        area.setText(loanForm);
    }   
  }
}
