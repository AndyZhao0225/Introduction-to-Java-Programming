import java.util.Scanner;

  public class ComputeBMI 
{
     public static void main(String[] args)
   {
        final double PoundToKilogram=0.45359237,InchToMeter=0.0254;
        double weightInPounds,heightInInches,weightInKilograms,heightInMeters,BMI;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter weight in pounds:");
        weightInPounds=input.nextDouble();
        System.out.print("Enter height in inches:");
        heightInInches=input.nextDouble();
        weightInKilograms=weightInPounds*PoundToKilogram;
        heightInMeters=heightInInches*InchToMeter;
        BMI=weightInKilograms/(heightInMeters*heightInMeters);
        System.out.println("BMI is "+BMI);
   }
}
