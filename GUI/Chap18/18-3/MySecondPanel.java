import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

  public class MySecondPanel extends JPanel
{
    private JTextField interestsRateField = new JTextField("0",50);
    private JTextField yearsField = new JTextField("0",50);
    private JTextField loanAmountField = new JTextField("0",50);
    private JTextField monthlyPaymentField = new JTextField("0",50);
    private JTextField totalPaymentField = new JTextField("0",50);
    
    public MySecondPanel()
  {
      setLayout(new GridLayout(5,1));
      
      interestsRateField.setHorizontalAlignment(JTextField.RIGHT);
      yearsField.setHorizontalAlignment(JTextField.RIGHT);
      loanAmountField.setHorizontalAlignment(JTextField.RIGHT);
      monthlyPaymentField.setHorizontalAlignment(JTextField.RIGHT);
      totalPaymentField.setHorizontalAlignment(JTextField.RIGHT);
      
      add(interestsRateField);
      add(yearsField);
      add(loanAmountField);
      add(monthlyPaymentField);
      add(totalPaymentField);
  }  
    
    public double getInterestsRate()
  {
      return Double.parseDouble(interestsRateField.getText());
  }
    
    public int getYears()
  {
      return Integer.parseInt(yearsField.getText());
  }
    
    public double getLoanAmount()
  {
      return Double.parseDouble(loanAmountField.getText());
  }
    
    public void setPayment(double interestsRate, int years, double loanAmount)
  {
      double monthlyPayment = loanAmount*interestsRate/1200 / (1 - 1/Math.pow(1 + interestsRate/1200,years*12));
      monthlyPayment /= 1.00;
      double totalPayment = monthlyPayment*12*years;
      monthlyPaymentField.setText(String.format("%.2f",monthlyPayment) + "");
      totalPaymentField.setText(String.format("%.2f",totalPayment) + "");
  }
}
