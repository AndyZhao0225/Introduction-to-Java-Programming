import javax.swing.*;
import java.awt.*;

  public class BarChart extends JPanel 
{
    private int[] count;

    public void showBarChart(int[] count) 
  {
      this.count = count;
      repaint();
  }

    protected void paintComponent(Graphics g) 
  {
      if(count==null) return;

      super.paintComponent(g);

      int width = getWidth();
      int height = getHeight();
      int interval = (width - 40) / count.length;
      int individualWidth = (int)(((width - 40) / 24) * 0.25);

      int maxCount = 0;
      for( int i=0; i<=count.length-1; i++) 
          if(maxCount<count[i]) maxCount = count[i];
    
      int x = 30;

      g.drawLine(10,height-20,width-10,height-20);
      for( int i=0; i<=count.length-1; i++) 
         {
            int barHeight = (int)(((double)count[i] / (double)maxCount) * (height - 55));

            g.drawRect(x,height-20-barHeight,individualWidth,barHeight);
            g.drawString((char)(65+i)+"",x,height-25-barHeight);

            x += interval;
         }
  }

    public Dimension getPreferredSize() 
  {
      return new Dimension(800,300);
  }
}

