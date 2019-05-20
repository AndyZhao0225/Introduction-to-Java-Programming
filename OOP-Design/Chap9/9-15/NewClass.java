  public class NewClass 
{
    public static void main(String[] args)
  {
      int upperCounter = 0;
      for( int i=0; i<=args[0].length()-1; i++)
          if( Character.isUpperCase(args[0].charAt(i)) ) upperCounter++;
      if( upperCounter > 0 ) System.out.println( upperCounter + ( (upperCounter>1)? " uppercase letters.":" uppercase letter" ));
      else System.out.println("No uppercase letter in your input");
  }    
}
