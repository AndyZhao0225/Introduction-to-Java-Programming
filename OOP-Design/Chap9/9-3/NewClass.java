import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Create your new password: ");
      System.out.println("(1.At least 8 characters in your password\n2.Containing letters or numbers only\n3.At least two numbers in your password)");
      String s = input.nextLine();
         
      System.out.println((isValid(s))? "Valid Password":"Invalid Password"); 
  }   
    
    public static boolean isValid(String s)
  {
      if( s.length()<8 ) return false;
      int numbersCount = 0;
      for( int i=0; i<=s.length()-1; i++)
         {
            char ch = s.charAt(i); 
            if( !Character.isDigit(ch) && !Character.isLetter(ch) ) return false; 
            if( Character.isDigit(ch) ) numbersCount++;
         }
      if( numbersCount < 2 ) return false;
      return true;
  }
}
