  public class TestCircle2D 
{
    public static void main(String[] args)
  {
      Circle2D c1 = new Circle2D(2,2,5.5);
      System.out.println("c1's area: "+c1.getArea());
      System.out.println("c1's perimeter: "+c1.getPerimeter());
      System.out.println("Does c1 contain (3,3) ? "+c1.contains(3,3));
      System.out.println("Does c1 contain the circle (4,5) r=10.5 ? "+c1.contains(new Circle2D(4,5,10.5)));
      System.out.println("Does c1 overlap with the circle (3,5) r=2.3 ?"+c1.overlaps(new Circle2D(3,5,2.3)));
  }    
}
