import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the first complex number: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      Complex n1 = new Complex(a,b);
      System.out.print("Enter the second complex number: ");
      double c = input.nextDouble();
      double d = input.nextDouble();
      Complex n2 = new Complex(c,d);
      
      System.out.println( n1.toString() + " + " + n2.toString() + " = " + n1.add(n2).toString() );
      System.out.println( n1.toString() + " - " + n2.toString() + " = " + n1.subtract(n2).toString() );
      System.out.println( n1.toString() + " * " + n2.toString() + " = " + n1.multiply(n2).toString() );
      System.out.println( n1.toString() + " / " + n2.toString() + " = " + n1.divide(n2).toString() ); 
      System.out.println( "|" + n1.toString() + "|" + " = " +n1.abs());
  }    
}
