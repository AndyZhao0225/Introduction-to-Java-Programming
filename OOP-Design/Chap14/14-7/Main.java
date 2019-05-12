import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a side length for octagon1: ");
      Octagon octagon1 = new Octagon(input.nextDouble());
      System.out.println("ocatgon1: ");
      System.out.println("\tArea: " + octagon1.getArea());
      System.out.println("\tPerimeter: " + octagon1.getPerimeter());
      Octagon octagon2 = new Octagon();
      try
        {
           octagon2 = (Octagon)octagon1.clone();
        } 
      catch(CloneNotSupportedException ex)
        {
        
        }
      finally 
        {
           System.out.println("\nOctagon2 was cloned from octagon1");
           if( octagon1.compareTo(octagon2)==0 ) System.out.println("Ocatgon2 and octagon1 have the same area");
        }
  }    
}
