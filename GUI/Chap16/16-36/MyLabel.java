import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.FontMetrics;

  public class MyLabel extends JLabel
{
    private Font font = new Font("TimesRoman",Font.BOLD,30);
    private char letter;
    private int mark = 1;
      
    public MyLabel()
  {
      MyListener listener = new MyListener();
      this.addMouseListener(listener);
  }  
      
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      g.drawLine(0,0,width,0);
      g.drawLine(0,0,0,height);
      g.drawLine(width,0,width,height);
      g.drawLine(0,height,width,height);
      
      g.setFont(font);
      letter = mark>0? 'H': 'T';
      String text = "" + letter;
      FontMetrics fm = g.getFontMetrics();
      int stringWidth = fm.stringWidth(text);
      int stringAscent = fm.getAscent();
      int x = width/2 - stringWidth/2;
      int y = height/2 + stringAscent/2;
      g.drawString(text,x,y);
  }
    
    private class MyListener extends MouseAdapter
  {
      public void mousePressed(MouseEvent e)
    {
        mark *= -1;
        repaint();
    }  
  }
}
