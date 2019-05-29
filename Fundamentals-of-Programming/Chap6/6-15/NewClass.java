import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter ten numbers:");
      int[] array = new int[10];
      for( int i = 0; i <= 9; i++)
          array[i] = input.nextInt();
      int[] result = eliminateDuplicates(array);
      System.out.println("The distinct numbers are:");
      for( int i = 0; i <= result.length - 1; i++)
          System.out.print(result[i]+" ");
      System.out.println();   
  }   
    
    public static int[] eliminateDuplicates(int[] numbers)
  {
      int l = numbers.length;
      int i=0;
      while( i < l-1 )
           {
              for( int j = i+1; j <= l-1; )
                 {
                    if( numbers[i] == numbers[j] )
                      {
                         for( int k=j+1; k<=l-1; k++)
                             numbers[k-1] = numbers[k]; 
                         l--;
                         continue;
                      } 
                    j++;
                 }
              i++;
           }
      
      int[] result = new int[l];
      for( int m=0; m<=l-1; m++)
          result[m] = numbers[m];    
      return result;
  }
}
