import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the number of rows and columns of the array:");
      int numberOfRows = input.nextInt();
      int numberOfColumns = input.nextInt();
      double[][] array = new double[numberOfRows][numberOfColumns];
      
      System.out.println("Enter the array");
      for( int i=0; i<=numberOfRows-1; i++)
          for( int j=0; j<=numberOfColumns-1; j++)
              array[i][j] = input.nextDouble();
      
      int[] answer = new int[2];
      answer = locateLargest(array);
      System.out.println("The location of the largest element is at ("+answer[0]+","+answer[1]+")");
  }   
    
    public static int[] locateLargest(double[][] a)
  {
      int[] answer = new int[2];
      answer[0] = 0;
      answer[1] = 0;
      double max = a[0][0];
      for( int i=0; i<=a.length-1; i++)
          for( int j=0; j<=a[0].length-1; j++)
              {
                 if( a[i][j] > max)
                   {
                      max = a[i][j];
                      answer[0] = i;
                      answer[1] = j;
                   }
              }
      return answer;
  }
}
