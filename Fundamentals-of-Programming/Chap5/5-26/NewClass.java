  public class NewClass 
{
    public static void main(String[] args)
  {
      final int AMOUNT_OF_NUMBERS = 100; 
      final int NUMBERS_PER_LINE = 10;
      int count=0;
      int number=2;
      while(count < AMOUNT_OF_NUMBERS)
           {
              if( isPrime(number) && isPalindrome(number)) 
                {
                   System.out.printf("%6d    ",number);
                   count++;
                   if( count%10==0 ) System.out.println();
                }
              number++;
           }
  }    
    
    public static boolean isPrime(int number)
  {
      for( int divisor=2; divisor<=number/2; divisor++)
         if(number%divisor==0) return false;
      return true;    
  }
    
    public static int reverse(int number)
  {
      int reverse=0,remaining=number,i=0;
      while(remaining!=0)
          {
             remaining= remaining/10;
             i++;
          }
      remaining=number;
      for(int j=0; j<i; j++)
         {
             int digit= remaining%10;
             remaining= remaining/10;
             reverse= reverse+digit*(int)Math.pow(10,i-1-j);
         }
      return reverse;
  }
    
    public static boolean isPalindrome(int number)
  {
      return reverse(number)==number; 
  }
}
