import java.util.Scanner;

  public class ComputeBMI 
{
     public static void main(String[] args)
  {
       Scanner input=new Scanner(System.in);
       double weightInPounds,feetPartOfHeight,inchesPartOfHeight,weightInKilograms,heightInMeters,bmi;
       final double KILOGRAMS_PER_POUND=0.45359237,METERS_PER_INCH=0.0254,METERS_PER_FOOT=0.3048;
       System.out.print("Enter weight in pounds: ");
       weightInPounds=input.nextDouble();
       System.out.print("Enter height in feet and inches\n(e.g 5 10 represents for 5 feet and 10 inches): ");
       feetPartOfHeight=input.nextInt();
       inchesPartOfHeight=input.nextInt();
       weightInKilograms=weightInPounds*KILOGRAMS_PER_POUND;
       heightInMeters=inchesPartOfHeight*METERS_PER_INCH+feetPartOfHeight*METERS_PER_FOOT;
       bmi=weightInKilograms/(heightInMeters*heightInMeters);
       System.out.println("Your BMI is "+bmi);
       if(bmi<16)System.out.println("You are seriously underweight");
       else if(bmi<18)System.out.println("You are underweight");
       else if(bmi<24)System.out.println("You are normal weight");
       else if(bmi<29)System.out.println("You are overweight");
       else if(bmi<35)System.out.println("You are seriously overweight");
       else System.out.println("You are gravely overweight");
  }  
}
