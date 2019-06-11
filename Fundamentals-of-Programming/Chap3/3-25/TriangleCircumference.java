import java.util.Scanner;

  public class TriangleCircumference 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      System.out.print("Please input three sides' length of a triangle: ");
      double a,b,c;
      a=input.nextDouble();
      b=input.nextDouble();
      c=input.nextDouble();
      if((a+b>c)&&(b+c>a)&&(a+c>b))System.out.println("The circumference of the triangle is "+(a+b+c));
      else System.out.println("Your input of the triangle is not valid data!");
  }    
}
