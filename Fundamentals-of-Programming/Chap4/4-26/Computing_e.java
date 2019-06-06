 public class Computing_e 
{
    public static void main(String[] args)
  {
      double e=1,item=1;
      final int endNumber=100000;
      for(int i=1;i<=endNumber;i++)
         {
            item=(1.0*item)/i; 
            e=e+item; 
            if(i%10000==0)System.out.println(e);
         }    
  }    
}
