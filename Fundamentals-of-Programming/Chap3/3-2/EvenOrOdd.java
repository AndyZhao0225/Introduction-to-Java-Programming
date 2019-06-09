import java.util.Scanner;

  public class EvenOrOdd 
{
     public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       int number;
       System.out.print("Enter an integer: ");
       number=input.nextInt();
       System.out.println("Is "+number+" an even number? "+(number%2==0));
   }
}
