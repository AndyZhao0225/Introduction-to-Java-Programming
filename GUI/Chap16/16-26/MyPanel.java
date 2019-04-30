import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

  public class MyPanel extends JPanel
{
    private int radius = 10;  
    private int xCenter = 100;
    private int yCenter = 100;
      
    public MyPanel()
  {  
      MyMouseMotionListener  listener2 = new MyMouseMotionListener();
      this.addMouseMotionListener(listener2);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.drawOval(xCenter-radius,yCenter-radius,2*radius,2*radius);
  }    
    
    private class MyMouseMotionListener extends MouseMotionAdapter
  {
      public void mouseDragged(MouseEvent e)
    {   
        boolean clickInCircle = radius*radius > (e.getX() - xCenter)*(e.getX() - xCenter) + (e.getY() - yCenter)*(e.getY() - yCenter);
        if(clickInCircle)
          {
             xCenter = e.getX();
             yCenter = e.getY();
             repaint();
          }
    }  
  }
}
