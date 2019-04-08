import javax.swing.JFrame;
import javax.swing.JTextArea;

  public class MyFrame extends JFrame
{
    private JTextArea area = new JTextArea();  
      
    public MyFrame()
  {
      area.setLineWrap(true);
      this.add(area);
  }  
    
    public void appendAreaText(String text)
  {
      area.append(text);
  }
}
