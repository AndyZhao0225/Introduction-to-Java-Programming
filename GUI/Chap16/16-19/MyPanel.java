import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

  public class MyPanel extends JPanel
{
    private int radius = 50;
    private int x = 10;
    private int y = 10;
    
    public MyPanel()
  {
      MyMouseMotionListener listener = new MyMouseMotionListener();
      this.addMouseMotionListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.drawOval(50,10,2*radius,2*radius);
      
      double distance = Math.sqrt((x-100)*(x-100) + (y-60)*(y-60));
      if(distance<radius) g.drawString("Mouse point is in the circle",x,y);
      else g.drawString("Mouse point isn't in the circle",x,y);
  }
    
    private class MyMouseMotionListener extends MouseMotionAdapter
  {
      public void mouseMoved(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        repaint();
    }  
  }
}
