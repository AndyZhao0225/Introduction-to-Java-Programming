import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.println("Enter an int value, the program exits if the inout is 0: ");
      Scanner input=new Scanner(System.in);
      int positiveCount=0,negativeCount=0,number,total=0;
      do
        {
           number=input.nextInt();
           if(number>0)positiveCount++;
           if(number<0)negativeCount++;
           total+=number;
        }while(number!=0);
      double average=total*1.0/(positiveCount+negativeCount);
      System.out.println("The number of positives is "+positiveCount);
      System.out.println("The number of negatives is "+negativeCount);
      System.out.println("The total is "+total);
      System.out.println("The average is "+average);    
  }    
}
