  public class Circle extends GeometricObject 
{
    private double radius;

    public Circle() 
  {
    
  }

    public Circle(double radius) 
  {
      super();
      this.radius = radius;
  }

    public Circle(double radius, String color, boolean filled) 
  {
      super(color, filled);
      this.radius = radius;
  }

    public double getRadius() 
  {
      return radius;
  }

    public void setRadius(double radius) 
  {
      this.radius = radius;
  }

    public double getArea() 
  {
      return radius * radius * Math.PI;
  }
  
    public double getDiameter() 
  {
      return 2 * radius;
  }
  
    public double getPerimeter() 
  {
      return 2 * radius * Math.PI;
  }

    public void printCircle() 
  {
      System.out.println(toString() + "The circle is created " + getDateCreated() +
                         " and the radius is " + radius);
  }
  
    public String toString() 
  {
      return "Circle WWWW " + getColor() + super.toString();
  }
    
    public int compareTo(Object o)
  {
      if( getArea()>((Circle)o).getArea() ) return 1;
      else if( getArea()<((Circle)o).getArea() ) return -1;
      else return 0;
  }
}

