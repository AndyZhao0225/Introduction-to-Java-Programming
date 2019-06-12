import java.util.Scanner;

  public class Transform
{
    public static void main(String[] args)
  {
      int number;
      char letter;
      Scanner input=new Scanner(System.in);
      System.out.print("Enter an ASCII code:");
      number=input.nextInt();
      letter=(char)number;
      System.out.println("The character for ASCII code "+number+" is "+letter);
  }
}
