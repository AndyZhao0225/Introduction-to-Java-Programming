import java.util.Scanner;

  public class ShowCurrency 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double amount;
      int remainingAmount,numberOfDollars,numberOfQuarters,numberOfDimes,numberOfNickels,numberOfCents;
      System.out.print("Enter the amount in double, for example 23.67: ");
      amount=input.nextDouble();
      remainingAmount=(int)(amount*100);
      numberOfDollars=remainingAmount/100;
      remainingAmount=remainingAmount%100;
      numberOfQuarters=remainingAmount/25;
      remainingAmount=remainingAmount%25;
      numberOfDimes=remainingAmount/10;
      remainingAmount=remainingAmount%10;
      numberOfNickels=remainingAmount/5;
      remainingAmount=remainingAmount%5;
      numberOfCents=remainingAmount;
      System.out.println("Your amount consists of");
      if(numberOfDollars!=0)
        {
           System.out.print("\t"+numberOfDollars+" Dollar");
           if(numberOfDollars!=1)System.out.print("s");
           System.out.print("\n");
        }
      if(numberOfQuarters!=0)
        {
           System.out.print("\t"+numberOfQuarters+" Quarter");
           if(numberOfQuarters!=1)System.out.print("s");
           System.out.print("\n");
        }
      if(numberOfDimes!=0)
        {
           System.out.print("\t"+numberOfDimes+" Dime");
           if(numberOfDimes!=1)System.out.print("s");
           System.out.print("\n");
        }
      if(numberOfNickels!=0)
        {
           System.out.print("\t"+numberOfNickels+" Nickel");
           if(numberOfNickels!=1)System.out.print("s");
           System.out.print("\n");
        }
      if(numberOfCents!=0)
        {
           System.out.print("\t"+numberOfCents+" Cent");
           if(numberOfCents!=1)System.out.print("s");
           System.out.print("\n");
        }
  }
}
