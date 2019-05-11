import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

  public class RegularPolygonPanel extends JPanel
{
    int numberOfSides;   
   
    public RegularPolygonPanel(int numberOfSides)
  {
      this.numberOfSides = numberOfSides;
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      int xCenter = width/2;
      int yCenter = height/2;
      int radius = (int)(Math.min(width,height)*0.4);
      
      Polygon polygon = new Polygon();
      int x;
      int y;
      switch(numberOfSides)
       {
          case 5:
                {
                   x = (int)(xCenter + radius*Math.cos(2*Math.PI/20));
                   y = (int)(yCenter - radius*Math.sin(2*Math.PI/20));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter + radius*Math.cos(2*Math.PI/4));
                   y = (int)(yCenter - radius*Math.sin(2*Math.PI/4));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter - radius*Math.cos(2*Math.PI/20));
                   y = (int)(yCenter - radius*Math.sin(2*Math.PI/20));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter - radius*Math.sin(2*Math.PI/10));
                   y = (int)(yCenter + radius*Math.cos(2*Math.PI/10));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter + radius*Math.sin(2*Math.PI/10));
                   y = (int)(yCenter + radius*Math.cos(2*Math.PI/10));
                   polygon.addPoint(x,y);
                }
                break;
              
          case 6:
                {
                   polygon.addPoint(xCenter+radius,yCenter);
                   polygon.addPoint((int)(xCenter+radius*Math.cos(2*Math.PI/6)),(int)(yCenter-radius*Math.sin(2*Math.PI/6)));
                   polygon.addPoint((int)(xCenter+radius*Math.cos(2*2*Math.PI/6)),(int)(yCenter-radius*Math.sin(2*2*Math.PI/6)));
                   polygon.addPoint((int)(xCenter+radius*Math.cos(3*2*Math.PI/6)),(int)(yCenter-radius*Math.sin(3*2*Math.PI/6)));
                   polygon.addPoint((int)(xCenter+radius*Math.cos(4*2*Math.PI/6)),(int)(yCenter-radius*Math.sin(4*2*Math.PI/6)));
                   polygon.addPoint((int)(xCenter+radius*Math.cos(5*2*Math.PI/6)),(int)(yCenter-radius*Math.sin(5*2*Math.PI/6)));
                }
                break;
              
          case 7:
                {
                   x = (int)(xCenter + radius*Math.cos(Math.PI*38/180));
                   y = (int)(yCenter - radius*Math.sin(Math.PI*38/180));
                   polygon.addPoint(x,y);
                   polygon.addPoint(xCenter,yCenter-radius);
                   x = (int)(xCenter - radius*Math.cos(Math.PI*38/180));
                   y = (int)(yCenter - radius*Math.sin(Math.PI*38/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter - radius*Math.cos(Math.PI*14/180));
                   y = (int)(yCenter + radius*Math.sin(Math.PI*14/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter - radius*Math.sin(Math.PI*26/180));
                   y = (int)(yCenter + radius*Math.cos(Math.PI*26/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter + radius*Math.sin(Math.PI*26/180));
                   y = (int)(yCenter + radius*Math.cos(Math.PI*26/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter + radius*Math.cos(Math.PI*14/180));
                   y = (int)(yCenter + radius*Math.sin(Math.PI*14/180));
                   polygon.addPoint(x,y);
                }break;
              
          case 8:
                {
                   polygon.addPoint(xCenter+radius,yCenter);
                   x = (int)(xCenter + radius*0.707);
                   y = (int)(yCenter - radius*0.707);
                   polygon.addPoint(x,y);
                   polygon.addPoint(xCenter,yCenter-radius);
                   x = (int)(xCenter - radius*0.707);
                   y = (int)(yCenter - radius*0.707);
                   polygon.addPoint(x,y);
                   polygon.addPoint(xCenter-radius,yCenter);
                   x = (int)(xCenter - radius*0.707);
                   y = (int)(yCenter + radius*0.707);
                   polygon.addPoint(x,y);
                   polygon.addPoint(xCenter,yCenter+radius);
                   x = (int)(xCenter + radius*0.707);
                   y = (int)(yCenter + radius*0.707);
                   polygon.addPoint(x,y);
                }
                break;
              
          case 9:
                {
                   x = (int)(xCenter + radius*Math.cos(Math.PI*10/180));
                   y = (int)(yCenter - radius*Math.sin(Math.PI*10/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter + radius*Math.cos(Math.PI*50/180));
                   y = (int)(yCenter - radius*Math.sin(Math.PI*50/180));
                   polygon.addPoint(x,y);
                   polygon.addPoint(xCenter,yCenter-radius);
                   x = (int)(xCenter - radius*Math.cos(Math.PI*50/180));
                   y = (int)(yCenter - radius*Math.sin(Math.PI*50/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter - radius*Math.cos(Math.PI*10/180));
                   y = (int)(yCenter - radius*Math.sin(Math.PI*10/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter - radius*Math.cos(Math.PI*30/180));
                   y = (int)(yCenter + radius*Math.sin(Math.PI*30/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter - radius*Math.cos(Math.PI*70/180));
                   y = (int)(yCenter + radius*Math.sin(Math.PI*70/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter + radius*Math.cos(Math.PI*70/180));
                   y = (int)(yCenter + radius*Math.sin(Math.PI*70/180));
                   polygon.addPoint(x,y);
                   x = (int)(xCenter + radius*Math.cos(Math.PI*30/180));
                   y = (int)(yCenter + radius*Math.sin(Math.PI*30/180));
                   polygon.addPoint(x,y);
                }
                break;
              
          case 10:
                 {
                    polygon.addPoint(xCenter+radius,yCenter);
                    x = (int)(xCenter + radius*Math.cos(Math.PI/5));
                    y = (int)(yCenter - radius*Math.sin(Math.PI/5));
                    polygon.addPoint(x,y);
                    x = (int)(xCenter + radius*Math.cos(2*Math.PI/5));
                    y = (int)(yCenter - radius*Math.sin(2*Math.PI/5));
                    polygon.addPoint(x,y);
                    x = (int)(xCenter - radius*Math.cos(2*Math.PI/5));
                    y = (int)(yCenter - radius*Math.sin(2*Math.PI/5));
                    polygon.addPoint(x,y);
                    x = (int)(xCenter - radius*Math.cos(Math.PI/5));
                    y = (int)(yCenter - radius*Math.sin(Math.PI/5));
                    polygon.addPoint(x,y);
                    polygon.addPoint(xCenter-radius,yCenter);
                    x = (int)(xCenter - radius*Math.cos(Math.PI/5));
                    y = (int)(yCenter + radius*Math.sin(Math.PI/5));
                    polygon.addPoint(x,y);
                    x = (int)(xCenter - radius*Math.cos(2*Math.PI/5));
                    y = (int)(yCenter + radius*Math.sin(2*Math.PI/5));
                    polygon.addPoint(x,y);
                    x = (int)(xCenter + radius*Math.cos(2*Math.PI/5));
                    y = (int)(yCenter + radius*Math.sin(2*Math.PI/5));
                    polygon.addPoint(x,y);
                    x = (int)(xCenter + radius*Math.cos(Math.PI/5));
                    y = (int)(yCenter + radius*Math.sin(Math.PI/5));
                    polygon.addPoint(x,y);
                 }
       }
      
      g.drawPolygon(polygon);
  }    
}
