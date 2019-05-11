import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Font;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      int x1 = (int)(0.1*width);
      int y1 = (int)(0.9*height);
      int x2 = (int)(0.9*width);
      int y2 = y1;
      g.drawLine(x1,y1,x2,y2);
      
      
      int arrowLength = (int)(0.05*Math.min(width,height));
      x1 = (int)(x2 - arrowLength*Math.cos(Math.PI/6));
      y1 = (int)(y2 - arrowLength*Math.sin(Math.PI/6));
      g.drawLine(x1,y1,x2,y2);
      
      y1 = (int)(y2 + arrowLength*Math.sin(Math.PI/6));
      g.drawLine(x1,y1,x2,y2);
      
      g.setFont(new Font("Timesroman",Font.ITALIC,18));
      g.drawString("x",x2,(int)(y2-0.05*height));
      
      x1 = width/2;
      y1 = (int)(0.15*height);
      x2 = x1;
      y2 = height;
      g.drawLine(x1,y1,x2,y2);
      
      x2 = (int)(x1 - arrowLength*Math.sin(Math.PI/6));
      y2 = (int)(y1 + arrowLength*Math.cos(Math.PI/6));
      g.drawLine(x1,y1,x2,y2);
      
      x2 = (int)(x1 + arrowLength*Math.sin(Math.PI/6));
      y2 = (int)(y1 + arrowLength*Math.cos(Math.PI/6));
      g.drawLine(x1,y1,x2,y2);
      
      g.drawString("y",(int)(x1+0.05*width),y1);
      
      Polygon polygon = new Polygon();
      
      int y;
      for( int x=(int)(0.3*width); x<=0.7*width; x++)
         {
            y = (int)(-0.01*(x - 0.5*width)*(x - 0.5*width) + 0.9*height);
            polygon.addPoint(x,y);
         }
      g.drawPolyline(polygon.xpoints,polygon.ypoints,polygon.npoints);
      
  }
}
