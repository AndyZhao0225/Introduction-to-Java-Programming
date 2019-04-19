import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int xCenter = getWidth()/2;
      int yCenter = getHeight()/2;
      int radius = Math.min(getWidth(),getHeight())/2 - 10;
      displayCircle(g,radius,xCenter,yCenter); 
  }   
    
    private void displayCircle(Graphics g, int radius, int xCenter, int yCenter)
  {
      if(radius<=0) return;
      g.drawOval(xCenter-radius,yCenter-radius,2*radius,2*radius);
      displayCircle(g,radius-10,xCenter,yCenter);
  }
}
