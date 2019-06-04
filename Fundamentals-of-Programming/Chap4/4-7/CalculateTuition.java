  public class CalculateTuition 
{
    public static void main(String[] args)
  {
      double tuition=10000;
      for(int year=0;year<=10;year++)tuition=tuition*(1+0.05);
      System.out.printf("The tuition after 10 years is $%.2f\n",tuition);
      double sum=0;
      for(int j=0;j<=4;j++)
         {
            tuition=tuition*(1+0.05);
            sum=sum+tuition;
         }  
      System.out.printf("The total tuition sum in 4 years after 10 years will be $%.2f\n",sum);
  }    
}
