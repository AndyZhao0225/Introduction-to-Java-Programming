import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

  public class MyPanel extends JPanel
{
    private int x = 20;
    private int y = 20;
    private String message = "";
    
    public MyPanel()
  {
      MyMouseListener listener = new MyMouseListener();
      this.addMouseListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.drawString(message,x,y);
  }
    
    private class MyMouseListener extends MouseAdapter
  {
      public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        message = "("+x+","+y+")";
        repaint();
    }
      
      public void mouseReleased(MouseEvent e)
    {
        message = "";
        repaint();
    }
  }
}
