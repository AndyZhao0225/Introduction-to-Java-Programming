import java.util.Scanner;

  public class CramerPrinciple 
{
     public static void main(String[] args)
   {
       Scanner input=new Scanner(System.in);
       double a,b,c,d,e,f,x,y;
       System.out.print("Enter a,b,c,d,e,f: ");
       a=input.nextDouble();
       b=input.nextDouble();
       c=input.nextDouble();
       d=input.nextDouble();
       e=input.nextDouble();
       f=input.nextDouble();
       if(a*d-b*c==0)System.out.println("The equation has no solution");
       else
         {
            x=(e*d-b*f)/(a*d-b*c);
            y=(a*f-e*c)/(a*d-b*c);
            System.out.println("x is "+x+" and y is "+y);
         }
   } 
}