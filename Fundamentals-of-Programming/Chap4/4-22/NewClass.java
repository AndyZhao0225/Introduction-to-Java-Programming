import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("Loan Amount: ");
      Scanner input=new Scanner(System.in);
      double balance=input.nextDouble();
      System.out.print("Number of Years: ");
      int years=input.nextInt();
      System.out.print("Annual Interest Rate: ");
      
      double annualInterestRate=input.nextDouble()/100.0;
      double monthlyInterestRate=annualInterestRate/12;
      
      double monthlyPayment=balance*monthlyInterestRate/(1-1/Math.pow(1+monthlyInterestRate,years*12));
      System.out.printf("\nMonthly Payment: %.2f\n",monthlyPayment);
      System.out.printf("Total Payment: %.2f\n",monthlyPayment*12*years); 
      
      System.out.println("Payment#\t\tInterest\t\tPrincipal\t\tBalance");
      for(int i=1; i<=years*12; i++)
         {
            double interest=monthlyInterestRate*balance;
            double principal=monthlyPayment-interest;
            balance=balance-principal;
            System.out.printf("%-8d\t\t%-8.2f\t\t%-9.2f\t\t%.2f\n",i,interest,principal,balance);
         }
  }    
}
