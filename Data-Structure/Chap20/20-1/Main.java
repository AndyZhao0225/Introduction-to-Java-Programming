import java.util.Scanner;
import java.math.BigInteger;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      long n = input.nextLong();
      System.out.println(factorial(n));
  }    
    
    public static BigInteger factorial(long n)
  {
      if(n==1) return BigInteger.ONE;
      return (new BigInteger(n + "")).multiply(factorial(n-1));
  }
}
