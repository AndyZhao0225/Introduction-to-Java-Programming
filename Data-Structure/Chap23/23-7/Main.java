import java.util.List;
import java.util.ArrayList;

  public class Main 
{
    public static void main(String[] args) 
  { 
      System.out.println("\t\t8000000\t\t10000000\t12000000\t14000000\t16000000\t18000000");
      
      System.out.print("Algorithm1\t");
      for( int n=8000000; n<=18000000; n+=2000000)  
          System.out.printf("%-16d",PrimeNumbers(n));
      System.out.print("\nAlgorithm2\t");
      for( int n=8000000; n<=18000000; n+=2000000)  
          System.out.printf("%-16d",EfficientPrimeNumbers(n));
      System.out.print("\nAlgorithm3\t");
      for( int n=8000000; n<=18000000; n+=2000000)  
          System.out.printf("%-16d",SieveOfEratosthenes(n));
      
      System.out.println();
  }
    
    public static long PrimeNumbers(int n)
  {
      long startTime = System.currentTimeMillis();
      int count = 0; 
      int number = 2; 

      while(number<=n) 
           {
              boolean isPrime = true; 
              for( int divisor=2; divisor<=(int)(Math.sqrt(number)); divisor++) 
                 {
                    if(number%divisor==0) 
                      { 
                         isPrime = false;     
                         break; 
                      }
                 }

              if(isPrime) count++; 
              number++;
           }
    
      long endTime = System.currentTimeMillis();
      return endTime - startTime;
  }
    
    public static long EfficientPrimeNumbers(int n) 
  {
      long startTime = System.currentTimeMillis();
      List<Integer> list = new ArrayList<Integer>(); 
      int count = 0; 
      int number = 2; 
      int squareRoot = 1; 

      while(number<=n) 
           {
              boolean isPrime = true; 
              if(squareRoot*squareRoot<number) squareRoot++;
              for( int k=0; k<list.size() && list.get(k)<=squareRoot; k++) 
                 {
                    if(number%list.get(k)==0) 
                      { 
                         isPrime = false;        
                         break; 
                      }
                 }
              if(isPrime) 
                {
                   count++; 
                   list.add(number); 
                }
              number++;
           }

      long endTime = System.currentTimeMillis();
      return endTime - startTime;
  }
    
    public static long SieveOfEratosthenes(int n) 
  {
      long startTime = System.currentTimeMillis();
      boolean[] primes = new boolean[n+1]; 
      for( int i=0; i<primes.length; i++) 
          primes[i] = true; 
      for( int k=2; k<=n/k; k++) 
         {
            if(primes[k]) 
              {
                 for( int i=k; i<=n/k; i++) 
                     primes[k*i] = false; 
              }
         }
    
      int count = 0; 
      for( int i=2; i<primes.length; i++) 
          if(primes[i]) count++;
      
      long endTime = System.currentTimeMillis();
      return endTime - startTime;         
  }
}
