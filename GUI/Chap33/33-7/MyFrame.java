import javax.swing.*;
import java.awt.*;

  public class MyFrame extends JFrame
{
    private JTabbedPane tabbedPane = new JTabbedPane();
      
    public MyFrame()
  {
      this.add(tabbedPane,BorderLayout.CENTER);
      
      JPanel integerPanel = new IntegerPanel();
      JPanel rationalPanel = new RationalPanel();
      tabbedPane.add(integerPanel,"IntegerPanel");
      tabbedPane.add(rationalPanel,"RationalPanel");
  }
}
