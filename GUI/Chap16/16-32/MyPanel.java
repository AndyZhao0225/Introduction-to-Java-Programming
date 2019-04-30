import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Point;

  public class MyPanel extends JPanel
{
    private int x = -100;
    private int y = -100;
    private Point[] points = new Point[1000];
    private int quantityOfPoints = 0;
      
    public MyPanel()
  {
      MyListener listener = new MyListener();
      this.addMouseListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      for( int i=0; i<=quantityOfPoints-1; i++) 
          g.drawOval(points[i].x-5,points[i].y-5,10,10);
  }  
    
    private class MyListener extends MouseAdapter
  {
      public void mouseClicked(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        if(e.isMetaDown())
          {
             points[quantityOfPoints] = new Point(x,y);
             quantityOfPoints++;
          }
        else
          {
             for( int i=0; i<=quantityOfPoints-1; i++)
                {
                   if( (x-points[i].x)*(x-points[i].x) + (y-points[i].y)*(y-points[i].y) < 25 ) 
                     {
                        for( int j=i+1; j<=quantityOfPoints-1; j++)
                           {
                              points[j-1].x = points[j].x;
                              points[j-1].y = points[j].y;
                           }
                        quantityOfPoints--;
                        i--;
                     }
                }
          }
        repaint();
    }  
  }
}
