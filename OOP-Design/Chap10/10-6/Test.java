  public class Test 
{
    public static void main(String[] args)
  {
      StackOfIntegers stack = new StackOfIntegers();
      
      for( int n=2; n<120; n++)
          if(isPrime(n)) stack.push(n);     
      
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
