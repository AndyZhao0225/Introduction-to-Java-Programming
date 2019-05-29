import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int[] array = new int[5];
      System.out.println("Enter 5 numbers: ");
      for( int i=0; i<=4; i++)
          array[i] = input.nextInt();
         
      System.out.println("The greatest common divisor of these numbers is "+gcd(array));
  } 
    
    public static int gcd(int...numbers)
  {
      if( numbers.length==1 ) return 1;
      int gcd = gcdForTwoNumbers( numbers[0], numbers[1]);
      if( numbers.length==2 ) return gcd;
      for( int i=2; i<numbers.length; i++)
          gcd = gcdForTwoNumbers( gcd, numbers[i]);   
      return gcd;
  }
    
    public static int gcdForTwoNumbers(int num1, int num2)
  {  
      int gcd=1;
      int k = 2;
      while( k<=num1 && k<=num2)
           {
              if( num1%k==0 && num2%k==0) gcd=k;
              k++;
           }
      return gcd;
  }
}
