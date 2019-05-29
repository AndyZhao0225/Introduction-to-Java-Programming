import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the integers between 1 and 100: ");
      int[] array = new int[101];
      int number;
      do
        {
           number = input.nextInt();
           array[number]++;
        }while( number!=0 );
      for( int i=1; i<=100; i++)
         {
            if(array[i]>0)
              {
                 System.out.print(i+" occurs "+array[i]+" time");
                 if(array[i]>1)System.out.print("s");
                 System.out.println();
              }
         }
  }   
}
