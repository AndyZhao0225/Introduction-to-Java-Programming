import java.net.*;

  public class Main 
{
    public static void main(String[] args)
  {
      if(args.length!=3)
        {
           System.out.println("Usage: java Main portNum serverIP serverPortNum");
           System.exit(0);
        }
      
      try
        {
           int portNum = Integer.parseInt(args[0]);
           InetAddress serverIP = InetAddress.getByName(args[1]); 
           int serverPortNum = Integer.parseInt(args[2]);
           new Client(portNum,serverIP,serverPortNum);
        }
      catch(Exception ex)
        {
           ex.printStackTrace();
        }    
  }    
}
