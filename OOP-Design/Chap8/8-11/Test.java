import java.util.Scanner;

  public class Test 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("ax+by=e");
      System.out.println("cx+dy=f\n");
      System.out.println("Enter a, b, c, d, e, f: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      double d = input.nextDouble();
      double e = input.nextDouble();
      double f = input.nextDouble();
      
      LinearEquation equation = new LinearEquation(a,b,c,d,e,f);
      if(equation.isSolvable()) System.out.println("x is "+equation.getX()+" y is "+equation.getY()); 
      else System.out.println("The equation has no solution");
  }    
}
