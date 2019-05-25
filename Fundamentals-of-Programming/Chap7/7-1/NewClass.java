import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int[][] matrix = new int[4][4];
      System.out.println("Enter a 4-by-4 matrix row by row:");
      for( int i=0; i<=3; i++)
          for( int j=0; j<=3; j++)
              matrix[i][j] = input.nextInt();
      System.out.println("Sum of the matrix is "+sumMatrix(matrix));
  }   
    
    public static double sumMatrix(int[][] m)
  {
      double sum = 0;
      for( int i=0; i<=m.length-1; i++)
          for( int j=0; j<=m[i].length-1; j++)
              sum += m[i][j]; 
      return sum;
  }
}
