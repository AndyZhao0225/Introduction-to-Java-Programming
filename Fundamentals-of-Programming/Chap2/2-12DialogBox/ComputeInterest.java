import javax.swing.JOptionPane;

  public class ComputeInterest
{
    public static void main(String[] args)
  {
      String balanceString,interestRateString;
      double balance,interestRate,interest;
      balanceString=JOptionPane.showInputDialog("Enter the balance:");
      balance=Double.parseDouble(balanceString);
      interestRateString=JOptionPane.showInputDialog("Enter the interest rate (e.g., 3 for 3%):");
      interestRate=Double.parseDouble(interestRateString);
      interest=balance*(interestRate/1200);
      interest=(int)(interest*100000)/100000.0;
      JOptionPane.showMessageDialog(null,"The interest is "+interest);
  }                  
}
