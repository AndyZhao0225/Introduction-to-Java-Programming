import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = input.nextLine();
      System.out.print("Enter a character: ");
      char ch = input.next().charAt(0);
      System.out.println(ch+" appears "+count(s,ch)+" times in "+s);
  }   
    
    public static int count(String str, char a)
  {
      int count = 0;
      for( int i=0; i<=str.length()-1; i++)
          if( a == str.charAt(i) )count++;    
      return count;
  }
}
