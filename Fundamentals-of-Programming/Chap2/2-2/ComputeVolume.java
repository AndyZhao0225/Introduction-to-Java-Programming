import java.util.Scanner;

  public class ComputeVolume
{
     public static void main(String[] args)
   {
      final double PI=3.14159; 
      double radius,height,area,volume; 
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the radius and height of a cylinder:");
      radius=input.nextDouble();
      height=input.nextDouble();
      area=radius*radius*PI;
      System.out.println("The area is "+area);
      volume=area*height;
      System.out.println("The volume is "+volume);
   }
}
