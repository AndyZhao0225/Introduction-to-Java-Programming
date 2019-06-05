  public class NewClass 
{
    public static void main(String[] args)
  {
      for(int i=100,j=0;i<=200;i++)
         {
            if((i%5==0)^(i%6==0))
              {
                 System.out.print(i+" ");
                 j++;
              }
            if(j==10)
              {
                 System.out.println();
                 j=0;
              }
         } 
      System.out.println();
  }    
}
