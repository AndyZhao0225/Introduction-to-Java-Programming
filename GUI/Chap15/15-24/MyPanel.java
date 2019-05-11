import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      int x1 = (int)(0.45*width);
      int y1 = (int)(0.15*height);
      int x2 = x1;
      int y2 = (int)(0.25*height);
      int x3 = (int)(0.15*width);
      int y3 = (int)(0.75*height);
      int x4 = x3;
      int y4 = (int)(0.95*height);
      int x5 = (int)(0.85*width);
      int y5 = y4;
      int x6 = x5;
      int y6 = y3;
      int x7 = (int)(0.55*width);
      int y7 = y2;
      int x8 = x7;
      int y8 = y1;
      int[] xPoints = {x1,x2,x3,x4,x5,x6,x7,x8};
      int[] yPoints = {y1,y2,y3,y4,y5,y6,y7,y8};
      g.drawPolyline(xPoints,yPoints,xPoints.length);
      
      g.setColor(Color.GREEN);
      int radius = (x7-x2)/6;
      //int radius = Math.min((x7-x2)/5,(y3-y2)/12);
      int x = x1+2*radius;
      int y = y2;// + (y3-y2)/12;
      int preX = x;
      int preY = y;
      g.fillOval(x,y,2*radius,2*radius);
      
      for( int i=1; i<=6; i++)
         {
            x = (int)(preX - 1.35*2*radius);
            y = preY + 2*(y3-y2)/12;
            preX = x;
            preY = y;
            for( int j=0; j<=i; j++)
               {
                  g.fillOval(x,y,2*radius,2*radius);
                  if( i==6 ) g.drawLine(x+radius,y+radius,x+radius,y4); 
                  x += 2.85*2*radius;
               }
         }  
  }    
}
