import java.util.Scanner;

  public class ComputeChange 
{
     public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int amount,remainingAmount,numberOfDollars,numberOfQuarters,numberOfDimes,numberOfNickels,numberOfCents;
       System.out.print("Enter an amount in integer, for example 1156(means 11 dolars and 56 cents): ");
       amount=input.nextInt();
       remainingAmount=amount;
       numberOfDollars=remainingAmount/100;
       remainingAmount=remainingAmount%100;
       numberOfQuarters=remainingAmount/25;
       remainingAmount=remainingAmount%25;
       numberOfDimes=remainingAmount/10;
       remainingAmount=remainingAmount%10;
       numberOfNickels=remainingAmount/5;
       remainingAmount=remainingAmount%5;
       numberOfCents=remainingAmount;
       System.out.println("Your amount "+amount+" consists of \n"
                        + "\t"+numberOfDollars+" dollars\n"
                        + "\t"+numberOfQuarters+" quarters\n"
                        + "\t"+numberOfDimes+" dimes\n"
                        + "\t"+numberOfNickels+" nickels\n"
                        + "\t"+numberOfCents+" cents");
   }
}
