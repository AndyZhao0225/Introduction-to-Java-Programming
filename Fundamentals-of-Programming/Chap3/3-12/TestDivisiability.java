import java.util.Scanner;

  public class TestDivisiability 
{
     public static void main(String[] args)
  {
       Scanner input=new Scanner(System.in);
       int number;
       System.out.print("Please enter an integer: ");
       number=input.nextInt();
       if((number%5!=0&&number%6==0)||(number%5==0&&number%6!=0))System.out.println(number+" is divisible by 5 or 6, bu not both");
       if(number%5==0&&number%6==0)System.out.println(number+" is divisible by both 5 and 6");
       if(number%5!=0&&number%6!=0)System.out.println(number+" is not divisible by either 5 or 6");
  }
}
