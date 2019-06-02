  public class NewClass 
{
    public static void main(String[] args)
 {
      for( int i=2; i<=998;i++)
         {
            if(isPrime(i))
              {
                 if(isPrime(i+2)) System.out.println("("+i+","+(i+2)+")");
              }
         }    
 }  
   
    public static boolean isPrime(int number)
  {
      for( int divisor=2; divisor<=number/2; divisor++)
         if(number%divisor==0) return false;
      return true;    
  }
}
