import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the length of the array: ");
      int l = input.nextInt();
      System.out.println("Enter the array: ");
      char[] chars = new char[l];
      for( int i=0; i<=l-1; i++)
          chars[i] = input.next().charAt(0);
      System.out.print("Enter the character you want to count: ");
      char ch = input.next().charAt(0);
      
      System.out.println(count(chars,ch));
  }
    
    public static int count(char[] chars, char ch)
  {
      return count(chars,ch,0);
  }
    
    public static int count(char[] chars, char ch, int high)
  {
      if(high>=chars.length) return 0;
      int match = (ch==chars[high])? 1: 0; 
      return match + count(chars,ch,high+1);
  }
}
