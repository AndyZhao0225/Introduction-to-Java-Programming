import java.util.Scanner;

  public class Test 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a positive integer: ");
      int number = input.nextInt();
      
      showPrimeFactor(number);
  }
    
    public static void showPrimeFactor(int number)
  {
      StackOfIntegers stack = new StackOfIntegers();
      
      int remaining = number;
      while( !isPrime(remaining) )
           {
              for( int divisor=2; divisor<=remaining/2; divisor++)
                  if( isPrime(divisor) && remaining%divisor==0 )
                    {
                       stack.push(divisor);
                       remaining /= divisor; 
                       break;
                    } 
           }
      stack.push(remaining); 
      
      while( !stack.empty() )
            System.out.println(stack.pop()); 
  }
    
    public static boolean isPrime(int number)
  {
      for( int divisor=2; divisor<=number/2; divisor++)
          if( number % divisor==0 ) return false;
      return true;   
  }
}
