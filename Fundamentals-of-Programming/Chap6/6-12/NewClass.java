import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int[] array = new int[10];
      System.out.println("Enter 10 nintegers: ");
      for( int i=0; i<=9; i++)
          array[i] = input.nextInt();
      
      reverse(array);
      
      System.out.println("After reversion, the array became: ");
      for( int i=0; i<=9; i++)
          System.out.print(array[i]+" ");
      System.out.println();
  }   
    
    public static int[] reverse(int[] list)
  {
      for( int i=0; i<list.length/2; i++)
         {
            int temp = list[i];
            list[i] = list[list.length-1-i];
            list[list.length-1-i] = temp;
         }
      return list;
  }
}
