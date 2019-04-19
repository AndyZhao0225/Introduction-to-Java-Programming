import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int l = input.nextInt();
      char[] chars = new char[l];
      for( int i=0; i<=l-1; i++)
          chars[i] = input.next().charAt(0);
      
      System.out.println(count(chars));
  }   
    
    public static int count(char[] chars)
  {
      return count(chars,0);
  }
    
    public static int count(char[] chars, int high)
  {
      if(high>=chars.length) return 0;
      int upperCount = Character.isUpperCase(chars[high])? 1: 0; 
      return upperCount + count(chars,high + 1);
  }
}
