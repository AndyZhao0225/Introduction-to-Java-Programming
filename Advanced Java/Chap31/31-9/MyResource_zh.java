import java.util.ListResourceBundle;

  public class MyResource_zh extends ListResourceBundle
{
    private static final Object[][] contents = {{"Choose a locale","\u9009\u62E9\u56FD\u5bb6"},
                                                {"Prior","\u5411\u524D"},
                                                {"Next","\u5411\u540E"}};  
      
    public Object[][] getContents()
  {
      return contents;  
  }
}
