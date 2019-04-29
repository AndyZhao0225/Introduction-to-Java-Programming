import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

  public class MyPanel extends JPanel
{
    private int x = 0;
    private int y = 150;
    private Polygon p;
    
    public MyPanel()
  {
      Timer timer = new Timer(60,new TimerListener());
      timer.start();
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      if(x>getWidth()) x = -10;
      x += 10;
      
      g.setColor(Color.BLACK);
      g.fillOval(x+20,y-20,20,20);
      g.fillOval(x+60,y-20,20,20);
      
      g.setColor(Color.BLUE);
      g.fillRect(x,y-40,100,20);
      
      g.setColor(Color.RED);
      p = new Polygon();
      p.addPoint(x+40,y-60);
      p.addPoint(x+20,y-40);
      p.addPoint(x+80,y-40);
      p.addPoint(x+60,y-60);
      g.fillPolygon(p);
  }    
    
    private class TimerListener implements ActionListener 
  {
      public void actionPerformed(ActionEvent e)
    {
        repaint();
    }  
  }
}
