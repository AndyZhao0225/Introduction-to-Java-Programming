  public class TestRegularPolygon 
{
    public static void main(String[] args)
  {
      RegularPolygon polygon1 = new RegularPolygon();
      System.out.println("Regular Polygon1: ");
      System.out.println("Perimeter: "+polygon1.getPerimeter());
      System.out.printf("Area: %.2f\n",polygon1.getArea());
      
      RegularPolygon polygon2 = new RegularPolygon(6,4);
      System.out.println("\nRegular Polygon2: ");
      System.out.println("Perimeter: "+polygon2.getPerimeter());
      System.out.printf("Area: %.2f\n",polygon2.getArea());
      
      RegularPolygon polygon3 = new RegularPolygon(10,4,5.6,7.8);
      System.out.println("\nRegular Polygon3: ");
      System.out.println("Perimeter: "+polygon3.getPerimeter());
      System.out.printf("Area: %.2f\n",polygon3.getArea());
  }    
}
