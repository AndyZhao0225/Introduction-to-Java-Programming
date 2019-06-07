  public class NewClass 
{
    public static void main(String[] args)
  {
      double salesAmount=10000,bonus=0;
      while(bonus<25000) 
         {
            salesAmount++; 
            bonus=salesAmount*12/100.0;   
         }
      System.out.printf("The minimum sales amount will be %.2f dollars\n",salesAmount);   
  }
}
