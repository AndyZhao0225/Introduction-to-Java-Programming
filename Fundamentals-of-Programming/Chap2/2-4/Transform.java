import java.util.Scanner;

  public class Transform
{
     public static void main(String[] args)
   {
       double weightInPound,weightInKilogram;
       Scanner input=new Scanner(System.in);
       System.out.print("Enter a number in pounds:");
       weightInPound=input.nextDouble();
       weightInKilogram=weightInPound*0.454;
       System.out.println(weightInPound+" pounds is "+weightInKilogram+" kilograms");
   }
}
