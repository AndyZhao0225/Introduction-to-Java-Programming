import java.util.Scanner;

  public class TestTriangle 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter three values for triangle's sides: ");
      double side1 = input.nextDouble();
      double side2 = input.nextDouble();
      double side3 = input.nextDouble();
      
      try
        {
           Triangle tri = new Triangle(side1,side2,side3);
           System.out.println("Triangle information:");
           System.out.println("Area: " + tri.getArea());
           System.out.println("Perimeter: " + tri.getPerimeter());
        }
      catch(IllegalTriangleException ex)
        {
           System.out.println(ex.toString());
        }
  }    
}
