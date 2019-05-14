  public class HexFormatException extends NumberFormatException
{
    public HexFormatException()
  {
      super("Illegal hexadecimal character");
  }    
    
    public HexFormatException(String message)
  {
      super(message);
  }
}
