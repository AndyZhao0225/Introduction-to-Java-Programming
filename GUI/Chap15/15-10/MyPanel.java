import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      g.drawOval((int)(0.2*width),(int)(0.2*height),(int)(0.6*width),(int)(0.2*height));
      g.drawLine((int)(0.2*width),(int)(0.3*height),(int)(0.2*width),(int)(0.7*height));
      g.drawArc((int)(0.2*width),(int)(0.6*height),(int)(0.6*width),(int)(0.2*height),0,-180);
      g.drawArc((int)(0.2*width),(int)(0.6*height),(int)(0.6*width),(int)(0.2*height),0,25);
      g.drawArc((int)(0.2*width),(int)(0.6*height),(int)(0.6*width),(int)(0.2*height),50,25);
      g.drawArc((int)(0.2*width),(int)(0.6*height),(int)(0.6*width),(int)(0.2*height),90,25);
      g.drawArc((int)(0.2*width),(int)(0.6*height),(int)(0.6*width),(int)(0.2*height),140,25);
      g.drawLine((int)(0.8*width),(int)(0.3*height),(int)(0.8*width),(int)(0.7*height));
  }
}
