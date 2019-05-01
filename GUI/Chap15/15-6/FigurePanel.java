import java.awt.*;
import javax.swing.JPanel;

  public class FigurePanel extends JPanel 
{
    public static final int LINE = 1;
    public static final int RECTANGLE = 2;
    public static final int ROUND_RECTANGLE = 3;
    public static final int OVAL = 4;
    public static final int ARC = 5;
    public static final int POLYGON = 6;

    private int type = 1;
    private boolean filled;

    public FigurePanel() 
  {
  
  }

    public FigurePanel(int type) 
  {
      this.type = type;
  }

    public FigurePanel(int type, boolean filled) 
  {
      this.type = type;
      this.filled = filled;
  }

    public void paintComponent(Graphics g) 
  {
      super.paintComponent(g);

      int width = getWidth();
      int height = getHeight();
      
      int xCenter = width / 2;
      int yCenter = height / 2;
      int radius = (int)(Math.min(width,height)*0.4);

      switch (type) 
    {
        case LINE: 
          g.setColor(Color.BLACK);
          g.drawLine(10, 10, width - 10, height - 10);
          g.drawLine(width - 10, 10, 10, height - 10);
          break;
            
        case RECTANGLE: 
          g.setColor(Color.BLUE);
          if( filled ) g.fillRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
          else g.drawRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
          break;
            
        case ROUND_RECTANGLE: 
          g.setColor(Color.RED);
          if( filled ) g.fillRoundRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height), 20, 20);
          else g.drawRoundRect((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height), 20, 20);
          break;
            
        case OVAL: 
          g.setColor(Color.BLACK);
          if( filled ) g.fillOval((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
          else g.drawOval((int)(0.1 * width), (int)(0.1 * height),(int)(0.8 * width), (int)(0.8 * height));
          break;
            
        case ARC:
          g.setColor(Color.BLUE);
          int x = xCenter - radius;
          int y = yCenter - radius;
          if( filled ) 
            {
               g.fillArc(x,y,2*radius,2*radius,0,30);
               g.fillArc(x,y,2*radius,2*radius,90,30);
               g.fillArc(x,y,2*radius,2*radius,180,30);
               g.fillArc(x,y,2*radius,2*radius,270,30);
            }
          else 
            {
               g.drawArc(x,y,2*radius,2*radius,0,30);
               g.drawArc(x,y,2*radius,2*radius,90,30);
               g.drawArc(x,y,2*radius,2*radius,180,30);
               g.drawArc(x,y,2*radius,2*radius,270,30);
            }
          break;
            
        case POLYGON:
          g.setColor(Color.RED);
          Polygon polygon = new Polygon();
          polygon.addPoint(xCenter + radius, yCenter);
          polygon.addPoint((int)(xCenter + radius*Math.cos(2*Math.PI/6)), (int)(yCenter - radius*Math.sin(2*Math.PI/6)));
          polygon.addPoint((int)(xCenter + radius*Math.cos(2*2*Math.PI/6)), (int)(yCenter - radius*Math.sin(2*2*Math.PI/6)));
          polygon.addPoint((int)(xCenter + radius*Math.cos(3*2*Math.PI/6)), (int)(yCenter - radius*Math.sin(3*2*Math.PI/6)));
          polygon.addPoint((int)(xCenter + radius*Math.cos(4*2*Math.PI/6)), (int)(yCenter - radius*Math.sin(4*2*Math.PI/6)));
          polygon.addPoint((int)(xCenter + radius*Math.cos(5*2*Math.PI/6)), (int)(yCenter - radius*Math.sin(5*2*Math.PI/6)));
          if( filled ) g.fillPolygon(polygon);
          else g.drawPolygon(polygon);
    }
  }

    public void setType(int type) 
  {
      this.type = type;
      repaint();
  }

    public int getType() 
  {
      return type;
  }

    public void setFilled(boolean filled) 
  {
      this.filled = filled;
      repaint();
  }

    public boolean isFilled() 
  {
      return filled;
  }

    public Dimension getPreferredSize() 
  {
      return new Dimension(80, 80);
  }
}
