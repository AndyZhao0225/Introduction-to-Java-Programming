import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      double height = getHeight();
      double width = getWidth();
      
      g.drawLine(0,0,(int)width,0);
      g.drawLine(0,0,0,(int)height);
      g.drawLine((int)width,0,(int)width,(int)height);
      g.drawLine(0,(int)height,(int)width,(int)height);
      
      int decision = (int)(Math.random()*3);
      
      if( decision==0 ) g.drawOval((int)(0.2*width),(int)(0.2*height),(int)(0.6*width),(int)(0.6*height));
      else if( decision==1 ) 
             {
                g.drawLine((int)(0.2*width),(int)(0.2*height),(int)(0.8*width),(int)(0.8*height));
                g.drawLine((int)(0.2*width),(int)(0.8*height),(int)(0.8*width),(int)(0.2*height));
             }       
  }    
}
