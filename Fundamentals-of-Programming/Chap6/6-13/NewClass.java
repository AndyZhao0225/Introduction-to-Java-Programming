  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.println(getRandom());
  }   
    
    public static int getRandom(int...numbers)
  {
      return 1+(int)(Math.random()*54);
  }
}
