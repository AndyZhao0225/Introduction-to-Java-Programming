import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Polygon;

  public class MyPanel extends JPanel
{
    private int x1 = 300;
    private int y1 = 300;
    private int x2 = 300;
    private int y2 = 300;
    private Polygon p = new Polygon();
    
      
    public MyPanel()
  {
      p.addPoint(x1,y1);
      p.addPoint(x2,y2);
      
      MyListener listener = new MyListener();
      this.addKeyListener(listener);
  }  
      
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      p.addPoint(x2,y2);
      g.drawPolyline(p.xpoints,p.ypoints,p.npoints);
  }    
    
    private class MyListener extends KeyAdapter
  {
      public void keyPressed(KeyEvent e)
    {
        x1 = x2;
        y1 = y2;
        
        switch(e.getKeyCode())
         { 
            case KeyEvent.VK_DOWN: y2 += 10; break;
            case KeyEvent.VK_UP: y2 -= 10; break;
            case KeyEvent.VK_LEFT: x2 -= 10; break;
            case KeyEvent.VK_RIGHT: x2 += 10; break;
            default: ;
         }
        
        repaint();
    }  
  }
}
