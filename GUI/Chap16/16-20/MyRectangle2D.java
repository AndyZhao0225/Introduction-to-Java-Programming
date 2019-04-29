  public class MyRectangle2D 
{
    private double x;
    private double y;
    private double width;
    private double height;
    
    public MyRectangle2D( double x, double y, double width, double height)
  {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
  }
    
    public boolean contains( double x, double y)
  {
      return (this.x<x) && (x<this.x+width) && (this.y<y) && (y<this.y+height);
  }
}
