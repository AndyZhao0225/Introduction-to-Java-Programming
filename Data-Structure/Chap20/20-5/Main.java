import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int i = input.nextInt();
      
      System.out.println(m(i));
  }   
    
    public static double m(int i)
  {
      if(i==1) return 1.0/3;
      return 1.0*i/(2*i + 1) + m(i-1);
  }
}
