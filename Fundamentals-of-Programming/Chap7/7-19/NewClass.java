import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows: ");
      int numberOfRows = input.nextInt();
      System.out.print("Enter the number of columns: ");
      int numberOfColumns = input.nextInt();
      int[][] matrix = new int[numberOfRows][numberOfColumns];
      System.out.println("Enter the matrix: ");
      for( int i=0; i<=numberOfRows-1; i++)
          for( int j=0; j<=numberOfColumns-1; j++)
              matrix[i][j] = input.nextInt();
      if(isConsecutiveFour(matrix)) System.out.println("The matrix has 4 consecutive numbers.");   
      else System.out.println("The matrix doesn't have 4 consecutive numbers.");
  }   
    
    public static boolean isConsecutiveFour(int[][] values)
  {
      if( values.length < 4 && values[0].length < 4 ) return false;
      
      for( int i=0; i<=values.length-1; i++)
         { 
            int mark = values[i][0]; 
            int count = 1;
            for( int j=1; j<=values[i].length-1; j++)
               {
                  if( values[i][j] == mark ) count++;
                  else
                    {
                       mark = values[i][j];
                       count = 1;
                    }
                  if( count >= 4 ) return true;
               }
         }
      
      for( int j=0; j<=values[0].length-1; j++)
         {
            int mark = values[0][j];
            int count = 1;
            for( int i=1; i<=values.length-1; i++)
               {
                  if( values[i][j] == mark ) count++;
                  else
                    {
                       mark = values[i][j];
                       count = 1;
                    }
                  if( count >= 4 ) return true;
               }
         }
      
      for( int j=3; j<=values[0].length-1; j++)
         {
            for( int i=0; i<=values.length-4; i++)
               {
                  int mark = values[i][j];
                  int recordI = i;
                  int recordJ = j;
                  boolean consecutive = true;
                  for( int k =1; k<=3; k++)
                     {
                        if( values[++i][--j] != mark )
                          {
                             consecutive = false; 
                             break;
                          }
                     } 
                  if( consecutive == true ) return true;
                  i = recordI;
                  j = recordJ;
               }     
         }
      
      for( int j=0; j<=values[0].length-4; j++)
         {
            for( int i=0; i<=values.length-4; i++)
               {
                  int mark = values[i][j];
                  int recordI = i;
                  int recordJ = j;
                  boolean consecutive = true;
                  for( int k =1; k<=3; k++)
                     {
                        if( values[++i][++j] != mark )
                          {
                             consecutive = false; 
                             break;
                          }
                     } 
                  if( consecutive == true ) return true;
                  i = recordI;
                  j = recordJ;
               }     
         }
      
      return false;
  }
}
