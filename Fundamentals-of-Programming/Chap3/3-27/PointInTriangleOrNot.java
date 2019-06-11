import java.util.Scanner;

  public class PointInTriangleOrNot 
{
    public static void main(String[] args)
  {
      System.out.print("Enter a point's x- and y- coordinates: ");
      Scanner input=new Scanner(System.in);
      double x=input.nextDouble();
      double y=input.nextDouble();
      if(x<200&&y<100&&x>0&&y>0&&(y<-0.5*x+100))System.out.println("The point is in the triangle");
      else System.out.println("The point is not in the triangle");  
  }    
}
