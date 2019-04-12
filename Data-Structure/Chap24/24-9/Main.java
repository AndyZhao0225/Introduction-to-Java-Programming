import java.util.Comparator;
import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Assign a size to the array: ");
      int n = input.nextInt();
      Integer[] list = new Integer[n];
      System.out.println("Enter the array: ");
      for( int i=0; i<=n-1; i++)
          list[i] = input.nextInt();
      sort(list,new IntegerComparator());
      for( int i=0; i<=n-1; i++)
          System.out.print(list[i] + " ");
      System.out.println();
  }   
    
    public static <E> void sort(E[] list, Comparator<? super E> comparator)
  {
      Heap<E> heap = new Heap<E>(comparator);
      for( int i=0; i<=list.length-1; i++)
          heap.add(list[i]);
      for( int i=list.length-1; i>=0; i--)
          list[i] = heap.remove();
  }
}
