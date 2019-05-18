import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input =new Scanner(System.in);
      System.out.println("Enter a binary number: ");
      String bin = input.nextLine();
      
      int dec = binaryToDecimal(bin);
      if( dec != -0 ) System.out.println(dec);
      else System.out.println("Invalid input!");
  }   
    
    public static int binaryToDecimal(String binaryString)
  {
      int sum = 0;
      int i=0;
      if( binaryString.charAt(0) == '-') i=1; 
      for( ; i<=binaryString.length()-1; i++)
         {
            char ch = binaryString.charAt(i);
            if( !Character.isDigit(ch) ) return -0;
            if( ch != '0' && ch!='1' ) return -0;
            sum += (ch-'0') * (int)Math.pow(2,(binaryString.length()-i-1));
         }  
      if( binaryString.charAt(0) == '-') return -sum;
      return sum;
  }  
}
