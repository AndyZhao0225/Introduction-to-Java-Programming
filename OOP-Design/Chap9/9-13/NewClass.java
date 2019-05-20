  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.println((isValid(args[0]))?"Valid SSN":"Invalid SSN");
  }    
    
    public static boolean isValid(String ssn)
  {
      if( ssn.length() != 9 ) return false;
      for( int i=0; i<=ssn.length()-1; i++)
          if( ! Character.isDigit(ssn.charAt(i)) ) return false;
      return true;
  }  
}
