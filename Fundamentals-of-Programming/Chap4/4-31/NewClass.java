import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("Enter the initial deposit amount: ");
      Scanner input=new Scanner(System.in);
      double initialAmount=input.nextDouble();
      System.out.print("Enter annual percentage yield: ");
      double annualYield=input.nextDouble()/100.0;
      System.out.print("Enter maturity period (number of months): ");
      int maturity=input.nextInt();
      
      double monthYield=annualYield/12;
      double value=initialAmount;
      System.out.println("\nMonth       CD Value");
      for(int i=1;i<=maturity;i++)
         {
            value=value+value*monthYield;
            System.out.printf("%-2d          %.2f\n",i,value);
         }
  }   
}
