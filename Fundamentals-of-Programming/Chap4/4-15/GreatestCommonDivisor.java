import java.util.Scanner;

  public class GreatestCommonDivisor 
{
   public static void main(String[] args)
 {
     System.out.print("Enter two integers: ");
     Scanner input=new Scanner(System.in);
     int n1=input.nextInt();
     int n2=input.nextInt();
     int d=(n1<n2)?n1:n2;
     int gcd=1;
     for(int k=d;k>=1;k--)
        {
           if((n1%k==0)&&(n2%k==0))
             {
                gcd=k; 
                break;
             }
        }
     System.out.println("The greatest common divisor for "+n1+" and "+n2+" is "+gcd);
 }    
}
