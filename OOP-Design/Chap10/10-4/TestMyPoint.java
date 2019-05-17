  public class TestMyPoint 
{
    public static void main(String[] args)
  {
      MyPoint p = new MyPoint();
      MyPoint p1 = new MyPoint(10,30.5);
      System.out.println(p.distance(p1));
      System.out.println(MyPoint.distance(p,p1));
  }    
}
