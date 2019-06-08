import java.util.Scanner;

  public class BitFormOfAnInteger 
{
    public static void main(String[] args)
  {
      System.out.print("Enter an integer: ");
      Scanner input=new Scanner(System.in);
      int number=input.nextInt();
      
      int mask=1;
      for(int i=15; i>=0; i--)
         {
            int temp=number>>i;
            System.out.print(temp&mask);
         }
      System.out.println();
  }    
}
