import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a hex number: ");
      String hex = input.nextLine();
      
      try
        {
           int decimalValue = hexToDecimal(hex.toUpperCase());
           System.out.println("The decimal value for hex number " + hex + " is " + decimalValue); 
        } 
      catch(HexFormatException ex)
        {
           System.out.println(ex.toString());
        }
  }  
    
    public static int hexToDecimal(String hex) throws NumberFormatException
  {
      int decimalValue = 0;
      for( int i=0; i<hex.length(); i++) 
         {
            char hexChar = hex.charAt(i); 
            decimalValue = decimalValue*16 + hexCharToDecimal(hexChar);   
         }
    
      return decimalValue;
  }

    public static int hexCharToDecimal(char ch) throws HexFormatException
  {
      if( ch>='A' && ch<='F') return 10 + ch - 'A';
      else if( '0'<=ch && ch<='9' ) return ch - '0';
      else throw new HexFormatException("Illegal hexadecimal character: " + ch);
  }
}

