import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

  public class FutureValue extends JFrame
{
    private JTextField jtfInvestmentAmount = new JTextField();  
    private JTextField jtfYears = new JTextField();
    private JTextField jtfAnnualInterestRate = new JTextField();
    private JTextField jtfFutureValue = new JTextField();
    private JButton jbtCalculate = new JButton("Calculate");
     
    public FutureValue()
  {
      JPanel p1 = new JPanel(new GridLayout(4,2));
      p1.add(new JLabel("Investment Amount"));
      p1.add(jtfInvestmentAmount);
      p1.add(new JLabel("Years"));
      p1.add(jtfYears);
      p1.add(new JLabel("Annual Interest Rate"));
      p1.add(jtfAnnualInterestRate);
      p1.add(new JLabel("Future Value"));
      p1.add(jtfFutureValue);
      JPanel p2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
      p2.add(jbtCalculate);
      
      this.add(p1,BorderLayout.CENTER);
      this.add(p2,BorderLayout.SOUTH);
      
      ButtonListener listener = new ButtonListener();
      
      jbtCalculate.addActionListener(listener);
  }    
    
    private class ButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        double investmentAmount = Double.parseDouble(jtfInvestmentAmount.getText());
        double years = Double.parseDouble(jtfYears.getText());
        double annualInterestRate = Double.parseDouble(jtfAnnualInterestRate.getText())/100;
        double monthlyInterestRate = annualInterestRate/12;
        
        double futureValue = investmentAmount*Math.pow((1 + monthlyInterestRate),years*12);
        
        jtfFutureValue.setText(String.format("%.2f",futureValue));
    }
  }
}
