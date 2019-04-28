import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

  public class MyPanel extends JPanel
{
    private String message = "(20,20)";
    private int x = 20;
    private int y = 20;
    
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
      public void mouseClicked(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        message = "("+x+","+y+")";
        repaint();
    }
  }
}
