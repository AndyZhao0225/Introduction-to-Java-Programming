import javax.swing.JPanel;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;

  public class MySecondPanel extends JPanel
{
    JScrollBar jsbRed = new JScrollBar(JScrollBar.HORIZONTAL);
    JScrollBar jsbGreen = new JScrollBar(JScrollBar.HORIZONTAL);
    JScrollBar jsbBlue = new JScrollBar(JScrollBar.HORIZONTAL);
    
    public MySecondPanel()
  {
      this.setLayout(new GridLayout(3,1));
      
      this.add(jsbRed);
      this.add(jsbGreen);
      this.add(jsbBlue);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }
}
