import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int value = input.nextInt();
      System.out.println(decimalToHex(value));
  }    
    
    public static String decimalToHex(int value)
  {
      if(value==0) return "";
      char digit;
      if(value%16<10) digit = (char)(value%16 + '0');
      else digit = (char)((value%16 - 10) + 'A');
      return decimalToHex(value/16) + digit;
  }
}
