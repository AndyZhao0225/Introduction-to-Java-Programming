import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size for the matrix: ");
      int size = input.nextInt();
      int[][] matrix = new int[size][size];
      for( int i=0; i<=size-1; i++)
          for( int j=0; j<=size-1; j++)
              matrix[i][j] = (int)(Math.random()*2);
      
      PrintMatrix(matrix);
      find(matrix);
  }   
    
    public static void find(int[][] m)
  {
      boolean mark = true;
      boolean printHistory = false;
      for( int i=0; i<=m.length-1; i++)
         {
            for( int j=0; j<=m[i].length-2; j++)
               {
                  if( m[i][j] != m[i][j+1] ) 
                    {
                       mark = false;
                       break;
                    }  
               }
            if( mark == true)
              {
                 System.out.println("All "+m[i][0]+"s on row "+i);
                 printHistory = true;
              }
            mark = true; 
         }  
      if( printHistory == false ) System.out.println("No same numbers on any row");
      
      printHistory = false;
      for( int i=0; i<=m[0].length-1; i++)
         {
            for( int j=0; j<=m.length-2; j++)
               {
                  if( m[j][i] != m[j+1][i] ) 
                    {
                       mark = false;
                       break;
                    }  
               }
            if( mark == true) 
              {
                 System.out.println("All "+m[0][i]+"s on column "+i);
                 printHistory = true;
              }
            mark = true; 
         }  
      if( printHistory == false ) System.out.println("No same numbers on any column");
      
      for( int i=0; i<=m.length-2; i++)
         {
            if( m[i][i] != m[i+1][i+1] ) 
              {
                 mark = false;
                 break; 
              }
         }
      if( mark == true) System.out.println("All "+m[0][0]+"s on the major diagonal");
      else System.out.println("No same numbers on the major diagonal");
            
      mark = true;
      for( int i=0; i<=m.length-2; i++)
         {
            if( m[m.length-1-i][i] != m[m.length-1-i-1][i+1] ) 
              {
                 mark = false;
                 break; 
              }
         }
      if( mark == true) System.out.println("All "+m[0][m.length-1-0]+"s on the sub-diagonal");
      else System.out.println("No same numbers on the sub-diagonal");
  }
    
    public static void PrintMatrix(int[][] matrix)
  {
      for( int i=0; i<=matrix.length-1; i++)
         {
            for( int j=0; j<=matrix[0].length-1; j++)
                System.out.printf("%3d",matrix[i][j]);
            System.out.println();
         }
  }
}
