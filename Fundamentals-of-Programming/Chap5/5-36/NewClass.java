import java.util.Scanner;

  public class NewClass 
{
   public static void main(String[] args)
 {
     System.out.print("Enter the number of sides of the regular polygon : ");
     Scanner input=new Scanner(System.in);
     int n = input.nextInt();
     System.out.print("Enter the length of side :");
     double side = input.nextDouble();
     
     System.out.printf("the area of this regular polygon is %.3f\n",area( n,side) );
 }
   
   public static double area(int n,double side)
 {
     return n*side*side/(4*Math.tan(Math.PI/n));
 }
}
