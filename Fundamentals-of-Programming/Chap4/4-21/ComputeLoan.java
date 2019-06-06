import java.util.Scanner;

  public class ComputeLoan 
{
    public static void main(String[] args)
  {
      System.out.print("Loan Amount: ");
      Scanner input=new Scanner(System.in);
      double loanAmount=input.nextDouble();
      System.out.print("Number of Years: ");
      int numberOfYears=input.nextInt();
      System.out.println("Interest Rate                     Monthly Payment                   Total Payment");
      double annualInterestRate=5/100.0;
      while(annualInterestRate<=8.125/100.0)
        {
           double monthlyInterestRate=annualInterestRate/12.0;
           double monthlyPayment= (loanAmount * monthlyInterestRate) / (1-1/Math.pow(1+monthlyInterestRate,numberOfYears*12));
           double totalPayment= monthlyPayment * numberOfYears * 12;
           System.out.printf("%.3f%%                            %.2f                            %.2f\n",annualInterestRate*100.0,monthlyPayment,totalPayment);
           annualInterestRate+=0.125/100;
        }
  }    
}
