import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int[][] matrix = {{-1,-1,-1},{-1,-1,-1},{-1,-1,-1}};
      draw(matrix);
      int[] judgement = judge(matrix);
      char A = 'X';
      for( int i=1; i<=9 && judgement[1]==0; i++)
           {
              System.out.print("Enter a row(0,1 or 2) for player "+A+": ");
              int row = input.nextInt();
              System.out.print("Enter a column(0,1 or 2) for player "+A+": ");
              int column = input.nextInt();
              if( row>2 || row<0 || column>2 || column<0 )
                {
                   System.out.println("Invalid input!");
                   i--;
                   continue;
                }
              if( matrix[row][column] != -1 ) 
                {
                   System.out.println("Invalid input!");
                   i--;
                   continue;
                }
              if( A == 'X' ) matrix[row][column] = 1;
              else matrix[row][column] = 0;
              draw(matrix);
              judgement =judge(matrix);
              if( A == 'X' ) A= 'O';
              else A = 'X';
           }
      if( judgement[1] == 1 ) 
        {
           if( A == 'X' ) A= 'O';
           else A = 'X'; 
           System.out.println(A+" player won");
        }
      else System.out.println("It's a draw");
  }   
    
    public static void draw(int[][] matrix)
  {
      for( int i=0; i<=2; i++)
         {
            System.out.println("------------");
            for( int j=0; j<=2; j++)
               {
                  System.out.print("|");
                  switch(matrix[i][j])
                   {
                      case -1: System.out.print("   "); break;
                      case  0: System.out.print(" O "); break;
                      case  1: System.out.print(" X "); break;
                      default:;
                   }
               }
            System.out.print("|");
            System.out.println();
         }
      System.out.println("------------");
  }
    
    public static int[] judge(int[][] matrix)
  {
      int[] judge = {0,0};
      for( int i=0; i<=2; i++)
         {
            if( (matrix[i][0] == matrix[i][1]) && ( matrix[i][1] == matrix[i][2]) && (matrix[i][0] != -1) )
              {
                 judge[1] = 1;
                 if( matrix[i][0] == 1 ) judge[0] = 1;
                 else judge[0] = 0;
                 return judge;
              }
         }
      
      for( int j=0; j<=2; j++)
         {
            if( (matrix[0][j] == matrix[1][j]) && ( matrix[1][j] == matrix[2][j]) && (matrix[0][j] != -1) )
              {
                 judge[1] = 1;
                 if( matrix[0][j] == 1 ) judge[0] = 1;
                 else judge[0] = 0;
                 return judge;
              }
         }
      
      if( (matrix[0][0] == matrix[1][1]) && ( matrix[1][1] == matrix[2][2]) && (matrix[0][0] != -1) )
        {
           judge[1] = 1;
           if( matrix[0][0] == 1 ) judge[0] = 1;
           else judge[0] = 0;
           return judge;
        }
      
      if( (matrix[0][2] == matrix[1][1]) && ( matrix[1][1] == matrix[2][0]) && (matrix[0][2] != -1) )
        {
           judge[1] = 1;
           if( matrix[0][2] == 1 ) judge[0] = 1;
           else judge[0] = 0;
           return judge;
        }
      
      return judge;
  }
}
