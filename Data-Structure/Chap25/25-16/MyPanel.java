import javax.swing.*;
import java.awt.*;

  public class MyPanel extends JPanel
{
    private MyArrayList<Integer> list = new MyArrayList<Integer>();
    
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
    
    public void remove(int index)
  { 
      if(list.isEmpty()) return;
      list.remove(index);
      
      repaint();
  }  
    
    public void trim()
  {
      list.trimToSize();
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
      g.drawString("list   size:"+list.size()+"   capacity:"+list.getCapacity(),startingX-15,startingY-10);
      
      int i;
      for( i=0; i<=list.size()-1; i++)
         {
            g.drawRect(x,y,BOX_WIDTH,BOX_HEIGHT);
            g.drawString(list.get(i)+"",x+10,y+25);  
            x += BOX_WIDTH;
         }
      for( i=0; i<=list.getCapacity()-list.size()-1; i++)
         {
            g.drawRect(x,y,BOX_WIDTH,BOX_HEIGHT);
            g.drawLine(x,y,x+BOX_WIDTH,y+BOX_HEIGHT);
            x += BOX_WIDTH;
         }   
  }   
}    
