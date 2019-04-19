import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      String str = input.nextLine();
      char a = input.next().charAt(0);
      System.out.println(count(str,a));
  }    
    
    public static int count(String str, char a)
  {
      return count(str,a,0);
  }
    
    public static int count(String str, char a, int high)
  {
      if(high>=str.length()) return 0;
      int match = str.charAt(high)==a? 1: 0;
      return match + count(str,a,high + 1);
  }
}
