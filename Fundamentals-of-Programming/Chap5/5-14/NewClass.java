  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.println(" i        m(i)");
      for(int i=10; i<=100; i+=10) System.out.printf("%-3d       %.5f\n",i,m(i));         
  }
    
    public static double m(int i)
  {
      double factor=0;
      int k=1;
      for( int j=1; j<=2*i+1; j+=2)
         {
            factor = factor+ k*1.0/j;
            k= -1*k;
         }
      return 4*factor;
  }
}