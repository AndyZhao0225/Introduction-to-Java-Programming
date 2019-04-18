import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String value = input.nextLine();
      reverseDisplay(value);
      System.out.println();
  }    
    
    public static void reverseDisplay(String value)
  {
      if(value.length()==0) return;
      System.out.print(value.charAt(value.length()-1));
      reverseDisplay(value.substring(0,value.length()-1));
  }
}
