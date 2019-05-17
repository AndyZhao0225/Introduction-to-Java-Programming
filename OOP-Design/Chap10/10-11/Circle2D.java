  public class Circle2D 
{
    private double x;
    private double y;
    private double radius;
    
    public Circle2D()
  {
      x = 0;
      y=0;
      radius = 1;
  }
    
    public Circle2D( double x, double y, double radius)
  {
      this.x = x;
      this.y = y;
      this.radius = radius;
  }
    
    public double getX()
  {
      return x; 
  }
    
    public double getY()
  {
      return y;
  }
    
    public double getRadius()
  {
      return radius;
  }
    
    public double getArea()
  {
      return Math.PI*radius*radius;
  }
    
    public double getPerimeter()
  {
      return Math.PI*2*radius;
  }
    
    public boolean contains( double x, double y)
  {
      return (x-this.x)*(x-this.x) + (y-this.y)*(y-this.y) < radius*radius;
  }
    
    public boolean contains(Circle2D circle)
  {
      return Math.sqrt( (circle.x-x)*(circle.x-x) + (circle.y-y)*(circle.y-y) ) < radius - circle.radius;
  }
    
    public boolean overlaps(Circle2D circle)
  {
      double distance = Math.sqrt( (circle.x-x)*(circle.x-x) + (circle.y-y)*(circle.y-y) );
      return ( distance<radius+circle.radius ) && ( Math.abs( radius-circle.radius )<distance);
  }
}
