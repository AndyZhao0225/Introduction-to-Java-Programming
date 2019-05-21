import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the 1st string: ");
      String str1 = input.nextLine();
      System.out.print("Enter the 2nd string: ");
      String str2 = input.nextLine();
      
      String pre = prefix(str1,str2);
      if( "".equals(pre) ) System.out.println("No common prefix");
      else System.out.println("The common prefix: "+pre); 
  }   
    
    public static String prefix(String s1, String s2)
  {
      String pre = "";
      int l = ( s1.length() > s2.length() )? s2.length(): s1.length();
      
      for( int i=0; i<=l-1; i++)
         {
            if( s1.charAt(i) == s2.charAt(i) ) pre = pre + s1.charAt(i);
            else break;
         }
      
      return pre;
  }
}
