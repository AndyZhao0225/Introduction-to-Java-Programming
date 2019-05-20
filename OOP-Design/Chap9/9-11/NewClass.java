import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = input.nextLine();
      
      System.out.println(sort(str));
  }   
    
    public static String sort(String s)
  {
      StringBuilder strB = new StringBuilder(s);
      for( int i=strB.length()-1; i>=1; i--)
         {
            for( int j=0; j<=i-1; j++)
                if( strB.charAt(j) > strB.charAt(j+1) ) swap(j,j+1,strB);
         }
      return strB.toString();
  }
    
    public static void swap(int m, int n, StringBuilder strB)
  {
      char temp = strB.charAt(m);
      strB.setCharAt(m,strB.charAt(n));
      strB.setCharAt(n,temp);
  }
}
