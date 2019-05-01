import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.Color;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      int recWidth = width/8; 
      int recHeight = height/8;
      
      int mark = 1;
      
      for( int i=0; i<=7; i++)
         {
            for( int j=0; j<=7; j++)
               {
                  if( mark==1 ) g.setColor(Color.WHITE);
                  else g.setColor(Color.BLACK);
                  g.fillRect(j*recWidth,i*recHeight,recWidth,recHeight);
                  mark *= -1;
               } 
            mark *= -1;
         }
  }    
}
