import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args) throws Exception
  {
      File file = new File("Exercise9_19.txt");
      
      PrintWriter output = new PrintWriter(file);
      for( int i=0; i<=99; i++)
         {
            int random = (int)( Math.random()*100 );
            output.print(random);
            output.print(' ');
         }  
      output.close();
      
      Scanner input = new Scanner(file);
      int[] array = new int[100];
      int i = 0;
      while( input.hasNext() )
           { 
              array[i] = input.nextInt();
              i++;
           }  
      sort(array);
      for( i=0; i<=99; i++)
          System.out.print(array[i]+" "); 
      System.out.println();   
      input.close();
      
  }    
    
    public static void sort(int[] array)
  {
      for( int i=array.length-1; i>=1; i--)
         {
            for( int j=0; j<=i-1; j++)
                if( array[j] > array[j+1] ) swap(j,j+1,array); 
         }  
  }
    
    public static void swap(int m, int n, int[] array)
  {
      int temp = array[m];
      array[m] = array[n];
      array[n] = temp;
  }  
}
