import javax.swing.*;
import java.awt.*;
import java.util.*;

  public class MyPanel extends JPanel
{
    private LinkedList<Integer> list = new LinkedList<Integer>();
    
    public MyPanel()
  {
  
  }
    
    public boolean search(int a)
  {
      return list.contains(a);
  }
    
    public void insert(int a)
  {
      insert(-1,a);
  }
    
    public void insert(int index, int a)
  {
      if(index==-1) list.add(a);
      else list.add(index,a);
      repaint();
  }
    
    public void remove()
  { 
      remove(-1);
  }
  
    public void remove(int index)
  { 
      if(list.isEmpty()) return;
      if(index==-1) list.remove();
      else list.remove(index);
      
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
      g.drawString("head",startingX-15,startingY-10);
      
      int i;
      for( i=0; i<=list.size()-2; i++)
         {
            g.drawRect(x,y,BOX_WIDTH,BOX_HEIGHT);
            g.drawString(list.get(i)+"",x+10,y+25);
            g.drawRect(x+BOX_WIDTH,y,BOX_WIDTH,BOX_HEIGHT);
            g.drawLine(x+3*BOX_WIDTH/2,y+BOX_HEIGHT/2,x+3*BOX_WIDTH,y+BOX_HEIGHT/2);
            g.drawLine(x+3*BOX_WIDTH-6,y+BOX_HEIGHT/2-6,x+3*BOX_WIDTH,y+BOX_HEIGHT/2);
            g.drawLine(x+3*BOX_WIDTH-6,y+BOX_HEIGHT/2+6,x+3*BOX_WIDTH,y+BOX_HEIGHT/2);
            
            x += 3*BOX_WIDTH;
         }
      if(i<=list.size()-1)
        {
           g.drawRect(x,y,BOX_WIDTH,BOX_HEIGHT);
           g.drawString(list.get(i)+"",x+10,y+25);
           g.drawRect(x+BOX_WIDTH,y,BOX_WIDTH,BOX_HEIGHT);            
        }
      g.drawString("tail",x+2*BOX_WIDTH,startingY-10);
  }   
} 
