import javax.swing.*;
import java.awt.*;
import java.util.*;

  public class MyPanel extends JPanel
{
    private Stack<Integer> stack = new Stack<Integer>();
    private Queue<Integer> queue = new LinkedList<Integer>();
    
    public MyPanel()
  {
  
  }
      
    public void offer(int a)
  {
      queue.offer(a);
      repaint();
  }
    
    public void poll()
  { 
      if(queue.isEmpty()) return;
      queue.poll();
      repaint();
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      final int BOX_WIDTH = 40;
      final int BOX_HEIGHT = 40;
      int startingX = 60;
      int startingY = 60;
      int x = startingX;
      int y = startingY;
      
      g.setFont(new Font("SANS_SERIF",Font.PLAIN,20));
      g.drawString("top",startingX-10,startingY-10);
      
      ArrayList<Integer> list = new ArrayList<Integer>(queue);
      for( int i=0; i<=list.size()-1; i++)
         {
            g.drawRect(x,y,BOX_WIDTH,BOX_HEIGHT);
            g.drawString(list.get(i)+"",x+10,y+25);
            
            x += BOX_WIDTH;
         }
  }   
} 
