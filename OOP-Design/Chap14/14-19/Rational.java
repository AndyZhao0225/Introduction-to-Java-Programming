import java.math.BigInteger;
import java.math.BigDecimal;

  public class Rational extends Number implements Comparable 
{
    private BigInteger numerator;
    private BigInteger denominator;
    

    public Rational() 
  {
      this(BigInteger.ZERO,BigInteger.ONE);
  }

    public Rational(BigInteger numerator,BigInteger denominator)
  {
      BigInteger gcd = gcd(numerator,denominator);
      this.numerator = ( denominator.compareTo(BigInteger.ZERO)>0? BigInteger.ONE: new BigInteger("-1") )
                      .multiply(numerator).divide(gcd);
      this.denominator = denominator.abs().divide(gcd);
  }

    private static BigInteger gcd(BigInteger n,BigInteger d)
  {
      BigInteger n1 = n.abs();  
      BigInteger n2 = d.abs();
      BigInteger gcd = BigInteger.ONE;
      BigInteger k = BigInteger.ONE;
      
      for( ; k.compareTo(n1)<=0 && k.compareTo(n2)<=0; k=k.add(BigInteger.ONE)) 
          if( n1.remainder(k).equals(BigInteger.ZERO) && n2.remainder(k).equals(BigInteger.ZERO) ) gcd = k;
     
      return gcd;
  }

    public BigInteger getNumerator() 
  {
      return numerator;
  }

    public BigInteger getDenominator() 
  {
      return denominator;
  }

    public Rational add(Rational secondRational) 
  {
      BigInteger n = numerator.multiply(secondRational.getDenominator())
                     .add( (denominator).multiply(secondRational.getNumerator()) );
      BigInteger d = denominator.multiply(secondRational.getDenominator());
      return new Rational(n, d);
  }

    public Rational subtract(Rational secondRational)
  {
      BigInteger n = numerator.multiply(secondRational.getDenominator())
                     .subtract( (denominator).multiply(secondRational.getNumerator()) );
      BigInteger d = denominator.multiply(secondRational.getDenominator());
      return new Rational(n,d);
  }

    public Rational multiply(Rational secondRational) 
  {
      BigInteger n = numerator.multiply(secondRational.getNumerator());
      BigInteger d = denominator.multiply(secondRational.getDenominator());
      return new Rational(n,d);
  }

    public Rational divide(Rational secondRational) 
  {
      BigInteger n = numerator.multiply(secondRational.getDenominator());
      BigInteger d = denominator.multiply(secondRational.numerator);
      return new Rational(n,d);
  }

    public String toString() 
  {
      if( denominator.equals(BigInteger.ONE) ) return numerator + "";
      else return numerator + "/" + denominator;
  }
 
    public boolean equals(Object parm1) 
  {
      if( (this.subtract((Rational)(parm1))).getNumerator().equals(BigInteger.ZERO) ) return true;
      else return false;
  }

    public int intValue() 
  {
      return (int)doubleValue();
  }

    public float floatValue() 
  {
      return (float)doubleValue();
  }

    public double doubleValue() 
  {
      return numerator.doubleValue() / denominator.doubleValue();
  }

    public long longValue() 
  {
      return (long)doubleValue();
  }
   
    public int compareTo(Object o) 
  {
      if( (this.subtract((Rational)o)).getNumerator().compareTo(BigInteger.ZERO)>0 ) return 1;
      else if ( (this.subtract((Rational)o)).getNumerator().compareTo(BigInteger.ZERO)<0 ) return -1;
      else return 0;
 }
}
