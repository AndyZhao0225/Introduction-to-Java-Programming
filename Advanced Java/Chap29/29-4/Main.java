import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

  public class Main 
{
    private static Integer sum = new Integer(0);

    public static void main(String[] args)
  {
      ExecutorService executor = Executors.newCachedThreadPool();
      for( int i=0; i <=1000-1; i++) 
          executor.execute(new Add());
      executor.shutdown();

      while(!executor.isTerminated()){}

      System.out.println("What is the sum? " + sum);
  }

    private static class Add implements Runnable 
  {
      public void run() 
    {
        int value = sum.intValue() + 1;
        sum = new Integer(value);
    }
  }
}
