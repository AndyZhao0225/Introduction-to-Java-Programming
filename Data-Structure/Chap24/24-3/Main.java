import java.util.Comparator;
import java.util.Scanner;

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
      quickSort(list1);
      for( int i=0; i<=n-1; i++)
          System.out.print(list1[i] + " ");
      System.out.println("\n");
      
      System.out.print("Assign a size to another array: ");
      int m = input.nextInt();
      Integer[] list2 = new Integer[m];
      System.out.println("Enter the array: ");
      for( int i=0; i<=m-1; i++)
          list2[i] = input.nextInt();
      quickSort(list2,new IntegerComparator());
      for( int i=0; i<=m-1; i++)
          System.out.print(list2[i] + " ");
      System.out.println();
  }   
    
    
    public static <E extends Comparable<E>> void quickSort(E[] list)
  {
      quickSort(list,0,list.length-1);    
  } 
    
    private static <E extends Comparable<E>> void quickSort(E[] list, int first, int last)
  {
      if(last>first)
        {
           int pivotIndex = partition(list,first,last);
           quickSort(list,first,pivotIndex-1);
           quickSort(list,pivotIndex+1,last);
        }
  }

    private static <E extends Comparable> int partition(E[] list, int first, int last)
  {
      E pivot = list[first];
      int low = first + 1;
      int high = last;
      
      while(high>low)
           {
              while(low<=high && list[low].compareTo(pivot)<=0)
                    low++;
              while(low<=high && list[high].compareTo(pivot)>0)
                    high--;
              if(high>low)
                {
                   E temp = list[high];
                   list[high] = list[low];
                   list[low] = temp;
                }
           }
      while(high>first && list[high].compareTo(pivot)>=0)
            high--;
      if(pivot.compareTo(list[high])>0)
        {
           list[first] = list[high];
           list[high] = pivot;
           return high;
        }
      else return first;
  } 
    
    
    public static <E> void quickSort(E[] list, Comparator<? super E> comparator)
  {
      quickSort(list,0,list.length-1,comparator);
  }
    
    private static <E> void quickSort(E[] list, int first, int last, Comparator<? super E> comparator)
  {
      if(last>first)
        {
           int pivotIndex = partition(list,first,last,comparator);
           quickSort(list,first,pivotIndex-1,comparator);
           quickSort(list,pivotIndex+1,last,comparator);
        }
  }

    private static <E> int partition(E[] list, int first, int last, Comparator<? super E> comparator)
  {
      E pivot = list[first];
      int low = first + 1;
      int high = last;
      
      while(high>low)
           {
              while(low<=high && comparator.compare(list[low],pivot)<=0)
                    low++;
              while(low<=high && comparator.compare(list[high],pivot)>0)
                    high--;
              if(high>low)
                {
                   E temp = list[high];
                   list[high] = list[low];
                   list[low] = temp;
                }
           }
      while(high>first && comparator.compare(list[high],pivot)>=0)
            high--;
      if(comparator.compare(pivot,list[high])>0)
        {
           list[first] = list[high];
           list[high] = pivot;
           return high;
        }
      else return first;
  } 
}
