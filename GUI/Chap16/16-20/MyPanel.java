import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

  public class MyPanel extends JPanel
{
    private int x = 10;
    private int y = 10;
      
    public MyPanel()
  {
      MyListener listener = new MyListener();
      this.addMouseMotionListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.drawRect(100,60,100,40);
      MyRectangle2D rec = new MyRectangle2D(100,60,100,40);
      if(rec.contains(x,y)) g.drawString("Mouse point is in the rectangle",x,y);
      else g.drawString("Mouse point isn't in the rectangle",x,y);
  }    
    
    private class MyListener extends MouseMotionAdapter
  {
      public void mouseMoved(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        repaint();
    }  
  }
}
