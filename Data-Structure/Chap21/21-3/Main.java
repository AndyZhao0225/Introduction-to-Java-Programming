  public class Main 
{
    public static void main(String[] args)
  {
      Integer[] integers = {2,4,37,1,5,3};
      selectionSort(integers);
      myPrint(integers);
      
      String[] str = {"zbc","zbd","zbdaa"};
      selectionSort(str);
      myPrint(str);
      
      Character[] ch = {'A','z','c','k','*'}; 
      selectionSort(ch);
      myPrint(ch);
      
      Double[] doubles = {2.01,3.87,10.25,4.30,10.01};
      selectionSort(doubles);
      myPrint(doubles);
  }    
 
    public static <E> void myPrint(E[] list)
  {
      for( int i=0; i<=list.length-1; i++)
          System.out.print(list[i] + " ");
      System.out.println();
  } 
    
    public static <E extends Comparable<E>> void selectionSort(E[] list)
  {
      for( int i=0; i<=list.length-2; i++)
         {
            E currentMin = list[i];
            int currentMinIndex = i;
            for( int j=i+1; j<=list.length-1; j++)
               {
                  if( currentMin.compareTo(list[j])>0 )
                    {
                       currentMin = list[j];
                       currentMinIndex = j;
                    }
               }
            if( currentMinIndex!=i )
              {
                 list[currentMinIndex] = list[i];
                 list[i] = currentMin;
              }
         }
  }
}
