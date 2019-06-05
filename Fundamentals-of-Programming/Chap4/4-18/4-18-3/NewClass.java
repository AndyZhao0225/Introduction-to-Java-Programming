  public class NewClass 
{
    public static void main(String[] args)
  {
      for(int i=1;i<=6;i++)
         {
            for(int k=1;k<=(6-i);k++)System.out.print("  ");
            for(int j=6;j>=1;j--)if(j<=i)System.out.print(j+" ");
            System.out.println();
         }
  }   
}
