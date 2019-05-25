import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      double[][] a = new double[3][3];
      System.out.println("Enter a 3-by-3 matrix1 row by row:");
      for( int i=0; i<=a.length-1; i++)
          for( int j=0; j<=a[i].length-1; j++)
              a[i][j] = input.nextDouble();
      
      double[][] b = new double[3][3];
      System.out.println("Enter a 3-by-3 matrix2 row by row:");
      for( int i=0; i<=b.length-1; i++)
          for( int j=0; j<=b[i].length-1; j++)
              b[i][j] = input.nextDouble();
      
      System.out.println("The matrices are added as follows:");
      Print( a, b, addMatrix(a,b));
  }   
    
    public static double[][] addMatrix(double[][] a, double[][] b)
  {
      double[][] c = new double[a.length][a.length];
      for( int i=0; i<=a.length-1; i++)
         for( int j=0; j<=a[i].length-1; j++)
             c[i][j] = a[i][j] +b[i][j];
      return c;
  }
    
    public static void Print(double[][] a, double[][] b, double[][] c)
  {
      for( int i=0; i<=a.length-1; i++)
         { 
            for( int j=0; j<=a[i].length-1; j++)
                System.out.printf("%-6.1f",a[i][j]);
            
            if( i == a.length/2 ) System.out.print("  +    ");
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
