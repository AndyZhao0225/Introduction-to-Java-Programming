  public class MyPoint 
{
    private double x;
    private double y;
    
    public MyPoint()
  {
      x = 0;
      y = 0;
  }
    
    public MyPoint( double x, double y)
  {
      this.x = x;
      this.y = y;
  }
    
    public double getX()
  {
      return x;
  }
    
    public double getY()
  {
      return y;
  }
    
    public double distance( MyPoint p1)
  {
      return Math.sqrt( (x-p1.x)*(x-p1.x) + (y-p1.y)*(y-p1.y) ); 
  }
    
    public static double distance( MyPoint p, MyPoint p1)
  {
      return Math.sqrt( (p.x-p1.x)*(p.x-p1.x) + (p.y-p1.y)*(p.y-p1.y) ); 
  }
}
