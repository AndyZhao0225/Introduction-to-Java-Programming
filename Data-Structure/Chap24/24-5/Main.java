import java.util.Scanner;
import java.util.Comparator;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Assign a size to the array: ");
      int n = input.nextInt();
      Integer[] list1 = new Integer[n];
      System.out.println("Enter the array: ");
      for( int i=0; i<=n-1; i++)
          list1[i] = input.nextInt();
      heapSort(list1);
      for( int i=0; i<=n-1; i++)
          System.out.print(list1[i] + " ");
      System.out.println("\n");
      
      System.out.print("Assign a size to another array: ");
      int m = input.nextInt();
      Integer[] list2 = new Integer[m];
      System.out.println("Enter the array: ");
      for( int i=0; i<=m-1; i++)
          list2[i] = input.nextInt();
      heapSort(list2,new IntegerComparator());
      for( int i=0; i<=m-1; i++)
          System.out.print(list2[i] + " ");
      System.out.println();
  }   
    
    public static <E extends Comparable<E>> void heapSort(E[] list)
  {
      Heap<E> heap = new Heap<E>();
      for( int i=0; i<=list.length-1; i++)
          heap.add(list[i]);
      for( int i=list.length-1; i>=0; i--)
          list[i] = heap.remove();
  }
    
    public static <E> void heapSort(E[] list, Comparator<? super E> comparator)
  {
      NewHeap<E> heap = new NewHeap<E>(comparator);
      for( int i=0; i<=list.length-1; i++)
          heap.add(list[i]);
      for( int i=list.length-1; i>=0; i--)
          list[i] = heap.remove();
  }
} 
