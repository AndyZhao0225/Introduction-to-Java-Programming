  public class ComputeTax 
{
    public static void main(String[] args)
  {
      System.out.println("Taxable         Single          Married         Married         Head of");
      System.out.println("Income                          Joint           Separate        a House");
      double taxableIncome=50000;
      for( ; taxableIncome<=60000; taxableIncome+=50)
         System.out.printf("%.0f\t\t%.0f\t\t%.0f\t\t%.0f\t\t%.0f\n",taxableIncome, computeTax(0,taxableIncome), computeTax(1,taxableIncome), computeTax(2,taxableIncome), computeTax(3,taxableIncome));
         
  } 
    
    public static double computeTax(int status, double taxableIncome)
  {
      if(status==0)  return 8350*0.1+(33950-8350)*0.15+(taxableIncome-33950)*0.25;  
      if(status==1)  return 16700*0.1+(taxableIncome-16700)*0.15;       
      if(status==2)  return 8350*0.1+(33950-8350)*0.15+(taxableIncome-33950)*0.25;
      if(status==3)  return 11950*0.1+(45500-11950)*0.15+(taxableIncome-45500)*0.25;
      return 0;
  }
}
