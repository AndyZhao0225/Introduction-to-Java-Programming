import java.util.Scanner;

  public class ComputeDistance
{
    public static void main(String[] args)
  {
      double x1,y1,x2,y2,distance;
      Scanner input=new Scanner(System.in);
      System.out.print("Enter x1 and y1:");
      x1=input.nextDouble();
      y1=input.nextDouble();
      System.out.print("Enter x2 and y2:");
      x2=input.nextDouble();
      y2=input.nextDouble();
      distance=Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5);
      System.out.println("The distance of the two points is "+distance);
  }
}
