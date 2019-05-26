import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 0 and 511: ");
      int number = input.nextInt();
      
      int[] binary = transfer(number);
      int count = 0;
      for( int i=0; i<=8; i++)
         {
            if( binary[i] == 1 ) System.out.print("T  ");
            else System.out.print("H  ");
            count++;
            if( count%3 == 0 ) System.out.println();
         }
  }  
    
    public static int[] transfer(int number)
  {
      int[] binary = new int[9];
      int result = number;
      int i=8;
      while( result != 0 )
           {
              binary[i--] = result % 2;
              result = result / 2 ;
           }
      return binary;
  }
}
