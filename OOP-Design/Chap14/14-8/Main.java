import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("How many geometric object you want to create? : ");
      int n = input.nextInt();
      GeometricObject[] a = new GeometricObject[n];
      for( int i=0; i<=n-1; i++)
         {
            System.out.print("Object" + i + ": Create a circle(c) or rectangle(r)? ");
            char selection = input.next().charAt(0);
            if( selection=='c' ) 
              {
                 System.out.print("Enter a radius: ");
                 a[i] = new Circle(input.nextInt());
              }
            else
              {
                 System.out.print("Enter a width and a height: ");
                 a[i] = new Rectangle(input.nextDouble(),input.nextDouble());
              }
         }
      System.out.println("Their area sum is " + sumArea(a));
  }  
    
    public static double sumArea(GeometricObject[] a)
  {
     double sum = 0;
     for( int i=0; i<=a.length-1; i++)
         sum += a[i].getArea();
     return sum;
  }
}
