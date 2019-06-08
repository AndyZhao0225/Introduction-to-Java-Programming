import java.util.Scanner;

  public class CountMax 
{
    public static void main(String[] args)
  {
      System.out.print("Enter numbers: ");
      Scanner input=new Scanner(System.in);
      int max=0,count=0;
      int number;
      do 
         {
            number=input.nextInt(); 
            if(number>max)
              {
                 max=number;
                 count=1;
              }
            else if(number==max)count++;               
         }while(number!=0);  
      System.out.println("The largest number is "+max);
      System.out.println("The occurrence count of the largest number is "+count);
  }    
}
