  public class Main 
{
    public static void main(String[] args)
  {
      if(args.length!=1)
        {
           System.out.println("Usage: java Main portNum");
           System.exit(0);
        }
      
      new Server(Integer.parseInt(args[0]));
  }    
}
