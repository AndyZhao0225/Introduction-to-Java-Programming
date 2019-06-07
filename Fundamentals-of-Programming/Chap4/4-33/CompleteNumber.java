  public class CompleteNumber 
{
    public static void main(String[] args)
  {
      for(int n=2;n<10000;n++)
        {
           int sum=1;
           for(int i=2;i<=n/2;i++)if(n%i==0)sum=sum+i;
           if(n==sum)System.out.print(n+"  ");   
        }
      System.out.println();
  }    
}
