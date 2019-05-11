import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
           
      int x1 = (int)(0.25*width);
      int y1 = (int)(0.05*height);
      int x2 = x1;
      int y2 = (int)(0.9*height);
      g.drawLine(x1,y1,x2,y2);
      
      g.drawArc((int)(0.1*width),y2,(int)(0.3*width),(int)(0.2*height),0,180);
      
      x2 = (int)(0.65*width);
      y2 = y1;
      g.drawLine(x1,y1,x2,y2);
      
      x1 = x2;
      y1 = y2;
      x2 = x1;
      y2 = (int)(0.12*height);
      g.drawLine(x1,y1,x2,y2);
      
      
      int radius = (int)(Math.min(width,height)*0.1);
      x1 -= radius;
      y1 = y2;
      g.drawOval(x1,y1,2*radius,2*radius);
      int x2Record = x2;
      int y2Record = y2;
      
      
      int armLength = (int)(Math.min(width,height)*0.3);
      int circleXCenter = x1 + radius;
      int circleYCenter = y1 + radius;
      x1 = (int)(circleXCenter - radius*0.707);
      y1 = (int)(circleYCenter + radius*0.707);
      x2 = (int)(x1 - 0.707*armLength);
      y2 = (int)(y1 + 0.707*armLength);
      g.drawLine(x1,y1,x2,y2);
      
      x1 = (int)(circleXCenter + radius*0.707);
      y1 = (int)(circleYCenter + radius*0.707);
      x2 = (int)(x1 + 0.707*armLength);
      y2 = (int)(y1 + 0.707*armLength);
      g.drawLine(x1,y1,x2,y2);
      
      x1 = x2Record;
      y1 = y2Record + 2*radius;
      x2 = x2Record;
      y2 = y2Record + (int)(0.45*height); 
      g.drawLine(x1,y1,x2,y2);
      
      int legLength = (int)(Math.min(width,height)*0.25);
      x1 = x2;
      y1 = y2;
      x2 = (int)(x1 - 0.707*legLength);
      y2 = (int)(y1 + 0.707*legLength);
      g.drawLine(x1,y1,x2,y2);
      
      x1 = x1;
      y1 = y1;
      x2 = (int)(x1 + 0.707*legLength);
      y2 = (int)(y1 + 0.707*legLength);
      g.drawLine(x1,y1,x2,y2);
  }
}
