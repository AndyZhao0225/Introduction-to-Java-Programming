import java.util.Scanner;

  public class Reverse 
{
    public static void reverse(int number)
  {
      int remaining=number, reverse=0, digit=0, i;
      for(i=0; remaining!=0; i++)
         {
            digit=remaining%10;
            remaining=remaining/10;
         } 
      remaining=number;
      i--;
      for(int j=i; remaining!=0; j--)
         {
            digit=remaining%10;
            reverse=reverse+digit*(int)Math.pow(10,j);
            remaining=remaining/10;
         } 
      
      System.out.println(reverse);
  }
    
    public static void main(String[] args)
  {
      System.out.println("Enter an integer: ");
      Scanner input=new Scanner(System.in);
      int number=input.nextInt();
      
      reverse(number);
  }   
}
