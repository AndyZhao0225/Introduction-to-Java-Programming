import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.BorderLayout;

  public class MyFrame extends JFrame
{
    public MyFrame()
  {
      setLayout(new BorderLayout());
      
      JPanel p1 = new JPanel(new FlowLayout());
      p1.add(new JButton("Button 1"));
      p1.add(new JButton("Button 2"));
      p1.add(new JButton("Button 3"));
      
      JPanel p2 = new JPanel(new FlowLayout());
      p2.add(new JButton("Button 4"));
      p2.add(new JButton("Button 5"));
      p2.add(new JButton("Button 6"));
      
      add(p2,BorderLayout.SOUTH);
      add(p1,BorderLayout.CENTER);
  }
}
