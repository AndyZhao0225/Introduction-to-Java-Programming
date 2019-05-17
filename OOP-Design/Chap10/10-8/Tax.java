  public class Tax 
{
    private int filingStatus;
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int[][] brackets = 
                               {//2001
                                {0, 27050, 65550, 136750, 297350}, // Single filer
                                {0, 45200, 109250, 166500, 297350}, // married filing jointly
                                {0, 22600, 54625, 83250, 148675}, // married filing separately
                                {0, 36250, 93650, 151650, 297350} // head of household
                               };
    private double[] rates = {0.15, 0.275, 0.305, 0.355, 0.391}; //2001
    private double taxableIncome;
    
    public Tax()
  {
                 
  }
    
    public Tax( int filingStatus, int[][] brackets, double[] rates, double taxableIncome)
  {
      this.filingStatus = filingStatus;
      this.brackets = brackets;
      this.rates = rates;
      this.taxableIncome = taxableIncome;
  }
    
    public int getFilingStatus()
  {
      return filingStatus;
  }
    
    public void setFilingStatus(int newFilingStatus)
  {
      filingStatus = newFilingStatus;
  }
    
    public int[][] getBrackets()
  { 
      return brackets;  
  }
    
    public void setBrackets(int[][] newBrackets)
  {
      brackets = newBrackets;
  }
    
    public double[] getRates()
  {
      return rates;
  }
    
    public void setRates(double[] newRates)
  {
      rates = newRates;
  }
    
    public double getTaxableIncome()
  {
      return taxableIncome;
  }
    
    public void setTaxableIncome(double newTaxableIncome)
  {
      taxableIncome = newTaxableIncome;
  }
    
    public double getTax()
  {
      double tax = 0;
      boolean finish = false;
      for( int i=1; i<=5; i++)
         {
            if( taxableIncome < brackets[filingStatus][i] )
              {
                 tax += ( taxableIncome - brackets[filingStatus][i-1] ) * rates[i-1];
                 finish = true;
                 break; 
              } 
            tax += ( brackets[filingStatus][i] - brackets[filingStatus][i-1] ) * rates[i-1];
         }
      if( finish == false ) tax += ( taxableIncome - brackets[filingStatus][5] ) * rates[5];    
      return tax;
  }
}
