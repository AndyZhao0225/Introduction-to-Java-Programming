import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      int[] array = new int[100];
      for( int i=0; i<=100-1; i++)
          array[i] = (int)(Math.random()*100);
      
      Scanner input = new Scanner(System.in);
      System.out.print("Input an index for the array: ");
      int index = input.nextInt();
      
      try
        {
           System.out.println(array[index]);
        }
      catch(ArrayIndexOutOfBoundsException ex)
        {
           System.out.println("Out of Bounds");
        }
  }    
}
