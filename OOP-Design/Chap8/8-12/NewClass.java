import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the endpoints of the first line segment: ");
      double x1 = input.nextDouble();
      double y1 = input.nextDouble();
      double x2 = input.nextDouble();
      double y2 = input.nextDouble();
      
      System.out.println("Enter the endpoints of the second line segment: ");
      double x3 = input.nextDouble();
      double y3 = input.nextDouble();
      double x4 = input.nextDouble();
      double y4 = input.nextDouble();
      
      double a = y2 - y1;
      double b = x1 - x2;
      double c = y4 - y3;
      double d = x3 - x4;
      double e = ( x1 - x2 )*y2 - ( y1 - y2 )*x2;
      double f = ( x3 - x4 )*y4 - ( y3 - y4 )*x4;
      
      LinearEquation equation = new LinearEquation(a,b,c,d,e,f);
      if(equation.isSolvable()) System.out.println("The intersecting point is: ( "+equation.getX()+" , "+equation.getY()+" )");
      else System.out.println("There is no intersecting point for the two lines");
  }    
}
