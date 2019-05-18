import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the first string: ");
      String str1 = input.nextLine();
      System.out.println("Enter the second string: ");
      String str2 = input.nextLine();
      
      System.out.println("The first string is "+(isSubstring(str1,str2)?"":"not ")+"a substring to the second string");
  }   
    
    public static boolean isSubstring(String str1, String str2)
  {
      if( str1.length() > str2.length() ) return false;
      int i, j;
      for( i=0; i<=str2.length()-str1.length(); i++)
         {
            for( j=0; j<=str1.length()-1; j++)
                if( str1.charAt(j) != str2.charAt(i+j) ) break;
            if( j == str1.length() ) return true;
         }
      return false;
  }
}
