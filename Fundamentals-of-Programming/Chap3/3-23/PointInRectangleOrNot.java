import java.util.Scanner;

  public class PointInRectangleOrNot 
{ 
    public static void main(String[] args)
  {
      System.out.print("Enter a point with two coordinates: ");
      Scanner input=new Scanner(System.in);
      double x=input.nextDouble();
      double y=input.nextDouble();
      double xrec=x,yrec=y;
      if(x<0)x=-x;
      if(y<0)y=-y;
      if((x<=5)&&(y<=2.5))System.out.println("Point ("+xrec+","+yrec+") is in the rectangle");
      else System.out.println("Point ("+xrec+","+yrec+") is not in the rectangle");
  }  
}
