import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter string1 and string2: ");
      String str1 = input.nextLine();
      String str2 = input.nextLine();
      
      System.out.println((isAnagram(str1,str2)? "anagram": "not anagram"));
  }   
    
    public static boolean isAnagram(String s1, String s2)
  {
      if( s1.length() != s2.length() ) return false;
      int l = s2.length();
      boolean[] s2mark = new boolean[l];
      
      for( int i=0; i<=l-1; i++)
         {
            char ch = s1.charAt(i);
            boolean match = false;
            for( int j=0; j<=l-1; j++)
               {
                  if( !s2mark[j] )
                    {
                       if( s2.charAt(j) == ch )
                         {
                            match = true;
                            s2mark[j] = true;
                            break;
                         }
                    }
               }
            if( !match ) return false;
         }
      return true;
  }
}
