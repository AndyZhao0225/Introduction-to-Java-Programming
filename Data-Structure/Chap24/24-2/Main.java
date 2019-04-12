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
      mergeSort(list1);
      for( int i=0; i<=n-1; i++)
          System.out.print(list1[i] + " ");
      System.out.println("\n");
      
      System.out.print("Assign a size to another array: ");
      int m = input.nextInt();
      Integer[] list2 = new Integer[m];
      System.out.println("Enter the array: ");
      for( int i=0; i<=m-1; i++)
          list2[i] = input.nextInt();
      mergeSort(list2,new IntegerComparator());
      for( int i=0; i<=m-1; i++)
          System.out.print(list2[i] + " ");
      System.out.println();
  }   
    
    
    public static <E extends Comparable<E>> void mergeSort(E[] list)
  {
      if(list.length>1)
        {
           E[] firstHalf = (E[])new Comparable[list.length/2];
           System.arraycopy(list,0,firstHalf,0,list.length/2);
           mergeSort(firstHalf);
           
           int secondHalfLength = list.length - list.length/2;
           E[] secondHalf = (E[])new Comparable[secondHalfLength];
           System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
           mergeSort(secondHalf);
           
           E[] temp = merge(firstHalf,secondHalf);
           System.arraycopy(temp,0,list,0,temp.length);
        }
  }
    
    private static <E extends Comparable<E>> E[] merge(E[] list1, E[] list2)
  {
      E[] temp = (E[])new Comparable[list1.length+list2.length];
      int current1 = 0;
      int current2 = 0;
      int current3 = 0;
      
      while(current1<=list1.length-1 && current2<=list2.length-1)
           {
              if(list1[current1].compareTo(list2[current2])<0) temp[current3++] = list1[current1++];
              else temp[current3++] = list2[current2++];
           }
      
      while(current1<list1.length) 
            temp[current3++] = list1[current1++];
      
      while(current2<list2.length)
            temp[current3++] = list2[current2++];
      
      return temp;
  }
    
    
    public static <E> void mergeSort(E[] list, Comparator<? super E> comparator)
  {
      if(list.length>1)
        {
           E[] firstHalf = (E[])new Object[list.length/2];
           System.arraycopy(list,0,firstHalf,0,list.length/2);
           mergeSort(firstHalf,comparator);
           
           int secondHalfLength = list.length - list.length/2;
           E[] secondHalf = (E[])new Object[secondHalfLength];
           System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
           mergeSort(secondHalf,comparator);
           
           E[] temp = merge(firstHalf,secondHalf,comparator);
           System.arraycopy(temp,0,list,0,temp.length);
        }
  }
    
    private static <E> E[] merge(E[] list1, E[] list2, Comparator<? super E> comparator)
  {
      E[] temp = (E[])new Object[list1.length+list2.length];
      int current1 = 0;
      int current2 = 0;
      int current3 = 0;
      
      while(current1<=list1.length-1 && current2<=list2.length-1)
           {
              if(comparator.compare(list1[current1],list2[current2])<0) temp[current3++] = list1[current1++];
              else temp[current3++] = list2[current2++];
           }
      
      while(current1<list1.length) 
            temp[current3++] = list1[current1++];
      
      while(current2<list2.length)
            temp[current3++] = list2[current2++];
      
      return temp;
  }
}
