  public class NewClass 
{
    public static void main(String... args)
  {
      if( args.length == 0 ) System.out.println("Enter arguements! "); 
      int sum = 0;
      for( int i=0; i<=args.length-1; i++)
          sum += Integer.parseInt(args[i]);  
      System.out.println(sum);   
  }    
}
