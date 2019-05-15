import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;

  public class MyFrame extends JFrame
{
    public MyFrame()
  {
      setLayout(new FlowLayout());
      
      JPanel p1 = new JPanel(new FlowLayout());
      p1.add(new JButton("Button 1"));
      p1.add(new JButton("Button 2"));
      p1.add(new JButton("Button 3"));
      
      JPanel p2 = new JPanel(new FlowLayout());
      p2.add(new JButton("Button 4"));
      p2.add(new JButton("Button 5"));
      p2.add(new JButton("Button 6"));
      
      add(p1);
      add(p2);
  }
}
