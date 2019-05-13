  public class Complex 
{
    private double a;
    private double b;
    
    public Complex()
  {
      a = 0;
      b = 0;
  }
    
    public Complex(double a)
  {
      this.a = a;
      b = 0;
  }
    
    public Complex(double a, double b)
  {
      this.a = a;
      this.b = b;
  }
    
    public double getRealPart()
  {
      return a;
  }
    
    public double getImaginaryPart()
  {
      return b;
  }
    
    public Complex add(Complex n)
  { 
      return new Complex( a+n.a, b+n.b );  
  }
    
    public Complex subtract(Complex n)
  { 
      return new Complex( a-n.a, b-n.b );  
  }
    
    public Complex multiply(Complex n)
  {
      double newA = a*n.a - b*n.b;
      double newB = b*n.a + a*n.b;
      return new Complex(newA,newB);
  }
    
    public Complex divide(Complex n)
  {
      double newA = ( a*n.a + b*n.b ) / ( n.a*n.a + n.b*n.b );
      double newB = ( b*n.a - a*n.b ) / ( n.a*n.a + n.b*n.b );
      return new Complex(newA,newB); 
  }
    
    public double abs()
  {
      return Math.sqrt( a*a + b*b );
  }
    
    public String toString()
  {
      if( b==0 ) return a+"";
      else return a + "" + "+" + b+"i";
  }
}
