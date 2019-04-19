import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      String value = input.next();
      System.out.println(hexToDecimal(value));
  }   
    
    public static int hexToDecimal(String hexString)
  {
      if(hexString.length()==0) return 0;
      int digit; 
      if(Character.isDigit(hexString.charAt(0))) digit = hexString.charAt(0) - '0';
      else if(Character.isUpperCase(hexString.charAt(0))) digit = hexString.charAt(0) - 'A' + 10;
      else digit = hexString.charAt(0) - 'a' + 10;
      int value = digit*(int)(Math.pow(16,hexString.length()-1)); 
      return value + hexToDecimal(hexString.substring(1));
  }
}
