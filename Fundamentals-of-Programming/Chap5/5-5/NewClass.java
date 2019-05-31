import java.util.Scanner;

  public class NewClass 
{
    public static void displaySortedNumbers(double num1, double num2, double num3)
  {
      double small, middle, large;
      if(num1<num2 && num1<num3)
        {
           small=num1;
           if(num2<num3)
             {
               middle=num2;
               large=num3;
             }
           else
             {
               middle=num3;
               large=num2;
             } 
         }
      else if(num2<num1 && num2<num3)
        {
          small=num2;
          if(num1<num3)
            {
               middle=num1;
               large=num3;
            }
          else
            {
               middle=num3;
               large=num1;
            } 
         }
      else 
        {
           small=num3;
           if(num1<num2)
             {
               middle=num1;
               large=num2;
             }
           else
             {
               middle=num2;
               large=num1;
             } 
         }
    System.out.println(small+"  "+middle+"  "+large);
    return;
  }
    
    public static void main(String[] args)
  {
      System.out.print("Enter three numbers: ");
      Scanner input=new Scanner(System.in);
      double number1=input.nextDouble();
      double number2=input.nextDouble();
      double number3=input.nextDouble();
      displaySortedNumbers(number1, number2, number3);
  }    
}
 