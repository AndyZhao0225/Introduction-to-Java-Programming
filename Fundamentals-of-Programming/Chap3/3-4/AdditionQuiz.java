import java.util.Scanner;

  public class AdditionQuiz 
{
     public static void main(String[] args)
  {
       Scanner input=new Scanner(System.in);
       int number1,number2,answer;
       number1=(int)(System.currentTimeMillis()%100);
       number2=(int)(System.currentTimeMillis()*13%100);
       System.out.print("What is "+number1+"+"+number2+" ? ");
       answer=input.nextInt();
       System.out.println(number1+"+"+number2+"="+answer+" is "+(number1+number2==answer));
   }
          
}
