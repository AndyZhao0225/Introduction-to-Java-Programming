import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = input.nextLine();
      
      int count = countLetters(str);
      
      if( count == 0 ) System.out.println("There is no letters in "+str);
      else if( count == 1 ) System.out.println("There is 1 letter in "+str);
      else System.out.println("There are "+count+" letters in "+str);
  }   
    
    public static int countLetters(String s)
  {
      int count = 0;
      for( int i=0; i<=s.length()-1; i++)
          if( Character.isLetter(s.charAt(i)) ) count++;
      return count;
  }
}
