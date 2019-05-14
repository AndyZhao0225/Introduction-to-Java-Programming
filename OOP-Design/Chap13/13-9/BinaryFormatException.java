  public class BinaryFormatException extends NumberFormatException
{
    public BinaryFormatException()
  {
      super("Illegal binary character");
  }    
    
    public BinaryFormatException(String message)
  {
      super(message);
  } 
}
