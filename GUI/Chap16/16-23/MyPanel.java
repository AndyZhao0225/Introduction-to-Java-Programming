import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.awt.Point;

  public class MyPanel extends JPanel
{
    private ArrayList list = new ArrayList();  
    private double shortest = Integer.MAX_VALUE;
    private int shortestIndexA = -1;
    private int shortestIndexB = -1;
      
    public MyPanel()
  {
      MyListener listener = new MyListener();
      this.addMouseListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      Point point;
      int radius = 2;
      for( int i=0; i<=list.size()-1; i++)
         {
            point = (Point)(list.get(i));
            g.drawOval(point.x - radius,point.y - radius,2*radius,2*radius);
         }
      
      if(list.size()>=2)
        {
           point = (Point)(list.get(shortestIndexA));
           g.fillOval(point.x - radius,point.y - radius,2*radius,2*radius);
           point = (Point)(list.get(shortestIndexB));
           g.fillOval(point.x - radius,point.y - radius,2*radius,2*radius);
        }
  }    
    
    public void findShortest()
  {
      double distance;
      for( int i=0; i<=list.size()-2; i++)
         {
            distance = computeDistance(i,list.size()-1); 
            if(distance<shortest) 
              {
                 shortest = distance;
                 shortestIndexA = i;
                 shortestIndexB = list.size()-1;
              }
         }
  }
    
    public double computeDistance(int a, int b)
  {
      Point pointA = (Point)(list.get(a));
      Point pointB = (Point)(list.get(b));
      double distance = (pointA.x - pointB.x)*(pointA.x - pointB.x) + (pointA.y - pointB.y)*(pointA.y - pointB.y);
      return distance;
  }
    
    private class MyListener extends MouseAdapter
  {
      public void mousePressed(MouseEvent e)
    {
        Point point = new Point();
        point.x = e.getX();
        point.y = e.getY();
        list.add(point);
        findShortest();
        
        repaint();
    }
  }
}
