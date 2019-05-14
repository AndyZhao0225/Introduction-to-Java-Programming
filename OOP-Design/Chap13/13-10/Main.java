  public class Main 
{
    public static void main(String[] args)
  {
      try
        {
           int[] array = new int[2000000000];
        }
      catch(OutOfMemoryError er)
        {
           System.out.println("You are running out of memory.");
        }
  }    
}
