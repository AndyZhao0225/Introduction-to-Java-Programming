  public class TestRectangle 
{
    public static void main(String[] args)
  {
      Rectangle rec1 = new Rectangle(4,40);
      System.out.println("Rectangle1: ");
      System.out.println("Width: "+rec1.width);
      System.out.println("Height: "+rec1.height);
      System.out.println("Area: "+rec1.getArea());
      System.out.println("Perimeter: "+rec1.getPerimeter());
      
      System.out.println();
      
      Rectangle rec2 = new Rectangle(3.5,35.9);
      System.out.println("Rectangle2: ");
      System.out.println("Width: "+rec2.width);
      System.out.println("Height: "+rec2.height);
      System.out.println("Area: "+rec2.getArea());
      System.out.println("Perimeter: "+rec2.getPerimeter());
  }      
}

  class Rectangle
{
    double width = 1, height = 1;
    
    Rectangle()
  {
  
  } 
    
    Rectangle(double newWidth, double newHeight)
  {
      width = newWidth;
      height = newHeight;
  }
    
    double getArea()
  {
      return width*height;
  }
    
    double getPerimeter()
  {
      return 2 * ( width + height );
  }
}

