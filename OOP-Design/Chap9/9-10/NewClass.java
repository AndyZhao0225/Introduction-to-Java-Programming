import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a decimal number: ");
      int dec = input.nextInt();
      
      System.out.println(decimalToBinary(dec));
  }
    
    public static String decimalToBinary(int value)
  {
      if( value == 0 ) return "0";
      StringBuilder strB = new StringBuilder();
      boolean isNegative = false;
      if( value < 0 )
        {
           value = -value; 
           isNegative = true;
        }
      int remaining = value;
      int digit;
      char ch;
      
      while( remaining != 0 )
         {
            digit = remaining % 2;
            ch = ( digit == 1 )? '1': '0';
            strB.insert(0,ch);
            remaining = remaining / 2;
         }
      if(isNegative) strB.insert(0,'-');
      
      return strB.toString();
  }
}
