  public class TestTriangle 
{
    public static void main(String[] args)
  {
      Triangle tri = new Triangle(1,1.5,1);
      tri.setColor("yellow");
      tri.setFilled(true);
      
      System.out.println("Triangle information:");
      System.out.println("Area: " + tri.getArea());
      System.out.println("Perimeter: " + tri.getPerimeter());
      System.out.println("color: " + tri.getColor());
      System.out.println("Filled: " + tri.isFilled());
  }    
}
