import java.util.Scanner;

  public class ComputeRequiredEnergy
{
     public static void main(String[] args)
   {
       double weight,initialTemperature,finalTemperature,requiredEnergy;
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the amount of water in kilograms:");
       weight=input.nextDouble();
       System.out.print("Enter the initial temperature:");
       initialTemperature=input.nextDouble();
       System.out.print("Enter the final temperature:");
       finalTemperature=input.nextDouble();
       requiredEnergy=weight*(finalTemperature-initialTemperature)*4184;
       System.out.println("The energy needed is "+requiredEnergy);
   }
}
