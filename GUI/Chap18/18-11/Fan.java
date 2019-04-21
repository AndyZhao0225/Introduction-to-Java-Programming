import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

  public class Fan extends JPanel
{
    private int startAngle = 0;  
    private Timer timer = new Timer(62,new TimerListener());
    private int increment = 10;
    
    public Fan()
  {
      repaint();
  }  
    
    public void start()
  {
      timer.start();
  }
    
    public void stop()
  {
      timer.stop();
  }
    
    public void reverse()
  {
      increment *= -1;
  }
    
    public void setSpeed(int newIncrement)
  {
      increment = increment*newIncrement/Math.abs(increment);
  }
    
    protected void paintComponent(Graphics g) 
  {
      super.paintComponent(g);
      
      int xCenter = getWidth()/2;
      int yCenter = getHeight()/2;
      int radius = (int)(Math.min(getWidth(),getHeight())*0.4);
      int x = xCenter - radius;
      int y = yCenter - radius;
      g.setColor(Color.BLUE);
      
      startAngle += increment;
      
      g.fillArc(x,y,2*radius,2*radius,startAngle,30);
      g.fillArc(x,y,2*radius,2*radius,startAngle+90,30);
      g.fillArc(x,y,2*radius,2*radius,startAngle+180,30);
      g.fillArc(x,y,2*radius,2*radius,startAngle+270,30);
      
      int lRadius = (int)(1.03*radius);
      g.drawOval(xCenter - lRadius,yCenter - lRadius,2*lRadius,2*lRadius);
  }
   
    private class TimerListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        repaint();
    }  
  }
}
