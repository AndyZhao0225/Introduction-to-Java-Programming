import java.util.Scanner;

  public class ComputeInterest
{
     public static void main(String[] args)
   {
        Scanner input=new Scanner(System.in);
        double balance,interestRate,interest;
        System.out.print("Enter the balance and interset rate (e.g., 3 for 3%):");
        balance=input.nextDouble();
        interestRate=input.nextDouble();
        interest=balance*(interestRate/1200);
        interest=(int)(interest*100000)/100000.0;
        System.out.println("The interest is "+interest);
   }
}
