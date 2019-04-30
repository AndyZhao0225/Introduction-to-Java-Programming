import javax.swing.JFrame;

  public class MyFrame extends JFrame
{
    public MyFrame()
  {
      MyPanel panel = new MyPanel();
      this.add(panel);
      panel.setFocusable(true);
  }    
}
