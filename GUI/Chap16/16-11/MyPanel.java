import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;

  public class MyPanel extends JPanel
{
    private char keyChar = 'A';
    private int x = 300;
    private int y = 300;
    
    public MyPanel()
  {
      MyKeyListener keyListener = new MyKeyListener();
      this.addKeyListener(keyListener);
      
      MyMouseMotionListener mouseListener = new MyMouseMotionListener();
      this.addMouseMotionListener(mouseListener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.setFont(new Font("TimesRoman",Font.BOLD,20));
      g.drawString(String.valueOf(keyChar),x,y);
  }
    
    private class MyKeyListener extends KeyAdapter
  {
      public void keyTyped(KeyEvent e)
    { 
        keyChar = e.getKeyChar();
        repaint();
    }
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
