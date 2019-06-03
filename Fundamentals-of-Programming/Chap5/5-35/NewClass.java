import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("Enter the length of the pentagon's edge: ");
      Scanner input= new Scanner(System.in);
      double s=input.nextDouble();
      
      double area= 5*s*s/(4*Math.tan(Math.PI/5));
      System.out.printf("The area of the pentagon is %.4f\n",area);
  }    
}
