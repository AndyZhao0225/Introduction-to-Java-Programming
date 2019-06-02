  public class NewClass 
{
    public static void main(String[] args)
  {
      final int CHAR_PER_LINE = 10;
      final int NUMBER_OF_UPPERCASE = 100;
      final int NUMBER_OF_SINGLE_NUMBER = 100;
      
      for( int i=0; i<NUMBER_OF_UPPERCASE; i++)
         {
            char ch=RandomCharacter.getRandomUpperCaseLetter();
            if( (i+1) % CHAR_PER_LINE == 0 )  System.out.println(ch);
            else System.out.print(ch);
         }
      
      for( int i=0; i<NUMBER_OF_SINGLE_NUMBER; i++)
         {
            char ch=RandomCharacter.getRandomDigitCharacter();
            if( (i+1) % CHAR_PER_LINE == 0 )  System.out.println(ch);
            else System.out.print(ch);
         }
  }
}
