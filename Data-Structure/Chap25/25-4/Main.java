  public class Main 
{
    public static void main(String[] args)
  {
      GenericStack<Integer> stack = new GenericStack<Integer>();
      int primeCount = 0;
      int num = 2;
      while(primeCount<50)
           {
              if(isPrime(num))
                {
                   stack.push(num);
                   primeCount++;
                } 
              num++;
           }
      
      int i = 1;
      while(stack.getSize()>0)
           {
              System.out.printf("%5d",stack.pop());
              if(i%10==0) System.out.println();
              i++;
           }
  }   
    
    public static boolean isPrime(int num)
  {
      for( int i=2; i<=Math.sqrt(num); i++)
          if(num%i==0) return false;
      return true;
  }
}
