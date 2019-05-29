import java.util.Scanner;

  public class SelectionSort 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      double[] array = new double[10];
      System.out.println("Enter 10 numbers:");
      for( int i=0; i<=9; i++) array[i] = input.nextDouble();
      array = sort(array);
      System.out.println("After sorting: ");
      for( int i=0; i<=9; i++) System.out.printf("%-8.1f",array[i]);
      System.out.println();
  }
    
    public static double[] sort(double...array)
  {
      for( int i = array.length-1; i>0; i--)
         {
            double currentMax = array[i];
            int currentMaxIndex = i;
            
            for( int j = 0; j<i; j++)
               {
                  if(currentMax<array[j])
                    {
                       currentMax=array[j];
                       currentMaxIndex=j;
                    }
               }
            
            if( currentMaxIndex != i )
               {
                   array[currentMaxIndex] = array[i];
                   array[i] = currentMax;
               }
         }
      return array;
  }
}
