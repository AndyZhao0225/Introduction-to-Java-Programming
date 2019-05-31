import java.util.Scanner;

  public class Palindrome 
{
    public static int reverse(int number)
  {
      int reverse=0,remaining=number,i=0;
      while(remaining!=0)
          {
             remaining= remaining/10;
             i++;
          }
      remaining=number;
      for(int j=0; j<i; j++)
         {
             int digit= remaining%10;
             remaining= remaining/10;
             reverse= reverse+digit*(int)Math.pow(10,i-1-j);
         }
      return reverse;
  }
    
    public static boolean isPalindrome(int number)
  {
      return reverse(number)==number; 
  }
      
    public static void main(String[] args)
  {
      System.out.print("Enter an integer: ");
      Scanner input=new Scanner(System.in);
      int number=input.nextInt();
      
      if(isPalindrome(number))System.out.println("Yes, it is a palindrome.");
      else System.out.println("No, it isn't a palindrome.");
  }    
}
