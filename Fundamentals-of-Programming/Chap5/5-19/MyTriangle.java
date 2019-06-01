import java.util.Scanner;

  public class MyTriangle 
{
    public static boolean isValid( double side1, double side2, double side3) 
  {
      if( side1+side2>side3 && side2+side3>side1 && side3+side1>side2) return true;
      return false;
  }
    
    public static double area( double side1, double side2, double side3)
  {
      double s=(side1+side2+side3)/2;
      return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
  }
    
    public static void main(String[] args)
  {
      System.out.print("Enter three sides' length: ");
      Scanner input=new Scanner(System.in);
      double side1=input.nextDouble();
      double side2=input.nextDouble();
      double side3=input.nextDouble();
      
      if(isValid( side1, side2, side3))
        System.out.println("The triangle's area is "+area( side1, side2, side3));
      else 
        System.out.println("Invalid input!");
  }    
}
