import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

  public class MyPanel extends JPanel 
{
    private java.awt.Image image;
    private int x = 100;
    private int y = 450;

    public MyPanel(Image image) 
  {
      this.image = image;
 
      Timer timer = new Timer(1000,new TimerListener());
      timer.start();
  }

    protected void paintComponent(Graphics g) 
  {
      super.paintComponent(g);
      
      if(y<-50) y = 450;
      y -= 10;
      if(image!=null) g.drawImage(image,x,y,this);
  }
    
    private class TimerListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        repaint();
    }  
  } 
}
