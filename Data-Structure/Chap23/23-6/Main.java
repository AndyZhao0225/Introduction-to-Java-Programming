  public class Main
{
    public static void main(String[] args)
  {
      int[] data = {102334155,165580141,267914296,433494437,701408733,1134903170,1836311903};
      System.out.println("\t\t40\t\t41\t\t42\t\t43\t\t44\t\t45");
      System.out.print("Algorithm1\t");
      for( int i=0; i<=data.length-2; i++)
          System.out.printf("%-16d",gcd1(data[i],data[i+1]));
      System.out.print("\nAlgorithm2\t");
      for( int i=0; i<=data.length-2; i++)
         {
            long startTime = System.currentTimeMillis();
            long endTime = gcd2(data[i],data[i+1]);
            System.out.printf("%-16d",endTime - startTime);
         }
      System.out.println();
  }
    
    public static long gcd1( int m, int n)
  {
      long startTime = System.currentTimeMillis();
      int gcd = 1;
      if(m%n==0) return n;
    
      for( int k=n/2; k>=1; k--) 
         {
            if(m%k==0 && n%k==0) 
              {
                 gcd = k;
                 break;
              }
         }
      
      long endTime = System.currentTimeMillis();
      return endTime - startTime;
  }
    
    public static long gcd2( int m, int n) 
  {
      if(m%n==0) return System.currentTimeMillis();
      else return gcd2(n,m%n);
  }
}
