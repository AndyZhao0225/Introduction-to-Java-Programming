import java.util.Scanner;

  public class ValidTriangle 
{
    public static void main(String[] args)
  {
     Scanner input=new Scanner(System.in);
     System.out.print("Enter three edges: ");
     double a,b,c;
     a=input.nextDouble();
     b=input.nextDouble();
     c=input.nextDouble();
     System.out.println("Can edges "+a+" , "+b+" , "+c+" form a triangle? "+((a+b>c)&&(a+c>b)&&(b+c>a)));
  }    
}
