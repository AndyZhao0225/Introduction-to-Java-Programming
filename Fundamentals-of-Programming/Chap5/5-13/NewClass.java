  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.println("i             m(i)");
      for( int i=1; i<=20; i++)
         System.out.printf("%-2d          %-7.4f\n",i,m(i));
  }   
    
    public static double m(int i)
  {
      double sum=0;
      for( int j=1; j<=i; j++)
          sum=sum+j*1.0/(j+1);
      return sum;
  }
}
