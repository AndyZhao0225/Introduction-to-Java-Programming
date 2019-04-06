import java.util.ListResourceBundle;

  public class MyResource extends ListResourceBundle
{
    private static final Object[][] contents = {{"Choose a locale","Choose a locale"},
                                                {"Prior","Prior"},
                                                {"Next","Next"}};  
      
    public Object[][] getContents()
  {
      return contents;  
  }
}
