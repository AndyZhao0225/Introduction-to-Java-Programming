  public class Octagon extends GeometricObject implements Cloneable,Comparable 
{
    private double side;
    
    public Octagon()
  {
      side = 1;
  } 
    
    public Octagon(double newSide)
  {
      side = newSide;
  } 
    
    public double getArea()
  {
      return ( 2+4/Math.sqrt(2) ) * side * side;
  }
    
    public double getPerimeter()
  {
      return 8 * side;
  }
    
    public int compareTo(Object o)
  {
      if( getArea()>((Octagon)o).getArea() ) return 1;
      else if( getArea()<((Octagon)o).getArea() ) return -1;
      else return 0;
  }
    
    public Object clone() throws CloneNotSupportedException
  {
      return super.clone();
  }
}
