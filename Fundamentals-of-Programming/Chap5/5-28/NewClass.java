  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.println("p           Math.pow(2,p)-1");
      for( int p=2; p<=31; p++ )
         {
            long n = (long)(Math.pow(2,p))-1;
            if(isPrime(n)) System.out.printf("%-2d          %-9d\n",p,n);              
         }
  }  
    
    public static boolean isPrime(long number)
  {
      for( int divisor=2; divisor<=number/2; divisor++)
         if(number%divisor==0) return false;
      return true;    
  }
}
