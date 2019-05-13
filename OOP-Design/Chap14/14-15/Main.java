import java.math.BigInteger;

  public class Main 
{
    public static void main(String[] args)
  {
      System.out.println("p            2^p - 1");
      for( int p=2; p<=100; p++)
         {
            BigInteger num = wrap(p);  
            if( isPrime(num) ) System.out.println(p+"            " + num);
         } 
  }    
    
    public static BigInteger wrap(int p)
  {
      BigInteger base = BigInteger.ONE;
      for( int i=1; i<=p; i++)
          base = base.multiply(new BigInteger("2"));
     
      return base.subtract(BigInteger.ONE);
  }
    
    public static boolean isPrime(BigInteger num)
  {
      BigInteger bI = new BigInteger("2");
      BigInteger benchmark = num.divide(new BigInteger("2"));
      
      for( ; bI.compareTo(benchmark)<=0; bI = bI.add(BigInteger.ONE))
          if( num.remainder(bI).equals(BigInteger.ZERO) ) return false;
               
      return true;
  }
}
