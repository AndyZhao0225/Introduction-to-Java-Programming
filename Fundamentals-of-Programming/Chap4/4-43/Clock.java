import java.util.Scanner;

  public class Clock 
{
    public static void main(String[] args)
  {
      System.out.print("Enter the number of seconds: ");
      Scanner input=new Scanner(System.in);
      int seconds=input.nextInt();
      for(int i=seconds;i>=1;i--)
         {
            long begin=System.currentTimeMillis(); 
            long past;
            do
              {
                 past=System.currentTimeMillis()-begin;
              }while(past/1000==0); 
            if(i>2)System.out.println((i-1)+" seconds remaining");
            if(i==2)System.out.println((i-1)+" second remaining");
            if(i==1)System.out.println("Stopped"); 
         }
  }   
}
