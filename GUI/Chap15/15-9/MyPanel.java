import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.setColor(Color.BLUE);
      
      int xCenter = getWidth() / 2;
      int yCenter = getHeight() / 2;
      int radius = (int)(Math.min(getWidth(),getHeight())*0.4);

      int x = xCenter - radius;
      int y = yCenter - radius;

      g.fillArc(x,y,2*radius,2*radius,0,30);
      g.fillArc(x,y,2*radius,2*radius,90,30);
      g.fillArc(x,y,2*radius,2*radius,180,30);
      g.fillArc(x,y,2*radius,2*radius,270,30);
      
      g.setColor(Color.RED);
      g.drawOval((int)(x-radius*0.05),(int)(y-radius*0.05),(int)(2.1*radius),(int)(2.1*radius));
  }
}
