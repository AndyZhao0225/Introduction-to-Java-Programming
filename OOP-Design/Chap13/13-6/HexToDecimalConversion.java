public class HexToDecimalConversion {
  /** Main method */
  

  public static int hexToDecimal(String hex) throws NumberFormatException
{
    int decimalValue = 0;
    for (int i = 0; i < hex.length(); i++) {
      char hexChar = hex.charAt(i);
      try
        {
           decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
      catch(NumberFormatException ex)
        {
           throw ex;
        }
    }
    
    return decimalValue;
  }

    public static int hexCharToDecimal(char ch) throws NumberFormatException
  {
      if( ch>='A' && ch<='F') return 10 + ch - 'A';
      else if( '0'<=ch && ch<='9' ) return ch - '0';
      else throw new NumberFormatException("NumberFormatException");
  }
}

