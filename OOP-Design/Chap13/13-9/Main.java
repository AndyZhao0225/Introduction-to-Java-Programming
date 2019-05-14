import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);  
      System.out.println("Enter a binary number: ");
      String bin = input.nextLine();
      
      try
        {
           int dec = binaryToDecimal(bin);
           System.out.println(dec);
        }
      catch(BinaryFormatException ex)
        { 
           System.out.println(ex.toString());
        }
  }    
    
    public static int binaryToDecimal(String binaryString) throws BinaryFormatException
  {
      int sum = 0;
      int i=0;
      if( binaryString.charAt(0)=='-' ) i=1; 
      for( ; i<=binaryString.length()-1; i++)
         {
            char ch = binaryString.charAt(i);
            if( ch!='0' && ch!='1' ) throw new BinaryFormatException("Illegal binary character: " + ch);
            sum += (ch-'0') * (int)Math.pow(2,(binaryString.length()-i-1));
         }  
      if( binaryString.charAt(0)=='-' ) return -sum;
      return sum;
  }  
}
