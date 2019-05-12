import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a radius for circle1: ");
      Circle circle1 = new Circle(input.nextDouble()); 
      System.out.print("Enter a radius for circle2: ");
      Circle circle2 = new Circle(input.nextDouble());
      
      if( circle1.equals(circle2) ) System.out.println("Circle1 and circle2 have the same area.");
      else System.out.println("Circle1 and circle2 have different areas.");
  }    
}
