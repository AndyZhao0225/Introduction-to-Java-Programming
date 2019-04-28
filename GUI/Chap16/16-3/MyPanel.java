import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    private int radius = 10;
    private int xCenter = 280; 
    private int yCenter = 159; 
  
    public void moveLeft()
  {
      xCenter -= radius;
      repaint();
  }
    
    public void moveRight()
  {
      xCenter += radius;
      repaint();
  }
        
    public void moveUp()
  {
      yCenter -= radius;
      repaint();
  }
          
    public void moveDown()
  {
      yCenter += radius;
      repaint();
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.drawOval(xCenter,yCenter,2*radius,2*radius);
  }
}
