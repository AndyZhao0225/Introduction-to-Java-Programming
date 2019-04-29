import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

  public class MyPanel extends JPanel
{
    private int x = 300;
    private int y = 300;
    private int radius = 10;
      
    public MyPanel()
  {
      MyListener listener = new MyListener();
      this.addKeyListener(listener);
      
      this.setFocusable(true);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.drawOval(x,y,2*radius,2*radius);
  }
    
    private class MyListener extends KeyAdapter
  {
      public void keyPressed(KeyEvent e)
    {
        switch(e.getKeyCode())
         { 
            case KeyEvent.VK_DOWN: y += 10; break; 
            case KeyEvent.VK_UP: y -= 10; break;
            case KeyEvent.VK_LEFT: x -= 10; break;
            case KeyEvent.VK_RIGHT: x += 10;
         }
        
        repaint();
    }  
  }
}
