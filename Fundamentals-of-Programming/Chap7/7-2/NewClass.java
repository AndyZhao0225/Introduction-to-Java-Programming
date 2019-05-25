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
      System.out.println("Sum of the element in the major diagonal is "+sumMajorDiagonal(matrix));
  }   
    
    public static int sumMajorDiagonal(int[][] m)
  {
      int sum = 0;
      for( int i=0; i<=m.length-1; i++)
          sum += m[i][i];
      return sum;
  }
}
