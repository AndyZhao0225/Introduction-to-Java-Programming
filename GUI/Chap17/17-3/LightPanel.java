import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

  public class LightPanel extends JPanel
{
    private Color color = Color.WHITE;
    
    public LightPanel()
  { 
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }
    
    public void setColor(Color newColor)
  {
      color = newColor;
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      int radius = (int)(Math.min(width,height)*0.09);
      
      g.drawOval(width/2 - radius,1*height/4 - radius,2*radius,2*radius);
      g.drawOval(width/2 - radius,2*height/4 - radius,2*radius,2*radius);
      g.drawOval(width/2 - radius,3*height/4 - radius,2*radius,2*radius);
      
      g.drawRect(width/2 - 2*radius,1*height/4 - 2*radius,4*radius,height/2 + 4*radius);
      
      int tempHeight = -100;
      g.setColor(color);
      if(color==Color.RED) tempHeight = 1*height/4;
      if(color==Color.YELLOW) tempHeight = 2*height/4;
      if(color==Color.GREEN) tempHeight = 3*height/4;
      g.fillOval(width/2 - radius,tempHeight-radius,2*radius,2*radius);
  }    
    
    public Dimension getPreferredSize() 
  {
      return new Dimension(400,300);
  }

}
