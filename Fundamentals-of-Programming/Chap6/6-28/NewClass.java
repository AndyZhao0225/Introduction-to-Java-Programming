import java.util.Scanner;

  public class NewClass
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int[] array = new int[10];
      System.out.println("Enter 10 numbers:");
      for( int i=0; i<=9; i++)
          array[i] = input.nextInt();
      display(array);   
  }   
    
    public static void display(int[] numbers)
  {
      int l = numbers.length;
      for( int i=0; i<l-1; i++)
         {
            for( int j=i+1; j<=l-1; j++)
               {
                  System.out.println(numbers[i]+" "+numbers[j]);
               }
         }
  }
}

