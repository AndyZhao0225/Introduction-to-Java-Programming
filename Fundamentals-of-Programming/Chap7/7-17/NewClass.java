import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of banks: ");
      int numberOfBanks = input.nextInt();
      System.out.print("Enter the safe limit amount: ");
      double limit = input.nextDouble();
      double[] banks = new double[numberOfBanks];
      System.out.println("Enter each bank's current amount: ");
      for( int i=0; i<=numberOfBanks-1; i++)
          banks[i] = input.nextDouble(); 
      double[][] loan = new double[numberOfBanks][numberOfBanks];
      System.out.println("Enter the loan situation:");
      for( int i=0; i<=numberOfBanks-1; i++)
          for( int j=0; j<=numberOfBanks-1; j++)
              loan[i][j] = input.nextDouble();
      
      safe(banks,loan,limit,numberOfBanks); 
  }   
    
    public static void safe(double[] banks, double[][] loan, double limit, int numberOfBanks)
  {
      boolean[] safe = new boolean[numberOfBanks];
      for( int i=0; i<=numberOfBanks-1; i++)
          safe[i] = true; 
      boolean unsafeAppear = true;
      
      while( unsafeAppear )
           {
              unsafeAppear = false; 
              for( int i=0; i<=numberOfBanks-1; i++)     
                 {
                    if(safe[i])
                      {
                         double sum = banks[i];  
                         for( int j=0; j<=numberOfBanks-1; j++)
                             sum += loan[i][j];
                         if( sum < limit )
                           {
                              safe[i] = false;
                              for( int k =0; k<=numberOfBanks-1; k++)
                                  loan[k][i] = 0;
                              unsafeAppear = true;
                           }
                      }  
                 }
           }
      
      int unsafeCount=0;
      for( int i=0; i<=numberOfBanks-1; i++)
          if(!safe[i]) unsafeCount++;
      if( unsafeCount >= 2 )
        {
           System.out.print("Unsafe banks are ");
           for( int i=0; i<=numberOfBanks-1; i++)
               if(!safe[i]) System.out.print(i+" "); 
        }
      else if( unsafeCount == 1 )
             {
                System.out.print("Unsafe banks are ");
                for( int i=0; i<=numberOfBanks-1; i++)
                    if(!safe[i]) System.out.print(i); 
             }
      else
        {
           System.out.println("All banks are safe"); 
        }
      System.out.println();
  }
}
