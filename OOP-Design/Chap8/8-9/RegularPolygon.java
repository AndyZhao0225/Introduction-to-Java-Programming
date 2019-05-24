  public class RegularPolygon 
{
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;
    
    RegularPolygon()
  {
  
  }
    
    RegularPolygon(int newN, double newSide)
  {
      n = newN;
      side = newSide;
  }
    
    RegularPolygon(int newN, double newSide, double X, double Y)
  {
      n = newN;
      side = newSide;
      x = X;
      y = Y;
  }
    
    public int getN()
  {
      return n;
  }
    
    public double getSide()
  {
      return side;
  }
    
    public double getX()
  {
      return x;
  }
    
    public double getY()
  {
      return y;
  }
    
    public void setN(int newN)
  {
      n = (newN>=3)? newN: n;
  }
    
    public void setSide(double newSide)
  {
      side = (newSide>0)? newSide: side;
  }
    
    public void setX(double newX)
  {
      x = newX;
  }
    
    public void setY(double newY)
  {
      y = newY;
  }
    
    public double getPerimeter()
  {
      return n*side;
  }
    
    public double getArea()
  {
      return n*side*side*Math.tan((n-2)*Math.PI/n/2)/2;
  }
}
