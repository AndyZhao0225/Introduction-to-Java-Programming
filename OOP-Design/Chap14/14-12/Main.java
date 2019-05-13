import java.math.BigInteger;

  public class Main 
{
    public static void main(String[] args)
  { 
      BigInteger start = new BigInteger("10000000000000000000000000000000000000000000000000");
      int count = 0;
      BigInteger bI = start;
      BigInteger bI2 = new BigInteger("2");
      BigInteger bI3 = new BigInteger("3");
      while(count!=10)
           {
              BigInteger r1 = bI.remainder(bI2);
              BigInteger r2 = bI.remainder(bI3);
              if( r1.toString()=="0" || r2.toString()=="0" ) 
                {
                   System.out.println(bI);
                   count++; 
                }
              bI = bI.add(new BigInteger("1"));
           }
  }    
}
