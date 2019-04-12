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
      bubbleSort(list1);
      for( int i=0; i<=n-1; i++)
          System.out.print(list1[i] + " ");
      System.out.println("\n");
      
      System.out.print("Assign a size to another array: ");
      int m = input.nextInt();
      Integer[] list2 = new Integer[m];
      System.out.println("Enter the array: ");
      for( int i=0; i<=m-1; i++)
          list2[i] = input.nextInt();
      bubbleSort(list2,new IntegerComparator());
      for( int i=0; i<=m-1; i++)
          System.out.print(list2[i] + " ");
      System.out.println();
  }   
    
    public static <E extends Comparable<E>> void bubbleSort(E[] list)
  {   
      boolean needNextPass = true;
      
      for( int k=1; k<=list.length-1 && needNextPass; k++)
         {
            needNextPass = false;
            for( int i=0; i<list.length-k; i++)
               {
                  if(list[i].compareTo(list[i+1])>0)
                    {
                       E temp = list[i];
                       list[i] = list[i+1];
                       list[i+1] = temp;
                       
                       needNextPass = true;
                    }
               }
         }
  }
    
    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator)
  {
      boolean needNextPass = true;
      
      for( int k=1; k<=list.length-1 && needNextPass; k++)
         {
            needNextPass = false;
            for( int i=0; i<list.length-k; i++)
               {
                  if(comparator.compare(list[i],list[i+1])>0)
                    {
                       E temp = list[i];
                       list[i] = list[i+1];
                       list[i+1] = temp;
                       
                       needNextPass = true;
                    }
               }
         }
  }
}
