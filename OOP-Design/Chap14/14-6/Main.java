import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a width and a height for rectangle1: ");
      double width1 = input.nextDouble();
      double height1 = input.nextDouble();
      Rectangle rectangle1 = new Rectangle(width1,height1); 
      System.out.print("Enter a width and a height for rectangle1: ");
      double width2 = input.nextDouble();
      double height2 = input.nextDouble();
      Rectangle rectangle2 = new Rectangle(width2,height2); 
      
      if( rectangle1.equals(rectangle2) ) System.out.println("Rectangle1 and rectangle2 are the same.");
      else System.out.println("Rectangle1 and rectangle2 are different.");
  }    
}

