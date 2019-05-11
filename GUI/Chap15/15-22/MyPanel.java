import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.FontMetrics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.setColor(Color.RED);
      
      int xCenter = getWidth() / 2;
      int yCenter = getHeight() / 2;
      int radius = (int)(Math.min(getWidth(),getHeight())*0.4);
      
      Polygon polygon = new Polygon();
              
      int x = (int)(xCenter-radius*Math.cos(Math.PI/8)); 
      int y = (int)(yCenter-radius*Math.sin(Math.PI/8)); 
      polygon.addPoint(x,y);
      
      x = (int)(xCenter-radius*Math.cos(3*Math.PI/8));
      y = (int)(yCenter-radius*Math.sin(3*Math.PI/8)); 
      polygon.addPoint(x,y);
      
      x = (int)(xCenter+radius*Math.sin(Math.PI/8));
      y = (int)(yCenter-radius*Math.cos(Math.PI/8)); 
      polygon.addPoint(x,y);
      
      x = (int)(xCenter+radius*Math.sin(3*Math.PI/8));
      y = (int)(yCenter-radius*Math.cos(3*Math.PI/8)); 
      polygon.addPoint(x,y);
      
      x = (int)(xCenter+radius*Math.cos(Math.PI/8));
      y = (int)(yCenter+radius*Math.sin(Math.PI/8)); 
      polygon.addPoint(x,y);
      
      x = (int)(xCenter+radius*Math.cos(3*Math.PI/8));
      y = (int)(yCenter+radius*Math.sin(3*Math.PI/8)); 
      polygon.addPoint(x,y);
      
      x = (int)(xCenter-radius*Math.sin(Math.PI/8));
      y = (int)(yCenter+radius*Math.cos(Math.PI/8)); 
      polygon.addPoint(x,y);
      
      x = (int)(xCenter-radius*Math.sin(3*Math.PI/8));
      y = (int)(yCenter+radius*Math.cos(3*Math.PI/8)); 
      polygon.addPoint(x,y);
      
      g.fillPolygon(polygon);
      
      g.setColor(Color.WHITE);
      g.setFont(new Font("Arial Black", Font.BOLD,(int)(Math.min(getWidth(),getHeight())*0.18)));
      FontMetrics fm = g.getFontMetrics();
      int stringWidth = fm.stringWidth("STOP");
      int stringAscent = fm.getAscent();
      int xCoordinate = getWidth()/2 - stringWidth/2;
      int yCoordinate = (int)(getHeight()/2 + 0.618*stringAscent/2);
      g.drawString("STOP",xCoordinate,yCoordinate);
  }    
}
