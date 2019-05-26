import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  { 
      Scanner input = new Scanner(System.in);
      System.out.print("Enter how many points you want to input: ");
      int numberOfPoints = input.nextInt();
      
      if( numberOfPoints < 3 ) 
        {
           System.out.println("Invalid input!");
           return;
        }
      
      
      double[][] points = new double[numberOfPoints][2];
      System.out.println("Enter these points: ");
      for( int i=0; i<=numberOfPoints-1; i++)
         {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
         } 
      if(judgeLinear(points)) System.out.println("These points are in the same line.");
      else System.out.println("These points are not in the same line");
      
  }    
    
    public static boolean judgeLinear(double[][] points)
  { 
      double x1 = points[0][0];
      double y1 = points[0][1];
      double x2 = points[1][0];
      double y2 = points[1][1];
      
      if( x2 == x1 )
        {
           for( int i=2; i<=points.length-1; i++)
              {
                 double x = points[i][0];
                 if( x != x1 ) return false;
              }  
        }
      else 
        {
           double k = ( y2 - y1 ) / ( x2 - x1 );
           double b = y1 - k*x1;
           
           for( int i=2; i<=points.length-1; i++)
              {
                 double x = points[i][0];
                 double y = points[i][1];
                 if( y != k*x+b ) return false;
              }
        }
      return true;
  }
}
