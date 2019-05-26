import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("(0-single filer, 1-married jointly.\n"+
                       "2-married separately, 3-head of household)\n"+
                       "Enter the filing status: ");
      int status = input.nextInt();
      System.out.print("Enter the taxable income: ");
      double income = input.nextDouble();
      System.out.println("Tax is "+(int)(tax(status,income)*100)/100.0);
  }   
    
    public static double tax(int status, double income)
  {
      double tax = 0;
      double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
      int[][] brackets = {
                            {0, 8350, 33950, 82250, 171550, 372950},
                            {0, 16700, 67900, 137050, 208850, 372950},
                            {0, 8350, 33950, 68525, 104425, 186475},
                            {0, 11950, 45500, 117450, 190200, 372950}
                         };
      boolean finish = false;
      for( int i=1; i<=5; i++)
         {
            if( income < brackets[status][i] )
              {
                 tax += ( income - brackets[status][i-1] ) * rates[i-1];
                 finish = true;
                 break; 
              } 
            tax += ( brackets[status][i] - brackets[status][i-1] ) * rates[i-1];
         }
      if( finish == false ) tax += ( income - brackets[status][5] ) * rates[5];    
      return tax;
  }   
}
