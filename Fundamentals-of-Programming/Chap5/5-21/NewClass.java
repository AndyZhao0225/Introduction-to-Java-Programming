import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter ten numbers: ");
      double num1=input.nextDouble();
      double num2=input.nextDouble();
      double num3=input.nextDouble();
      double num4=input.nextDouble();
      double num5=input.nextDouble();
      double num6=input.nextDouble();
      double num7=input.nextDouble();
      double num8=input.nextDouble();
      double num9=input.nextDouble();
      double num10=input.nextDouble();
      System.out.println("The mean is "+mean(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10));
      System.out.printf("The standard deviation is %.5f\n",standardDevietion(num1, num2, num3, num4, num5, num6, num7, num8, num9, num10));
  }    
    
    public static double mean(double num1, double num2,double num3,double num4,double num5,double num6,double num7,double num8,double num9,double num10)
  {
      return (num1+num2+num3+num4+num5+num6+num7+num8+num9+num10)/10;
  }
    
    public static double standardDevietion(double num1, double num2,double num3,double num4,double num5,double num6,double num7,double num8,double num9,double num10)
  {
      double sum= num1+num2+num3+num4+num5+num6+num7+num8+num9+num10;
      double squareSum= num1*num1+num2*num2+num3*num3+num4*num4+num5*num5+num6*num6+num7*num7+num8*num8+num9*num9+num10*num10;
      double standardDeviation= Math.sqrt( (squareSum-sum*sum/10)/(10-1) );
      return standardDeviation;
  }
}
