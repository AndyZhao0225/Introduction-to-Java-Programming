import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Font;

  public class MyPanel extends JPanel
{
    private final int RADIUS = 10;
    private int circleCenterX = 10;
    private int circleCenterY = 10;
    private int timesCount = 0;
    private Color color = Color.BLACK;
    private long timeStart;
      
    public MyPanel()
  {
      MyListener listener = new MyListener();
      this.addMouseListener(listener);
      
      timeStart = System.currentTimeMillis();
  }
      
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      if(timesCount < 20)
        {
           g.setColor(color);
           g.fillOval(circleCenterX-RADIUS,circleCenterY-RADIUS,2*RADIUS,2*RADIUS);
        }
      else
        {
           long timeSpent = System.currentTimeMillis() - timeStart;
           String text = "Time spent " + timeSpent + " milliseconds";
           g.setFont(new Font("TimesRoman",Font.BOLD,20));
           FontMetrics fm = g.getFontMetrics();
           int stringWidth = fm.stringWidth(text);
           int stringAscent = fm.getAscent();
           g.drawString(text,getWidth()/2 - stringWidth/2,getHeight()/2 - stringAscent/2);
        } 
  }    
    
    private class MyListener extends MouseAdapter
  {
      public void mousePressed(MouseEvent e)
    {
        boolean in = ((e.getX() - circleCenterX)*(e.getX() - circleCenterX) + (e.getY() - circleCenterY)*(e.getY() - circleCenterY)) 
                     <= RADIUS*RADIUS; 
        if(in)
          {
             color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
             circleCenterX = (int)(Math.random()*getWidth());
             circleCenterY = (int)(Math.random()*getHeight());
             timesCount++;
             repaint();
          }
    }
  }
}
