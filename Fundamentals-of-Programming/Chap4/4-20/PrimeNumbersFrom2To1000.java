  public class PrimeNumbersFrom2To1000 
{
    public static void main(String[] args)
  {
      final int NUMBER_OF_PER_LINE=8; 
      int count=0;
      for(int number=2;number<=1000;number++)
         {
            boolean isPrime=true;
            for(int divisor=2;divisor<=number/2;divisor++)
               {
                  if(number%divisor==0)
                    {
                       isPrime=false;
                       break;
                    }
               }
            if(isPrime)
              {
                 System.out.print(number+" ");
                 count++;
                 if(count%NUMBER_OF_PER_LINE==0)System.out.println();
              }
         }
      System.out.println();
  }   
}
