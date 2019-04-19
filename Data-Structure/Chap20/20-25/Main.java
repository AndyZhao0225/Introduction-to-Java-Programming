import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      String s = input.next();
      displayPermuation(s);
  }   
    
    public static void displayPermuation(String s)
  {
      displayPermuation("",s);
  }
    
    public static void displayPermuation(String s1, String s2)
  {
      if(s2.isEmpty()) System.out.println(s1);
      for( int i=0; i<=s2.length()-1; i++)
         {
            String newS1 = s1 + s2.charAt(i);
            String newS2 = "";
            for( int j=0; j<=s2.length()-1; j++)
                if(j!=i) newS2 += s2.charAt(j);
            displayPermuation(newS1,newS2);
         }
  }
}
