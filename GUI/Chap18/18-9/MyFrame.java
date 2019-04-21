import javax.swing.JApplet;
import java.awt.BorderLayout;

  public class MyFrame extends JApplet
{
    public MyFrame()
  {
      setLayout(new BorderLayout());
      MyFirstPanel panel1 = new MyFirstPanel();
      add(panel1,BorderLayout.WEST);
      MySecondPanel panel2 = new MySecondPanel();
      add(panel2,BorderLayout.CENTER);
  }    
}
