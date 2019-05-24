  public class LinearEquation 
{
    private double a,b,c,d,e,f;
    
    LinearEquation(double A, double B, double C, double D, double E, double F)
  {
      a = A;
      b = B;
      c = C;
      d = D;
      e = E;
      f = F;
  }
    
    public double getA()
  {
      return a;
  }
    
    public double getB()
  {
      return b;
  }
    
    public double getC()
  {
      return c;
  }
    
    public double getD()
  {
      return d;
  }
    
    public double getE()
  {
      return e;
  }
    
    public double getF()
  {
      return f;
  }
    
    public boolean isSolvable()
  {
      if( (a*d-b*c) != 0 ) return true;
      else return false;
  }
    
    public double getX()
  {
      return (e*d-b*f)/(a*d-b*c);
  }
    
    public double getY()
  {
      return (a*f-e*c)/(a*d-b*c);
  }
}
