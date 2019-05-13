import java.math.BigInteger;

  public class Main 
{
    public static void main(String[] args)
  {
      BigInteger bI = new BigInteger(Long.MAX_VALUE+"");
      BigInteger rootStart = new BigInteger((long)Math.sqrt(Long.MAX_VALUE)+"");
      
      int count = 0;
      while(count!=10)
           {
              bI = bI.add(BigInteger.ONE);
              BigInteger bJ = rootStart;
              BigInteger square = rootStart.multiply(rootStart);
              BigInteger benchmark = bI.divide(rootStart);
              while( bJ.compareTo(benchmark)<0 && square.compareTo(bI)<=0 )
                   { 
                      bJ = bJ.add(BigInteger.ONE);
                      square = bJ.multiply(bJ);
                      if( bI.equals(square) )
                        {
                           System.out.println(bI);
                           count++;
                           break;
                        }
                   }
           }
  }
}
