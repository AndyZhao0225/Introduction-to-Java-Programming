import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a SSN: ");
      String ssn = input.nextLine();
      
      System.out.println((isValid(ssn))?"Valid SSN":"Invalid SSN");
  }   
    
    public static boolean isValid(String ssn)
  {
      if( ssn.length() != 9 ) return false;
      for( int i=0; i<=ssn.length()-1; i++)
          if( ! Character.isDigit(ssn.charAt(i)) ) return false;
      return true;
  }  
}
