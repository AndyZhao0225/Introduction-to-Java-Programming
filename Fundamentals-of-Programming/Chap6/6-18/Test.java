import java.util.Scanner;

  public class Test 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      double[] first = BubbleSort.bubbleSort(6.0,4.4,1.9,2.9,3.4,2.9,3.5);
      for( int i=0; i<first.length; i++)
          System.out.print(first[i]+" ");
      System.out.println();
      
      double[] array = new double[10];
      System.out.println("Enter 10 numbers: ");
      for( int i=0; i<10; i++) 
          array[i] = input.nextDouble();
      array = BubbleSort.bubbleSort(array);
      System.out.println("After sorting, the array became ");
       for( int i=0; i<10; i++) 
          System.out.print(array[i]+"  ");
       System.out.println();
  }    
}
