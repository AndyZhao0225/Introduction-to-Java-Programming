import java.util.Scanner;

  public class ComputeWindChillIndex 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double temperature,windSpeed,windChillIndex;
      System.out.print("Enter the temperature in Fahrenheit: ");
      temperature=input.nextDouble();
      System.out.print("Enter the wind speed miles per hour: ");
      windSpeed=input.nextDouble();
      windChillIndex=35.74+0.6215*temperature-35.75*Math.pow(windSpeed,0.16)+0.4275*temperature*Math.pow(windSpeed,0.16);
      System.out.println("The wind chill index is "+windChillIndex);
  }
}
