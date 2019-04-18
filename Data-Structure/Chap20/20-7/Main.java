import java.util.Scanner; 

  public class Main 
{
    private static int count = 0;  
      
    public static void main(String args[]) 
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an index for the Fibonacci number: ");
      int index = input.nextInt();

      System.out.println("Fibonacci number at index " + index + " is " + fib(index));
      System.out.println("The times for calling Fibonacci function are " + count);
  }

    public static long fib(long index) 
  {
      count++;
      if(index==0) return 0;
      if(index==1) return 1;
      return fib(index-1) + fib(index-2);
  }
}
