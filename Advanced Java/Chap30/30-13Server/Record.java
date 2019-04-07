import java.net.*;

  public class Record 
{
    private String clientName;
    private InetAddress clientIP;
    private int clientPortNum;
      
    public Record(String newClientName, InetAddress newClientIP, int newClientPortNum)
  {
      clientName = newClientName;
      clientIP = newClientIP;
      clientPortNum = newClientPortNum;
  }    
    
    public String getClientName()
  {
      return clientName;
  }
    
    public InetAddress getClientIP()
  {
      return clientIP;
  }
    
    public int getClientPortNum()
  {
      return clientPortNum;
  }
}
