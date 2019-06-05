  public class NewClass 
{
    public static void main(String[] args)
  {
      int n=1;
      while(n*n*n<12000)n++;
      System.out.println("The largest number among numbers whose cubes are smaller than 12000 is "+(n-1));
  }    
}
