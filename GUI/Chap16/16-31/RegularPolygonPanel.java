import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;

  public class RegularPolygonPanel extends JPanel
{      
    private int edgeNumbers = 3;  
       
    public void setEdgeNumbers(int newEdgeNumber)
  {
      if(newEdgeNumber>=3) edgeNumbers = newEdgeNumber;
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      int xCenter = width/2;
      int yCenter = height/2;
      int radius = (int)(Math.min(width,height)*0.4);
      
      Polygon p = new Polygon();
      int x, y;
      double angle = 0;
      double angleInterval = 2*Math.PI/edgeNumbers;
      
      for( int i=0; i<=edgeNumbers-1; i++)
         {
            angle = i*angleInterval;
            x = (int)(xCenter + radius*Math.sin(angle));
            y = (int)(yCenter - radius*Math.cos(angle));
            p.addPoint(x,y);
         }
      
      g.drawPolygon(p);
  }    
}
