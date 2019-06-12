import java.util.Scanner;

  public class Transform
{
    public static void main(String[] args)
  {
      double lengthInFoot,lengthInMeter;
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a value for feet:");
      lengthInFoot=input.nextDouble();
      lengthInMeter=lengthInFoot*0.305;
      System.out.println(lengthInFoot+" feet is "+lengthInMeter+" meters");
  }    
}