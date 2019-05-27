import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      double[][] matrix = new double[2][2];
      System.out.println("Enter a 2*2 matrix:");
      for( int i=0; i<=matrix.length-1; i++)
          for( int j=0; j<=matrix[0].length-1; j++)
              matrix[i][j] = input.nextDouble();
      double[][] inverseMatrix = inverse(matrix);
      if( inverseMatrix == null ) System.out.println("The matrix has no corresponding inverse matrix.");
      else 
        {
           System.out.println("The inverse matrix is ");
           for( int i=0; i<=inverseMatrix.length-1; i++)
              {
                 for( int j=0; j<=inverseMatrix[0].length-1; j++)
                     System.out.printf("%6.2f",inverseMatrix[i][j]);
                 System.out.println();
              }
        }
  }   
    
    public static double[][] inverse(double[][] A)
  {
      double[][] inverseMatrix = new double[2][2];
      if( A[0][0]*A[1][1] - A[0][1]*A[1][0] == 0 )  return null;
      double factor = 1 / ( A[0][0]*A[1][1] - A[0][1]*A[1][0] );
      inverseMatrix[0][0] = A[1][1] * factor;
      inverseMatrix[0][1] = -A[0][1] * factor;
      inverseMatrix[1][0] = -A[1][0] * factor;
      inverseMatrix[1][1] = A[0][0] * factor;
      return inverseMatrix;
  }
}
