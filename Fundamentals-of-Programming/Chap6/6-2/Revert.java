import java.util.Scanner;

  public class Revert 
{
    public static void main(String[] args)
  {
      Scanner input= new Scanner(System.in);
      System.out.println("Enter 10 numbers: ");
      int[] array=new int[10];
      for(int i=0; i<=9; i++)
         array[i]=input.nextInt();
      for(int j=9; j>=0; j--)
         System.out.print(array[j]+" ");
      System.out.println();  
  }    
}
