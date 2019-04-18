import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter two integers: ");
      int num1 = input.nextInt();
      int num2 = input.nextInt();
      
      System.out.println("The greatest commmon divider of them is " + gcd(num1,num2));
  }   
    
    public static int gcd(int m, int n)
  {
      if(m%n==0) return n;
      return gcd(n,m%n);
  }
}
