import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      double[][] matrix1 = new double[3][3];
      System.out.println("Enter a 3*3 matrix1:");
      for( int i=0; i<=matrix1.length-1; i++)
          for( int j=0; j<=matrix1[i].length-1; j++)
              matrix1[i][j] = input.nextDouble();
      
      double[][] matrix2 = new double[3][3];
      System.out.println("Enter a 3*3 matrix2:");
      for( int i=0; i<=matrix2.length-1; i++)
          for( int j=0; j<=matrix2[i].length-1; j++)
              matrix2[i][j] = input.nextDouble();
              
      System.out.println("The matrices are multiplied as follows:");
      Print( matrix1, matrix2, multiplyMatrix(matrix1,matrix2));
  }    
    
    public static double[][] multiplyMatrix(double[][] a, double[][] b)
  {
      double[][] c = new double[a.length][b[0].length];
      for( int i=0; i<=a.length-1; i++)
          for( int j=0; j<=b[0].length-1; j++)
              for( int k=0; k<=a[0].length-1; k++) 
                  c[i][j] += a[i][k] * b[k][j];
      return c;
  }
    
    public static void Print(double[][] a, double[][] b, double[][] c)
  {
      for( int i=0; i<=a.length-1; i++)
         { 
            for( int j=0; j<=a[i].length-1; j++)
                System.out.printf("%-6.1f",a[i][j]);
            
            if( i == a.length/2 ) System.out.print("  *    ");
            else System.out.print("       ");
            
            for( int j=0; j<=a[i].length-1; j++)
                System.out.printf("%-6.1f",b[i][j]);
            
            if( i == a.length/2 ) System.out.print("  =    ");
            else System.out.print("       ");
            
             for( int j=0; j<=a[i].length-1; j++)
                System.out.printf("%-6.1f",c[i][j]);
             
            System.out.println();
         }
  }
}
