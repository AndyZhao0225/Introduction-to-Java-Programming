import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.text.*;
import java.util.Locale;

  public class MyFrame extends JFrame
{
    private JButton button = new JButton("Display Loan Schedule");
    private JTextField amountField = new JTextField(20);
    private JTextField yearsField = new JTextField(20);
    private JTextField rateField = new JTextField(20);
    private JTextArea area = new JTextArea();
    
    public MyFrame()
  {
      JLabel amountLabel = new JLabel("Loan Amount");
      JLabel yearsLabel = new JLabel("Number of Years");
      JLabel rateLabel = new JLabel("Annual Interest Rate");
      JPanel p1 = new JPanel(new GridLayout(3,2));
      p1.add(amountLabel);
      p1.add(amountField);
      p1.add(yearsLabel);
      p1.add(yearsField);
      p1.add(rateLabel);
      p1.add(rateField);
      p1.setBorder(new TitledBorder("Enter Loan Amount, Number of Years, and Annual Intereast Rate"));
      
      JPanel p2 = new JPanel(new BorderLayout());
      p2.add(p1,BorderLayout.CENTER);
      p2.add(button,BorderLayout.EAST);
      
      area.setEditable(false);
      
      this.add(p2,BorderLayout.NORTH);
      this.add(new JScrollPane(area),BorderLayout.CENTER);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
  }    
    
    public String loanCalculator(double amount, int years, double annualInterestRate)
  {
      NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
      String text = "";
      double balance = amount;
      double monthlyInterestRate=annualInterestRate/12;
      double monthlyPayment = balance*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,years*12));
      
      text += "Monthly Payment: " + currencyFormat.format(monthlyPayment) + "\n";
      text += "Total Payment: " + currencyFormat.format(monthlyPayment*12*years) +"\n";
      text += "Payment#\t\tInterest\t\tPrincipal\t\tBalance\n";
      for(int i=1; i<=years*12; i++)
         {
            double interest = monthlyInterestRate*balance;
            double principal = monthlyPayment - interest;
            balance = balance - principal;
            text += i+ "\t\t" + currencyFormat.format(interest) + "\t\t" + currencyFormat.format(principal) + "\t\t" 
                     + currencyFormat.format(balance) + "\n";
         }
      
      return text;
  }

    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(amountField.getText()!=null && yearsField.getText()!=null && rateField.getText()!=null)
          {
             double amount = Double.parseDouble(amountField.getText());
             int years = Integer.parseInt(yearsField.getText());
             double annualInterestRate = Double.parseDouble(rateField.getText())/100.0;
             String text = loanCalculator(amount,years,annualInterestRate);
             area.setText(text);
          }
    }  
  }    
}
