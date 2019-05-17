import java.util.Scanner;

  public class TestTax 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      int[][] bracketsFor2001 = 
                                {
                                 {0, 27050, 65550, 136750, 297350}, // Single filer
                                 {0, 45200, 109250, 166500, 297350}, // married filing jointly
                                 {0, 22600, 54625, 83250, 148675}, // married filing separately
                                 {0, 36250, 93650, 151650, 297350} // head of household
                                };
      
      double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
      
      int[][] bracketsFor2009 = {
                                 {0, 8350, 33950, 82250, 171550, 372950}, // Single filer
                                 {0, 16700 , 67900, 137050, 208850, 372950}, // married filing jointly
                                 {0, 8350, 33950, 68525, 104425, 186475}, // married filing separately
                                 {0, 11950, 45500, 117450, 190200, 372950} // head of household
                                };
      
      double[] ratesFor2009 = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
      
      Tax tax2001 = new Tax();
      System.out.println("2001 Tax Table");
      System.out.println("Taxable income       Single              Married Joint       Married Seperate    Head of a house");
      for( double taxableIncome=50000; taxableIncome<=60000; taxableIncome+=1000)
         {
            tax2001.setTaxableIncome(taxableIncome);
            System.out.printf("%-21.0f",taxableIncome);
            for( int filingStatus=0; filingStatus<=3; filingStatus++)
               {
                  tax2001.setFilingStatus(filingStatus);
                  System.out.printf("%-20.2f",tax2001.getTax());
               } 
            System.out.println();
         }
      
      Tax tax2009 = new Tax(0,bracketsFor2009,ratesFor2009,50000);
      System.out.println("\n\n2009 Tax Table");
      System.out.println("Taxable income       Single              Married Joint       Married Seperate    Head of a house");
      for( double taxableIncome=50000; taxableIncome<=60000; taxableIncome+=1000)
         {
            tax2009.setTaxableIncome(taxableIncome);
            System.out.printf("%-21.0f",taxableIncome);
            for( int filingStatus=0; filingStatus<=3; filingStatus++)
               {
                  tax2009.setFilingStatus(filingStatus);
                  System.out.printf("%-20.2f",tax2009.getTax());
               } 
            System.out.println();
         }
  }    
}
