import javax.swing.JButton;
import java.awt.Graphics;

  public class OvalButton extends JButton
{
    public OvalButton()
  {
  
  }  
    
    public OvalButton(String str)
  {
      super(str);
  }
      
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      g.drawOval((int)(0.05*getWidth()),(int)(0.1*getHeight()),(int)(0.9*getWidth()),(int)(0.8*getHeight()));   
  }    
}
