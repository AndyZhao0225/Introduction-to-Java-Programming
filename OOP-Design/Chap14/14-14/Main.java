import java.math.BigInteger;

  public class Main 
{
    public static void main(String[] args)
  {
      BigInteger bI = new BigInteger(Long.MAX_VALUE+"");
      int count = 0;
      while( count!=5 )
           {
              bI = bI.add(BigInteger.ONE);
              BigInteger half = bI.divide(new BigInteger("2"));
              boolean prime = true;
              BigInteger bJ = new BigInteger("2");
              while( bJ.compareTo(half)<=0 )
                   {
                      if( bI.remainder(bJ).equals(BigInteger.ZERO) )
                        {
                           prime = false;
                           break;
                        }
                      bJ = bJ.add(BigInteger.ONE);
                   }
              
              if( prime ) 
                {
                   System.out.println(bI);
                   count++;
                }
           }
  }    
}
