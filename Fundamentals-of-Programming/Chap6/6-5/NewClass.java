import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int[] array = new int[10];
      System.out.println("Enter 10 numbers:");
      int number;
      int count=0;
      for( int i=0; i<=9; i++)
         {
            number = input.nextInt();
            if( count == 0 ) 
              {
                 array[count] = number;
                 count++;
              }
            else 
              {
                 boolean equal=false;
                 for( int j=0; j<count; j++)
                    if( array[j]==number ) equal=true;
                 if( ! equal ) 
                   {
                      array[count] = number;
                      count++;
                   }   
              }
         }
      
      for( int i=0; i<count; i++)
         System.out.print(array[i]+" ");
      System.out.println();
  }    
}
