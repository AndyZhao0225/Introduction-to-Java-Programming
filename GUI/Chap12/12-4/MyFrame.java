import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

  public class MyFrame extends JFrame
{
    public MyFrame()
  {
      setLayout(new BorderLayout(10,10));
      
      MyPanel p1 = new MyPanel("Button 1","Button 2","Button 3");
      
      MyPanel p2 = new MyPanel("Button 4","Button 5","Button 6");
      
      add(p2,BorderLayout.SOUTH);
      add(p1,BorderLayout.CENTER);
  }
}

