import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

/**
 * @author  Junan Zhao
 * @version May-29-2019
 */
public class Fan extends JPanel implements Runnable
{
   private int startAngle = 0;  
   private int increment = 10;
   private Thread thread;
   private boolean started = false;
    
   public Fan()
   {
      thread = new Thread(this);
   }  
   
   
   public void run() 
   {
 	  while(true) 
 	    {
 		   try 
 		     {
 			    repaint();
 			    Thread.sleep(62); 
 		     } 
 		   catch(InterruptedException ex) 
 		     {
 			   
 		     }
 	    }   
   }
   
   
   public void start()
   {
	  if(!started) 
	    {
		   thread.start();
		   started = true;
	    }
	  else  thread.resume();
   }
     
   
   @SuppressWarnings("deprecation")
   public void stop()
   {
       thread.suspend();
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
}
