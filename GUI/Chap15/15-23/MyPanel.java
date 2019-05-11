import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      int x1 = (int)(0.1*width);
      int y1 = (int)(0.4*height);
      int x2 = x1;
      int y2 = (int)(0.85*height);
      int x3 = (int)(0.75*width);
      int y3 = y2;
      int x4 = x3;
      int y4 = y1;
      Polygon polygon1 = new Polygon();
      polygon1.addPoint(x1,y1);
      polygon1.addPoint(x2,y2);
      polygon1.addPoint(x3,y3);
      polygon1.addPoint(x4,y4);
      g.drawPolygon(polygon1);
      
      int x1Record = x1;
      int y1Record = y1;
      int x2Record = x2;
      int y2Record = y2;
      int x3Record = x3;
      int y3Record = y3;
      int x4Record = x4;
      int y4Record = y4;
      
      x1 += (int)(0.1*width);
      y1 -= (int)(0.2*height);
      x2 = x1;
      y2 -= (int)(0.2*height);
      x3 += (int)(0.1*width);
      y3 = y2;
      x4 = x3;
      y4 = y1; 
      Polygon polygon2 = new Polygon();
      polygon2.addPoint(x1,y1);
      polygon2.addPoint(x2,y2);
      polygon2.addPoint(x3,y3);
      polygon2.addPoint(x4,y4);
      g.drawPolygon(polygon2);
      
      g.drawLine(x1Record,y1Record,x1,y1);
      g.drawLine(x2Record,y2Record,x2,y2);
      g.drawLine(x3Record,y3Record,x3,y3);
      g.drawLine(x4Record,y4Record,x4,y4);
      
      /*int x1 = (int)(0.1*width);
      int y1 = (int)(0.4*height);
      int x2 = x1;
      int y2 = (int)(0.85*height);
      g.drawLine(x1,y1,x2,y2);
      
      x1 = x1;
      y1 = y1;
      x2 = (int)(0.75*width);
      y2 = y1;
      g.drawLine(x1,y1,x2,y2);
      
      x1 = x2;
      y1 = y2;
      x2 = x1;
      y2 = (int)(0.85*height);
      g.drawLine(x1,y1,x2,y2);
      
      x1 = x2;
      y1 = y2;
      x2 = (int)(0.1*width);
      y2 = y1;
      g.drawLine(x1,y1,x2,y2);*/
      
  }   
}
