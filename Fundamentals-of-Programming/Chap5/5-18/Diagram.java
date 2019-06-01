  public class Diagram 
{
    public static void main(String[] args)
  {
      System.out.println("   Number     Square_root");
      for( int i=0; i<=20; i+=2)  System.out.printf("   %6d     %.4f\n",i,Math.sqrt((double)i));
  }    
}
