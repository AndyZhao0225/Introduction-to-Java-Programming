  public class NewClass 
{
    public static void main(String[] args)
  {
      for(int i=1;i<=8;i++)
         {
           for(int j=8-i;j>=1;j--)System.out.print("    ");
           for(int k=i;k>1;k--)System.out.printf("%4d",(int)Math.pow(2,i-k));
           for(int k=1;k<=i;k++)System.out.printf("%4d",(int)Math.pow(2,i-k));
           System.out.println();
         }
  }    
}
