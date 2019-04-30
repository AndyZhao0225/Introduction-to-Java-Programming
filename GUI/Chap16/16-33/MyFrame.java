import javax.swing.JFrame;

  public class MyFrame extends JFrame
{
    private MyPanel panel = new MyPanel();  
      
    public MyFrame()
  {
      this.add(panel);
      panel.setFocusable(true);
  }    
}
