import java.util.Scanner;

  public class AdditionQuiz 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      int number1,number2,number3,answer;
      number1=(int)(System.currentTimeMillis()%10);
      number2=(int)(System.currentTimeMillis()*7%10);
      number3=(int)(System.currentTimeMillis()*9%10);
      System.out.print("What is "+number1+"+"+number2+"+"+number3+" ? ");
      answer=input.nextInt();
      System.out.println(number1+"+"+number2+"+"+number3+"="+answer+" is "+(number1+number2+number3==answer));
  }    
}
