import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows in a two-dimensional matrix: ");
      int numberOfRows = input.nextInt();
      int[][] array = new int[numberOfRows][2];
      System.out.println("Enter the "+numberOfRows+"*2 matrix:");
      for( int i=0; i<=array.length-1; i++)
          for( int j=0; j<=array[0].length-1; j++)
              array[i][j] = input.nextInt();
      
      System.out.println("After sorting, the matrix became ");
      sort(array);
      PrintMatrix(array);
  }   
    
    public static void sort(int m[][])
  {
      for( int i=m.length-1; i>=1; i--)
          for( int j=0; j<=i-1; j++)
              if( m[j][0] > m[j+1][0] ) swap(m,j,j+1);
      
      
      int endIndex;
      for( int i=0; i<=m.length-1; i++)
         {
            int mark = m[i][0];
            int startIndex = i;
            int j=i+1;
            for( ; j<=m.length-1; j++)
                if( m[j][0]  != mark ) break;
            endIndex = j - 1;
            subSort(m,startIndex,endIndex);
         }
  }
    
    public static void subSort(int m[][], int startIndex, int endIndex)
  {
      for( int i=startIndex; i<=endIndex; i++)
         { 
            int smallest = m[i][1];
            int smallestIndex = i;
            for( int j=i+1; j<=endIndex; j++) 
               {
                  if( m[j][1] < smallest )
                    {
                       smallest = m[j][1];
                       smallestIndex = j;
                    }
               }
            if( smallestIndex != i ) swap(m,i,smallestIndex);
         }
  }
    
    public static void swap(int m[][], int j, int k)
  {
      int[] temp = new int[2]; 
      temp[0] = m[j][0];
      temp[1] = m[j][1];
      m[j][0] = m[k][0];
      m[j][1] = m[k][1];
      m[k][0] = temp[0];
      m[k][1] = temp[1];      
  }
    
    public static void PrintMatrix(int[][] matrix)
  {
      for( int i=0; i<=matrix.length-1; i++)
         {
            for( int j=0; j<=matrix[0].length-1; j++)
                System.out.printf("%4d",matrix[i][j]);
            System.out.println();
         }
  }
}