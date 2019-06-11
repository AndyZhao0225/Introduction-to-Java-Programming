import java.util.Scanner;

  public class TwoRectangles 
{
    public static void main(String[]args)
  {
      System.out.print("Enter r1's center x-, y-coordinates, width, and height: ");
      Scanner input=new Scanner(System.in);
      double x1=input.nextDouble();
      double y1=input.nextDouble();
      double w1=input.nextDouble();
      double h1=input.nextDouble();
      System.out.print("Enter r2's center x-, y-coordinates, width, and height: ");
      double x2=input.nextDouble();
      double y2=input.nextDouble();
      double w2=input.nextDouble();
      double h2=input.nextDouble();
      double right1=x1-w1/2.0;
      double left1=x1-w1/2.0;
      double upward1=y1+h1/2.0;
      double downward1=y1-h1/2.0;
      double right2=x2-w2/2.0;
      double left2=x2-w2/2.0;
      double upward2=y2+h2/2.0;
      double downward2=y2-h2/2.0;
      if(left2>=left1&&right2<=left2&&upward2<=upward1&&downward2>=downward1) 
        {
           System.out.println("r2 is inside r1");
           System.exit(0);
        }
      if(right2>=left1&&left2<=left1&&(upward2>=downward1||downward2<=upward1))
        {
           System.out.println("r2 overlaps r1");
           System.exit(0);
        }  
      if(left2<=right1&&right2>=right1&&(upward2>=downward1||downward2<=upward1))
        {
           System.out.println("r2 overlaps r1");
           System.exit(0);
        }
      if(upward2>=downward1&&downward2<=downward1&&(left2<=right1||right2>=left1))
        {
           System.out.println("r2 overlaps r1");
           System.exit(0);
        }
      if(downward2<=upward1&&upward2>=upward1&&(left2<=right1||right2>=left1))
        {
           System.out.println("r2 overlaps r1");
           System.exit(0);
        }
      System.out.println("r2 does not overlap r1");
  }    
}
