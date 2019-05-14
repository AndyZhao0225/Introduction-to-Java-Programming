import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args) 
  {
    // Create a Scanner
      Scanner input = new Scanner(System.in);

      System.out.print("Enter a hex number: ");
      String hex = input.nextLine();
      
      try
        {
           int decimalValue = HexToDecimalConversion.hexToDecimal(hex.toUpperCase());
           System.out.println("The decimal value for hex number " + hex + " is " + decimalValue); 
        } 
      catch(NumberFormatException ex)
        {
           System.out.println(ex.toString());
        }
  }  
}
