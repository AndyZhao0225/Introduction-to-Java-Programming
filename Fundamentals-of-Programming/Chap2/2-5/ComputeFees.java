import java.util.Scanner;
        
  public class ComputeFees
{
     public static void main(String[] args)
   {
       double subtotal,gratuity,rate,total;
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the subtotal and a gratuity rate:");
       subtotal=input.nextDouble();
       rate=input.nextDouble()/100.0;
       gratuity=subtotal*rate;
       total=subtotal+gratuity;
       System.out.println("The gratuity is "+gratuity+" and total is "+total);
   }
}
