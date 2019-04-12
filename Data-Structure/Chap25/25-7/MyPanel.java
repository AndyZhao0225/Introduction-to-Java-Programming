import java.util.*;
import javax.swing.*;

  public class MyPanel extends JPanel
{
    private ImageIcon[] icons = new ImageIcon[52];
    private JLabel[] labels = new JLabel[4];
    private ArrayList<Integer> list = new ArrayList<Integer>();  
    
    public MyPanel()
  {
      for( int i=0; i<=3; i++)
          labels[i] = new JLabel();
      for( int i=1; i<=52; i++)
         {
            String path = "Resources/" + i + ".png";
            icons[i-1] = new ImageIcon(path);
         }
      assignValue();
      for( int i=0; i<=3; i++)
          add(labels[i]);
  }
    
    public void assignValue()
  {
      list.clear();
      for( int i=0; i<=3; i++)
         {
            int index;
            do
              {
                 index = (int)(Math.random()*52);
              }while(list.contains(index));
            list.add(index%13+1);
            labels[i].setIcon(icons[index]);
         }
  }  
    
    public ArrayList<Integer> getList()
  {
      return list;
  }
    
    public void refresh()
  {
      assignValue();;
  }
}
