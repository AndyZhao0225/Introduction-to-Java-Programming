  public class NewClass 
{
    public static void main(String[] args)
  {
      printMatrix(3); 
  }    
    
    public static void printMatrix(int n)
  {
      for(int i=0; i<=n-1; i++)
         {
            for(int j=0; j<=n-1; j++)  System.out.printf("%3d",(int)(Math.random()*2));   
            System.out.println();
         }
  }
}
