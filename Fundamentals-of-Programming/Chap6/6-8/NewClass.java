import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double[] numbers = new double[10];
      System.out.println("Enter 10 numbers in double type: ");
      for( int i=0; i<numbers.length; i++)
         numbers[i]=input.nextDouble();
      System.out.print("The average is ");
      System.out.println( AverageClass.average(numbers) );
  }   
}
