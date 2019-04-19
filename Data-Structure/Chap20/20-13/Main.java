import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a length for the array you want to input: ");
      int length = input.nextInt();
      int[] array = new int[length];
      System.out.println("Enter the array: ");
      for( int i=0; i<=length-1; i++)
          array[i] = input.nextInt();
      System.out.println(findLargest(array));
  }   
    
    public static int findLargest(int[] array)
  {
      return findLargest(array,0,Integer.MIN_VALUE);
  }
    
    public static int findLargest(int[] array, int index, int currentLargest)
  {
      if(index>=array.length) return currentLargest;
      if(array[index]>currentLargest) currentLargest = array[index];
      index++;
      return findLargest(array,index,currentLargest);
  }
}
