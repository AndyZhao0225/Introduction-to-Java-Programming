import javax.swing.JPanel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;

  public class MyPanel extends JPanel
{
    private String message = "";
    private StringBuilder text = new StringBuilder(""); 
    
    public MyPanel()
  {
      MyListener listener = new MyListener();
      this.addKeyListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  { 
      super.paintComponent(g);
      
      g.setFont(new Font("TimesRoman",Font.BOLD,20));
      
      FontMetrics fm = g.getFontMetrics();
      int stringWidth = fm.stringWidth(message);
      int stringAscent = fm.getAscent();
      int xCoordinate = getWidth()/2 - stringWidth/2;
      int yCoordinate = getHeight()/2 + stringAscent/2;
      
      g.drawString(message,xCoordinate,yCoordinate);
  }
    
    private class MyListener extends KeyAdapter
  {
      public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_ENTER)
          {
             message = text.toString();
             repaint();
             text.setLength(0);
             text.trimToSize();
          } 
    }  
        
      public void keyTyped(KeyEvent e)
    {
        text = text.append(e.getKeyChar());
    }  
  }
}
