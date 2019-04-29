import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

  public class MyPanel extends JPanel
{
    private int startAngle = 0;  
      
    public MyPanel()
  {
      Timer timer = new Timer(62,new TimerListener());
      timer.start();
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
      
      startAngle += 10;
      
      g.fillArc(x,y,2*radius,2*radius,startAngle,30);
      g.fillArc(x,y,2*radius,2*radius,startAngle+90,30);
      g.fillArc(x,y,2*radius,2*radius,startAngle+180,30);
      g.fillArc(x,y,2*radius,2*radius,startAngle+270,30);
  }
   
    private class TimerListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        repaint();
    }  
  }
}
