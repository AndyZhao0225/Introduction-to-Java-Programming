  public class QuadraticEquation 
{
    private double a, b, c;
    
    QuadraticEquation(double A, double B, double C)
  {
      a = A;
      b = B;
      c = C;
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
    
    public double getDiscriminant()
  {
      return b*b-4*a*c;
  }
    
    public double getRoot1()
  {
      double disc = getDiscriminant();
      return (-b+Math.sqrt(disc))/2/a;
  }
    
    public double getRoot2()
  {
      double disc = getDiscriminant();
      return (-b-Math.sqrt(disc))/2/a;
  }
}
