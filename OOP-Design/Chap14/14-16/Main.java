import java.math.BigDecimal; 
        
  public class Main 
{
    public static void main(String[] args)
  {
      for( int i=100; i<=1000; i+=100)
          System.out.println(i + " : " + result(i));
  }   
    
    public static BigDecimal result(int i)
  {
      BigDecimal e = new BigDecimal("1");
      for( int j=1; j<=i; j++)
         {
            BigDecimal denominator = new BigDecimal("1");
            for( int k=1; k<=j; k++)
                denominator = denominator.multiply(new BigDecimal(k+""));
            BigDecimal item = (new BigDecimal("1")).divide(denominator,25,BigDecimal.ROUND_UP);
            e = e.add(item);
         }
      return e;
  }
}
