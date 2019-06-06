  public class NewClass 
{
    public static void main(String[] args)
  {
      final int N=50000;
      double sum=0;
      for(int i=1;i<=N;i++)sum=sum+1.0/i;
      System.out.println(sum);
      sum=0;
      for(int i=N;i>=1;i--)sum=sum+1.0/i;
      System.out.println(sum);
  }    
}
