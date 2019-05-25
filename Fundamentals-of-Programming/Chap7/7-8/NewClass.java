import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter the number of points: ");
      int numberOfPoints = input.nextInt();
      int[][] points = new int[numberOfPoints][2];
      System.out.println("Enter "+numberOfPoints+" points: ");
      for( int i=0; i<points.length; i++)
         {
            points[i][0] = input.nextInt();
            points[i][1] = input.nextInt();
         }     
      
      double shortestDistance = distance(points[0][0],points[0][1],points[1][0],points[1][1]);
      int numberOfPairs = numberOfPoints*(numberOfPoints-1)/2;
      int[][] record = new int[numberOfPairs][2]; 
      for( int m=0; m<=numberOfPairs-1; m++)
         {
            record[m][0] = -1;
            record[m][1] = -1;
         }
      int k = 0;
      record[k][0] = 0;
      record[k][1] = 1;
      k++;
      
      for(int i=0; i<points.length; i++) 
         {
            for(int j=i+1; j<points.length; j++) 
               {
                  double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]); 
                  if( shortestDistance == distance )
                    {
                       if( i==0 && j==1);
                       else
                         {
                            record[k][0] = i;
                            record[k][1] = j;   
                            k++;
                         } 
                    }
                  if( shortestDistance > distance ) 
                    {
                       for( int m=0; m<=numberOfPairs-1; m++)
                          {
                             record[m][0] = -1;
                             record[m][1] = -1;
                          }
                       k = 0;
                       record[k][0] = i;
                       record[k][1] = j;
                       k++; 
                       shortestDistance = distance;  
                    }
               }
          }
      
      for( int i=0; i<=k-1; i++)        
          System.out.println("("+points[record[i][0]][0]+","+points[record[i][0]][1]+") and ("
                                +points[record[i][1]][0]+","+points[record[i][1]][1]+")");
  }
    
    public static double distance(double x1, double y1, double x2, double y2)
  {
      return Math.sqrt( (x2-x1) * (x2-x1) + (y2-y1) * (y2-y1) );
  }
}
