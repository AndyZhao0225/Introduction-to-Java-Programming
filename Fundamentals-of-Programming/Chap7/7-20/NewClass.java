import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      char[][] matrix = new char[6][7];
      for( int i=0; i<=5; i++)
          for( int j=0; j<=6; j++)
              matrix[i][j] = ' ';
      draw(matrix);
      int[] judgement = judge(matrix);
      char A ='X';
      for( int k=1; k<=42 && judgement[0]==0; k++)
         {
            boolean write = false; 
            System.out.print("Drop a "+A+" at column(0-6): ");
            int column = input.nextInt();
            if( column>6 || column<0 )
              {
                 System.out.println("Invalid input!"); 
                 k--;
                 continue;
              }
            for( int i=5; i>=0; i--)
               {
                  if( matrix[i][column] == ' ' ) 
                    {
                       matrix[i][column] = A;
                       write = true;
                       break;
                    }
               } 
            if( write == false )
              {
                 System.out.println("Invalid input!"); 
                 k--;
                 continue;
              }
            draw(matrix);
            if( A == 'X' ) A = 'O';
            else A = 'X';
            judgement = judge(matrix);
         }
      if( judgement[0] == 0 ) System.out.println("It's a tie");
      else 
        {
           if( A == 'X' ) A = 'O';
           else A = 'X';
           System.out.println("The "+A+" player won");
        }
  }   
    
    public static void draw(char[][] matrix)
  {
      for( int i=0; i<=5; i++)
         {
            for( int j=0; j<=6; j++)
                System.out.print("|"+matrix[i][j]);     
            System.out.println("|");
         }
      System.out.println("--------------------");
  }
    
    public static int[] judge(char[][] matrix)
  {
      int[] result = {0,0};
      
      for( int i=0; i<=5; i++)
         {
            for( int j=0; j<=3; j++)
               {
                  if( (matrix[i][j] == matrix[i][j+1]) && (matrix[i][j+1]==matrix[i][j+2]) && (matrix[i][j+2]==matrix[i][j+3]) 
                   && (matrix[i][j]!=' ') ) 
                    {
                       result[0] = 1;
                       if( matrix[i][j]=='X' ) result[1] = 1;
                       else result[1] = 0;
                       return result; 
                    }
               }  
         }
       
      for( int j=0; j<=6; j++)
         {
            for( int i=0; i<=2; i++)
               {
                  if( (matrix[i][j] == matrix[i+1][j]) && (matrix[i+1][j]==matrix[i+2][j]) && (matrix[i+2][j]==matrix[i+3][j]) 
                   && (matrix[i][j]!=' ') ) 
                    {
                       result[0] = 1;
                       if( matrix[i][j]=='X' ) result[1] = 1;
                       else result[1] = 0;
                       return result; 
                    }
               }
         }    
      
      for( int j=0; j<=3; j++)
         {
            for( int i=0; i<=2; i++)
               {
                  if( (matrix[i][j] == matrix[i+1][j+1]) && (matrix[i+1][j+1]==matrix[i+2][j+2]) && (matrix[i+2][j+2]==matrix[i+3][j+3]) 
                   && (matrix[i][j]!=' ') ) 
                    {
                       result[0] = 1;
                       if( matrix[i][j]=='X' ) result[1] = 1;
                       else result[1] = 0;
                       return result; 
                    } 
               } 
         }
      
      for( int j=3; j<=6;j++)
         {
            for( int i=0; i<=2; i++)
               {
                  if( (matrix[i][j] == matrix[i+1][j-1]) && (matrix[i+1][j-1]==matrix[i+2][j-2]) && (matrix[i+2][j-2]==matrix[i+3][j-3]) 
                   && (matrix[i][j]!=' ') ) 
                    {
                       result[0] = 1;
                       if( matrix[i][j]=='X' ) result[1] = 1;
                       else result[1] = 0;
                       return result; 
                    } 
               }  
         }
      return result;
  }
}
