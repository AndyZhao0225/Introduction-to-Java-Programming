import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a radius for circle1: ");
      ComparableCircle c1 = new ComparableCircle(input.nextDouble());
      System.out.print("Enter a radius for circle2: ");
      ComparableCircle c2 = new ComparableCircle(input.nextDouble());
      if( c1.compareTo(c2)>0 ) System.out.println("c1 is larger");
      else if( c1.compareTo(c2)<0 ) System.out.println("c2 is larger");
      else System.out.println("c1 and c2 have the same area");
  }    
}
