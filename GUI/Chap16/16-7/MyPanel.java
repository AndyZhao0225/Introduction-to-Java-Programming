import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    private Color color = Color.WHITE;
    
    public MyPanel()
  {
      MyMouseListener listener = new MyMouseListener();
      this.addMouseListener(listener);
      
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      this.setBackground(color);
  }
    
    private class MyMouseListener extends MouseAdapter
  {
      public void mousePressed(MouseEvent e)
    {
        color = Color.BLACK;
        repaint();
    }
      
      public void mouseReleased(MouseEvent e)
    {
        color = Color.WHITE;
        repaint();
    } 
  }
}
