import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("The amount invested: ");
      Scanner input = new Scanner(System.in);
      double investmentAmount=input.nextDouble();
      System.out.print("Annual interest rate: ");
      double annuallyInterestRate=input.nextDouble()/100;
      double monthlyInterestRate=annuallyInterestRate/12;
      
      System.out.println("Years        Future Value");
      for( int years=1; years<=30; years++)
         System.out.printf("%2d           %.2f\n",years,futureInvestmentValue( investmentAmount, monthlyInterestRate, years));
  }   
    
    public static double futureInvestmentValue( double investmentAmount, double monthlyInterestRate, int years)
  {
      return investmentAmount* Math.pow(1+monthlyInterestRate*12, years);
  }
}
