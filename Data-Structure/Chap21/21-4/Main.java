  public class Main 
{
    public static void main(String[] args)
  {
      Integer[] integers = {2,4,37,1,5,3};
      insertionSort(integers);
      myPrint(integers);
      
      String[] str = {"zbc","zbd","zbdaa"};
      insertionSort(str);
      myPrint(str);
      
      Character[] ch = {'A','z','c','k','*'}; 
      insertionSort(ch);
      myPrint(ch);
      
      Double[] doubles = {2.01,3.87,10.25,4.30,10.01};
      insertionSort(doubles);
      myPrint(doubles);
  }
  
    public static <E> void myPrint(E[] list)
  {
      for( int i=0; i<=list.length-1; i++)
          System.out.print(list[i] + " ");
      System.out.println();
  } 

    public static <E extends Comparable<E>> void insertionSort(E[] list)
  {
      for( int i=1; i<=list.length-1; i++)
         {
            E currentElement = list[i]; 
            int k;
            for( k=i-1; k>=0 && list[k].compareTo(currentElement)>0; k--)
                list[k+1] = list[k];
            list[k+1] = currentElement;
         }
  }
}
