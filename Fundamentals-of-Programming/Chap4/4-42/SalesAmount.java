import java.util.Scanner;

  public class SalesAmount 
{
    public static void main(String[] args)
  {
      double salesAmount=0;
      System.out.print("Enter the amount that you want to earn this year: ");
      Scanner input=new Scanner(System.in);
      double COMMISSION_SOUGHT=input.nextDouble();
      
      if(COMMISSION_SOUGHT<5000)
        {
           System.out.println("You can reach the goal just by basic salary.");
           System.exit(0);
        }
      if(COMMISSION_SOUGHT-5000<=5000*8/100.0) for(salesAmount=1; salesAmount*8/100.0<COMMISSION_SOUGHT-5000; salesAmount++);  
      if(COMMISSION_SOUGHT-5000<=10000*10/100.0 && COMMISSION_SOUGHT-5000>5000*8/100.0) for(salesAmount=5001; salesAmount*10/100.0<COMMISSION_SOUGHT-5000; salesAmount++);
      if(COMMISSION_SOUGHT-5000>10000*10/100.0) for(salesAmount=10001; salesAmount*12/100.0<COMMISSION_SOUGHT-5000; salesAmount++);
      System.out.printf("The amount that you should sell out is %.2f\n",salesAmount);  
  }    
}
