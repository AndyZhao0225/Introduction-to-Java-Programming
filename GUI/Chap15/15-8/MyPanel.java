import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      Polygon polygon = new Polygon();
      
      double panelL = Math.min(getWidth(),getHeight());
      double l = panelL * 1/3;
      
      double x = panelL * 1/3;
      double y = panelL * 1/3;
      
      polygon.addPoint((int)x,(int)y);
      polygon.addPoint((int)(x+0.707*l),(int)(y-0.707*l));
      polygon.addPoint((int)(x+1.707*l),(int)(y-0.707*l));
      polygon.addPoint((int)(x+2.414*l),(int)y);
      polygon.addPoint((int)(x+2.414*l),(int)(y+l));
      polygon.addPoint((int)(x+1.707*l),(int)(y+1.707*l));
      polygon.addPoint((int)(x+0.707*l),(int)(y+1.707*l));
      polygon.addPoint((int)x,(int)(y+l));
      
      g.drawPolygon(polygon);
  }
}
