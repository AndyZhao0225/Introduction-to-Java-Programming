  public class PentagonalNumber 
{
    public static int getPentagonalNumber(int n)
  {
      return n*(3*n-1)/2;
  }
    
    public static void main(String[] args)
  {
      final int NUMBER_OF_PENTAGONAL=100;
      final int NUMBER_OF_PENTAGONAL_PER_LINE=10;
      int count=0;
      System.out.println("The first 100 pentagonal numbers are: ");
      for(int i=1; i<=NUMBER_OF_PENTAGONAL; i++)
         {
            System.out.printf("%8d",getPentagonalNumber(i));
            count++;
            if(count==10)
              {
                 System.out.println();
                 count=0;
              }
         }
  }    
}
