import java.io.*;

  public class NameWithText implements Serializable
{
    private String name;
    private String text;
      
    public NameWithText(String newName, String newText)
  {
      name = newName;
      text = newText;
  }    
    
    public String getName()
  {
      return name;
  }
    
    public String getText()
  {
      return text;
  }
}
