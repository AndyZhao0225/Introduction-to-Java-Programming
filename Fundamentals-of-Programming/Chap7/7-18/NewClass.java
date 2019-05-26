import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows of the 2-dimensional matrix you want to input: ");
      int numberOfRows = input.nextInt();
      int[][] m = new int[numberOfRows][2];
      System.out.println("Enter the matrix:");
      for( int i=0; i<=numberOfRows-1; i++)
         {
            m[i][0] = input.nextInt();
            m[i][1] = input.nextInt();
         }
      
      shuffle(m);
      
      System.out.println("After shuffling, the matrix became as follows:");
      PrintMatrix(m);
  }   
    
    public static void shuffle(int[][] m)
  {
      int[] temp = new int[2];
      for( int i=0; i<=m.length-1; i++)
         {
            int index = (int)(Math.random()*m.length);
            temp[0] = m[i][0];
            temp[1] = m[i][1];
            m[i][0] = m[index][0];
            m[i][1] = m[index][1];
            m[index][0] = temp[0];
            m[index][1] = temp[1];
         }
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
