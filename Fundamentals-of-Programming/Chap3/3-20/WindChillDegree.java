import java.util.Scanner;

  public class WindChillDegree 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double temperature,windSpeed,windChillIndex;
      System.out.print("Enter the temperature in Fahrenheit: ");
      temperature=input.nextDouble();
      System.out.print("Enter the wind speed miles per hour: ");
      windSpeed=input.nextDouble();
      if((windSpeed>=2)&&(temperature>=-58)&&(temperature<=41))
        {
           windChillIndex=35.74+0.6215*temperature-35.75*Math.pow(windSpeed,0.16)+0.4275*temperature*Math.pow(windSpeed,0.16);
           System.out.println("The wind chill index is "+windChillIndex);
        }
      else 
        {
           if(((windSpeed<2)&&(temperature<-58))||((windSpeed<2)&&(temperature>41)))System.out.println("Your input of wind speed is not valid!\n"
                    +"The system can only compute the wind chill index for situation with 2 miles per hour or above"
                    +" and temperature between -58F and 41F.");
           else if(windSpeed<2)System.out.println("Your input of wind speed is not valid!\n"
                    +"The system can only compute the wind chill index for situation with 2 miles per hour or above.");
           else System.out.println("Your input of temperature is not valid!\n"
                    +"The system can only compute the wind chill index for situation with temperature between -58F and 41F.");
        }
  }
}