import javax.swing.JApplet;
import java.awt.BorderLayout;

  public class MyApplet extends JApplet
{
    private MyPanel panel = new MyPanel();
    
    public MyApplet()
  {
      setLayout(new BorderLayout());
      
      add(panel,BorderLayout.CENTER);
  }
}
