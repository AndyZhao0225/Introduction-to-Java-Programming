import java.util.Scanner;

  public class Pyramid 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      System.out.print("Enter the number of lines: ");
      int number=input.nextInt();
      for(int i=1;i<=number;i++)
        {
           for(int j=number-i;j>=1;j--)System.out.print("  ");
           if(number>9 && i<10)for(int l=number-9;l>=1;l--)System.out.print(" ");
           if(number>9 && i>=10)for(int m=number-i;m>=1;m--)System.out.print(" ");
           for(int k=i;k>1;k--)System.out.print(k+" ");
           for(int k=1;k<=i;k++)System.out.print(k+" ");
           if(number>9 && i<10)for(int l=number-9;l>=1;l--)System.out.print(" ");
           if(number>9 && i>=10)for(int m=number-i;m>=1;m--)System.out.print(" ");
           for(int j=number-i;j>=1;j--)System.out.print("  ");
           System.out.println();
        }
  }    
}
