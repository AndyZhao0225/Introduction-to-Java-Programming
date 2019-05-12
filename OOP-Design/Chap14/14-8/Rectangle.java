  public class Rectangle extends GeometricObject implements Comparable
{
    private double width;
    private double height;

    public Rectangle() 
  {
      
  }

    public Rectangle(double width, double height) 
  {
      this.width = width;
      this.height = height;
  }

    public double getWidth() 
  {
      return width;
  }

    public void setWidth(double width) 
  {
      this.width = width;
  }

    public double getHeight() 
  {
      return height;
  }

    public void setHeight(double height)
  {
      this.height = height;
  }

    public double getArea() 
  {
      return width * height;
  }

    public double getPerimeter() 
  {
      return 2 * (width + height);
  }
    
    public int compareTo(Object o)
  {
      if( getArea()>((Rectangle)o).getArea() ) return 1;
      else if( getArea()<((Rectangle)o).getArea() ) return -1;
      else return 0;
  }
    
    public boolean equals(Object o)
  {
      if( width==((Rectangle)o).width && height==((Rectangle)o).height 
       || width==((Rectangle)o).height && height==((Rectangle)o).width ) return true;
      else return false;
  }
}


