  public class NewClass 
{
    public static void main(String[] args)
  {
      int[]prime = new int[50];
      
      int count=0;      
      for( int number = 2; count< 50; number++)
         {
            boolean isPrime = true; 
            for( int k=0; k<count && prime[k] <= Math.sqrt(number); k++)
               {
                  if( number % prime[k] == 0 ) 
                    {
                       isPrime = false;
                       break;
                    }
               }
            if(isPrime)  //if it is prime number
              {
                 prime[count] = number;
                 count++;
              } 
         }
      
      for( int i=0; i<50; i++)     //print the prime array
         {
            if( (i+1) % 10 == 0 ) System.out.println( prime[i] ); 
            else System.out.print( prime[i]+" ");
         }
  }    
}
