import java.util.Scanner;

  public class ComputeAcceleration 
{
    public static void main(String[] args)
  {
      double v0,v1,time,averageAcceleration;
      Scanner input=new Scanner(System.in);
      System.out.print("Enter v0,v1,and t:");
      v0=input.nextDouble();
      v1=input.nextDouble();
      time=input.nextDouble();
      averageAcceleration=(v1-v0)/time;
      System.out.println("The average acceleration is "+averageAcceleration);
  }
}
