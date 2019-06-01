  public class NewClass 
{
    public static void main(String[] args)
  {
      int salesAmount=10000;
      System.out.println("sales_amount      commission ");
      for( ; salesAmount<=100000; salesAmount+=5000)
         {
             System.out.printf("%-6d            %.1f\n",salesAmount,computeCommission(salesAmount));
         }
  }    
    
    public static double computeCommission(double salesAmount)
  {
      if( salesAmount<=5000) return salesAmount*0.08;
      if( salesAmount>5000 && salesAmount<=10000) return salesAmount*0.1;
      return salesAmount*0.12;
  }
}
