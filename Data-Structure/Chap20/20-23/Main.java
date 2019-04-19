import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {    
      Scanner input = new Scanner(System.in);
      String value = input.next();
      System.out.println(binaryToDecimal(value));
  }
    
    public static int binaryToDecimal(String binaryString)
  {
      if(binaryString.length()==0) return 0;
      int digit = binaryString.charAt(0)=='0'? 0: 1;
      int value = digit*(int)(Math.pow(2,(binaryString.length()-1)));
      return value + binaryToDecimal(binaryString.substring(1));
  }
}
