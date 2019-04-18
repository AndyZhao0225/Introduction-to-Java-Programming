import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int n = input.nextInt();
      System.out.println(fib(n));
  }   
    
    public static int fib(int n)
  {
      if(n==0) return 0;
      if(n==1) return 1;
      
      int f0 = 0;
      int f1 = 1;
      int currentFib = 0;
      for( int i=2; i<=n; i++)
         {
            currentFib = f0 + f1;
            f0 = f1;
            f1 = currentFib;
         }
      return currentFib;
  }
}
