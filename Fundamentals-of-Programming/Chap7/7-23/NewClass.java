import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      double[][] A = new double[3][3];
      System.out.println("Enter a 3*3 matrix:");
      for( int i=0; i<=A.length-1; i++)
          for( int j=0; j<=A[0].length-1; j++)
              A[i][j] = input.nextDouble();
      double[][] inverseA = inverse(A);
      if( inverseA == null )
         System.out.println("There is no corresponding inverse matrix for your input.");
      else PrintMatrix(inverseA);
  } 
    
    public static double[][] inverse(double[][] A)
  {
      double[][] inverse = new double[3][3];
      double judgement = A[0][0]*A[1][1]*A[2][2] + A[2][0]*A[0][1]*A[1][2] + A[0][2]*A[1][0]*A[2][1] 
                       - A[0][2]*A[1][1]*A[2][0] - A[0][0]*A[1][2]*A[2][1] - A[2][2]*A[1][0]*A[0][1];
      if( judgement == 0 ) return null;
      double factor = 1.0 / judgement;
      inverse[0][0] = ( A[1][1]*A[2][2] - A[1][2]*A[2][1] ) * factor; 
      inverse[0][1] = ( A[0][2]*A[2][1] - A[0][1]*A[2][2] ) * factor; 
      inverse[0][2] = ( A[0][1]*A[1][2] - A[0][2]*A[1][1] ) * factor; 
      inverse[1][0] = ( A[1][2]*A[2][0] - A[1][0]*A[2][2] ) * factor; 
      inverse[1][1] = ( A[0][0]*A[2][2] - A[0][2]*A[2][0] ) * factor;
      inverse[1][2] = ( A[0][2]*A[1][0] - A[0][0]*A[1][2] ) * factor;
      inverse[2][0] = ( A[1][0]*A[2][1] - A[1][1]*A[2][0] ) * factor;
      inverse[2][1] = ( A[0][1]*A[2][0] - A[0][0]*A[2][1] ) * factor;
      inverse[2][2] = ( A[0][0]*A[1][1] - A[0][1]*A[1][0] ) * factor;
      return inverse;
  }
    
    public static void PrintMatrix(double[][] matrix)
  {
      for( int i=0; i<=matrix.length-1; i++)
         {
            for( int j=0; j<=matrix[0].length-1; j++)
                System.out.printf("%10.4f",matrix[i][j]);
            System.out.println();
         }
  }
}
