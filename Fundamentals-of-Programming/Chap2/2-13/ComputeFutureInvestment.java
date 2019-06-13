import java.util.Scanner;

  public class ComputeFutureInvestment
{
     public static void main(String[] args)
  {
       double investmentAmount,annuallyInterestRate,futureInvestmentValue;
       int numberOfYears;
       Scanner input=new Scanner(System.in);     
       System.out.print("Enter investment amount:");
       investmentAmount=input.nextDouble();
       System.out.print("Enter monthly interest rate:");
       annuallyInterestRate=input.nextDouble();
       System.out.print("Enter number of years:");
       numberOfYears=input.nextInt();
       futureInvestmentValue=investmentAmount*Math.pow(1+annuallyInterestRate/100.0,numberOfYears);
       futureInvestmentValue=(int)(futureInvestmentValue*100)/100.0;
       System.out.println("Accumulated value is "+futureInvestmentValue);
  }
}
