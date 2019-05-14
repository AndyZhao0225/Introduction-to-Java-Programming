  public class Triangle extends GeometricObject1 
{
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle()
  {
      side1 = 1.0;
      side2 = 1.0;
      side3 = 1.0;
  }
    
    public Triangle( double side1, double side2, double side3) throws IllegalTriangleException
  {
      if( side1+side2<=side3 || side1+side3<=side2 || side2+side3<=side1 )
         throw new IllegalTriangleException();
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
  }
    
    public double getSide1()
  {
      return side1;
  }
    
    public double getSide2()
  {
      return side2;
  }
    
    public double getSide3()
  {
      return side3;
  }
    
    public double getArea()
  {
      double perimeter = side1 + side2 + side3;
      double p = perimeter / 2;
      return Math.sqrt( p * (p-side1) * (p-side2) * (p-side3) );
  }
    
    public double getPerimeter()
  {
      return side1 + side2 + side3;
  }
    
    public String toString()
  {
      return "Triangle: side1=" + side1 
                      +"side2=" + side2
                      +"side3=" + side3;
  }
}
