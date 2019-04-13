import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string s1: ");
      String s1 = input.nextLine();
      System.out.print("Enter a string s2: ");
      String s2 = input.nextLine();
      if(match(s1,s2)<0) System.out.println("No match");
      else System.out.println("Mtched at index " + match(s1,s2));
  }    
    
    public static int match( String s1, String s2)
  {
      int l1 = s1.length();
      int l2 = s2.length();
      if(l2>l1) return -1;
      char s2CharStart = s2.charAt(0);
      for( int i=0; i<=l1-l2; i++)
         {
            if(s1.charAt(i)==s2CharStart) 
              {
                 int j;
                 for( j=1; j<=l2-1; j++)
                     if(s2.charAt(j)!=s1.charAt(i+j)) break;
                 if(j==l2) return i;
              }
         }
      return -1;
  }
}

//Time Complexity: O(n1*n2) = O(n*n)
