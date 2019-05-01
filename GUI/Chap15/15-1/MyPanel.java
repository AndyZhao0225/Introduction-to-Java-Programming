import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g); 
      
      g.setColor(Color.BLUE);
      g.drawLine(0,getHeight()/3,getWidth(),getHeight()/3);
      g.drawLine(0,getHeight()*2/3,getWidth(),getHeight()*2/3);
      
      g.setColor(Color.RED);
      g.drawLine(getWidth()/3,0,getWidth()/3,getHeight());
      g.drawLine(getWidth()*2/3,0,getWidth()*2/3,getHeight());
  }    
}
