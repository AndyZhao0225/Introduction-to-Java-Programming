  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("Enter an integer: ");
      java.util.Scanner input = new java.util.Scanner(System.in);
      int n=input.nextInt();
      
      displayPattern(n);
  }   
    
    public static void displayPattern(int n)
  {
      for( int i=1; i<=n; i++)
         {
            for( int j=1; j<=n-i; j++)  System.out.print("    ");
            for( int k=i; k>=1; k--) System.out.printf("%2d  ",k);
            System.out.println();
         }
  }
}
