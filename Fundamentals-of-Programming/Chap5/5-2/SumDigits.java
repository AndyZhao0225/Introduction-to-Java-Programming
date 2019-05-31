import java.util.Scanner;

  public class SumDigits 
{
    public static int sumDigits(long n)
  {
      long digit,remaining=n;
      int sum=0;
      while(remaining != 0)
         {
            digit=remaining%10;
            remaining=remaining/10;
            sum+=digit;
         }
      return sum;
  }
    
    public static void main(String[] args)
  {
      System.out.print("Enter an integer: ");
      Scanner input=new Scanner(System.in);
      long number=input.nextLong();
      
      System.out.println("The sum of all the digits of the number is "+sumDigits(number));
  }    
}
