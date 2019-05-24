import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of rows and columns of the array: ");
      int rows = input.nextInt();
      int columns = input.nextInt();
      double[][] array = new double[rows][columns];
      System.out.println("Enter the array: ");
      for( int i=0; i<=rows-1; i++)
          for( int j=0; j<=columns-1; j++)
              array[i][j] = input.nextDouble();
      
      Location location = locateLargest(array);
      
      System.out.println("The location of the largest element is "+location.getMaxValue()
                        +" at ("+location.getMaxRow()+","+location.getMaxColumn()+")");
  }  
    
    public static Location locateLargest(double[][] a)
  {
      Location location = new Location(a);
      return location;
  }
}
