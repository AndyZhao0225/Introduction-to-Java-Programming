import java.util.Scanner;

  public class AddUpEveryDigit
{
     public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int number,firstDigit,secondDigit,thirdDigit,remaining,sum;
       System.out.print("Enter a number between 0 and 1000:");
       number=input.nextInt();
       remaining=number;
       thirdDigit=remaining%10;
       remaining=remaining/10;
       secondDigit=remaining%10;
       remaining=remaining/10;
       firstDigit=remaining;
       sum=firstDigit+secondDigit+thirdDigit;
       System.out.println("The sum of the digits is "+sum);
   }
}
