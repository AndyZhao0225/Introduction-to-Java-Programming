import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      String value = input.nextLine();
      reverseDisplay(value);
      System.out.println();
  }   
    
    public static void reverseDisplay(String value)
  {
      reverseDisplay(value,value.length()-1);
  } 
    
    public static void reverseDisplay(String value, int high)
  {
      if(high<0) return;
      System.out.print(value.charAt(high));
      reverseDisplay(value,high-1);
  }
}
