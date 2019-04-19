import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int value = input.nextInt();
      System.out.println(decimalToBinary(value));
  }   
    
    public static String decimalToBinary(int value)
  {
      if(value==0) return "";
      return decimalToBinary(value/2) + (value%2 + "");
  }
}
