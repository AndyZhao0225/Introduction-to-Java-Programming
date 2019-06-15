import java.util.Scanner;

  public class ComputeArea
{ 
     public static void main(String[] args)
   {
      double side,area; 
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the side:");
      side=input.nextDouble();
      area=3*Math.pow(3,0.5)*side*side/2;
      System.out.print("The area of the hexagon is "+area);
   }          
}
