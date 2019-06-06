  public class NewClass 
{
    public static void main(String[] args)
  {
      int n;
      int i;
      for(n=10000;n<=100000;n+=10000)
        {
           double temp=0,p=0;
           int signal=1;
           for(i=1;i<=n+1;i++)
             {
                temp=temp+signal*1.0/(2*i-1);
                signal=signal*(-1);
             }
           p=temp*4;
           System.out.println(p);
        }
  }    
}
