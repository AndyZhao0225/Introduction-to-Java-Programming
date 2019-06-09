import java.util.Scanner;

  public class AdditionQuiz 
{
     public static void main(String[] args)
  {
       Scanner input=new Scanner(System.in);
       int number1,number2,answer;
       number1=(int)(Math.random()*100);
       number2=(int)(Math.random()*100);
       System.out.print("What is "+number1+"+"+number2+"? ");
       answer=input.nextInt();
       if(number1+number2==answer)System.out.println("You are correct!");
       else System.out.println("Your answer is wrong\n"
                               +number1+"+"+number2+" should be "+(number1+number2));
  }
}
