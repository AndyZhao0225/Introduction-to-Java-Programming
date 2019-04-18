import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer: ");
      int value = input.nextInt();
      reverseDisplay(value);
      System.out.println();
  }
    
    public static void reverseDisplay(int value)
  {
      if(value==0) return;
      int remainder = value%10;
      System.out.print(remainder);
      reverseDisplay(value/10);
  }
}
