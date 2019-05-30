import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the size of the array: ");
      int size = input.nextInt();
      System.out.println("Enter the array: ");
      int[] array = new int[size];
      for( int i=0; i<=size-1; i++)
          array[i] = input.nextInt();
      if( isConsecutiveFour(array) )  System.out.println("The array contains four consecutive same numbers.");
      else System.out.println("The array doesn't contain four consecutive same numbers.");
  }   
    
    public static boolean isConsecutiveFour(int[] values)
  {
      if( values.length <4 ) return false;
      int count = 1;
      int i = 1; 
      while( i <= values.length-1)
           {
              if( values[i-1] == values[i] ) count++; 
              else count = 1;
              if( count == 4 ) return true;
              i++;
           }
      return false;
  }
}
