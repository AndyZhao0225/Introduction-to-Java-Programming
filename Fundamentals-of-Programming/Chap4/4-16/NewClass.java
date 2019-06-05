import java.util.Scanner;

  public class NewClass 
{
     public static void main(String[] args)
   {
       System.out.print("Enter an integer: ");
       Scanner input=new Scanner(System.in);
       int number=input.nextInt();
       System.out.print("The divisor of "+number+" are ");
       int divisor=2;
       while(divisor!=1)
          {
            if(number%divisor==0)
              {
                System.out.print(divisor+" ");
                number=number/divisor;
              }
            else 
              {
                divisor++;
                if(divisor>=(number/2))
                  {
                     divisor=1;
                     if(number!=1)System.out.print(number);
                  }
              }    
          }
       System.out.println();
   }    
}
