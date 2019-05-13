import java.math.BigInteger;

  public class Main 
{
    public static void main(String[] args)
  {
      BigInteger[] array = new BigInteger[10];
      int count = 0;
      BigInteger bI = new BigInteger(Long.MAX_VALUE+"");
      BigInteger bI5 = new BigInteger("5");
      BigInteger bI6 = new BigInteger("6");
      
      while(count<10)
           {
              bI = bI.add(new BigInteger("1"));
              BigInteger r1 = bI.remainder(bI5);
              BigInteger r2 = bI.remainder(bI6);
              if( r1.toString()=="0" || r2.toString()=="0" ) array[count++] = bI;
           }
      
      for( int i=0; i<=9; i++)
          System.out.println(array[i]);
  }    
}
