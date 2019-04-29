import javax.swing.JFrame;

  public class MyFrame extends JFrame
{     
    public MyFrame()
  {
      MyPanel panel = new MyPanel();
      add(panel);
      panel.setFocusable(true);
  }    
}
