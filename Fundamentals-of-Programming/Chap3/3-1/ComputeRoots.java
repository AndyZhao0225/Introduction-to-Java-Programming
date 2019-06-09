import java.util.Scanner;

  public class ComputeRoots 
{
     public static void main(String[] args)
  {
       Scanner input=new Scanner(System.in);
       double a,b,c,root1,root2,judgement;
       System.out.print("Enter a,b,c: ");
       a=input.nextDouble();
       b=input.nextDouble();
       c=input.nextDouble();
       judgement=b*b-4*a*c;
       if(judgement<0)System.out.println("The equation has no real roots");
       else if(judgement==0)
              {
                 root1=-b/(2*a);
                 root1=(int)(root1*1000000)/1000000.0;
                 System.out.println("The root is "+root1);
              }
       else 
         {
            root1=(-b+Math.pow(judgement,0.5))/(2*a);
            root2=(-b-Math.pow(judgement,0.5))/(2*a);
            root1=(int)(root1*1000000)/1000000.0;
            root2=(int)(root2*1000000)/1000000.0;
            System.out.println("The roots are "+root1+" and "+root2);
         }  
  }
}
