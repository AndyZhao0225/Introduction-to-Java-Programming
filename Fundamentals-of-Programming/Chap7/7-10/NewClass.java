  public class NewClass 
{
    public static void main(String[] args)
  {
      int[][] chessboard = new int[3][3];
      for( int i=0; i<=2; i++)
          for( int j=0; j<=2; j++)
              chessboard[i][j] = (int)(Math.random()*2);
      PrintMatrix(chessboard);
      find(chessboard);
  }    
    
    public static void find(int[][] m)
  {
      for( int i=0; i<=2; i++)
         {
            if( m[i][0] == m[i][1] && m[i][1] == m[i][2] )
               System.out.println("All "+m[i][0]+"s on row "+i);
         }  
      
      for( int j=0; j<=2; j++)
         {
            if( m[0][j] == m[1][j] && m[1][j] == m[2][j] )
               System.out.println("All "+m[0][j]+"s on column "+j);
         }
      
      if( m[0][0] == m[1][1] && m[1][1] == m[2][2] )
         System.out.println("All "+m[1][1]+"s on diagonal");
      
      if( m[0][2] == m[1][1] && m[1][1] == m[2][0] )
         System.out.println("All "+m[1][1]+"s on sub-diagonal");
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
