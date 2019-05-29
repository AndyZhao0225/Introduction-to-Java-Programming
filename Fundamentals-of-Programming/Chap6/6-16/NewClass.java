  public class NewClass 
{
    public static void main(String[] args)
  {
      int[] array = new int[100000];
      for( int i=0; i<=100000-1; i++)  array[i] = (int)(Math.random()*100000);
      int key = (int)(Math.random()*100000);
      long startTime = System.currentTimeMillis();
      System.out.println(LinearSearch.linearSearch(array, key));
      long endTime = System.currentTimeMillis();
      long executionTime = endTime - startTime;
      System.out.println("The execution time of linear search is "+executionTime/1000+"."+executionTime%1000+"s");
      
      java.util.Arrays.sort(array);
      startTime = System.currentTimeMillis();
      System.out.println(BinarySearch.binarySearch(array, key));
      endTime = System.currentTimeMillis();
      executionTime = endTime - startTime;
      System.out.println("The execution time of linear search is "+executionTime/1000+"."+executionTime%1000+"s");
  } 
}