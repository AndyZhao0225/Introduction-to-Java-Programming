import java.util.Scanner;

  public class ComputeRunway
{
    public static void main(String[] args)
  {
     double length,v,a; 
     Scanner input=new Scanner(System.in);
     System.out.print("Enter v and a:");
     v=input.nextDouble();
     a=input.nextDouble();
     length=v*v/2/a;
     System.out.println("The minimum runway length for this airplane is "+length);
  }
}
