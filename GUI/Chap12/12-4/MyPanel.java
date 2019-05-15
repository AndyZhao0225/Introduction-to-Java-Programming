import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;

  public class MyPanel extends JPanel
{
    public MyPanel(String button1,String button2,String button3)
  {
      setLayout(new GridLayout(2,3));
      add(new JButton(button1)); 
      add(new JButton(button2)); 
      add(new JButton(button3)); 
  }
}
