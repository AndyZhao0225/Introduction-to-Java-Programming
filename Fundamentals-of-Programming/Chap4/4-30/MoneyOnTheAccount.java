import java.util.Scanner;

  public class MoneyOnTheAccount 
{
   public static void main(String[] args)
 {
     System.out.print("Enter the amount you want to deposit: ");
     Scanner input=new Scanner(System.in);
     double originalAmount=input.nextDouble();
     System.out.print("Enter the annual interest rate in percent: ");
     double annualInterestRate=input.nextDouble()/100.0;
     System.out.print("Enter how many months that you want to deposit the money: ");
     int months=input.nextInt();
     
     double amount=originalAmount;
     double monthInterestRate=annualInterestRate/12;
     for(int i=1;i<=months;i++)amount=amount*(1+monthInterestRate);
         
     System.out.printf("After %d months, the amount on the account will be %.2f\n",months,amount);
 }    
}
