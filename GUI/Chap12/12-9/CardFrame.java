import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.GridLayout;

  public class CardFrame extends JFrame
{
    public CardFrame()
  {
      int[] record = new int[3];
      record[0] = 1 + (int)(Math.random()*54);
      do
        {
           record[1] = 1 + (int)(Math.random()*54);
        }while( record[1] == record[0] );
      do
        {
           record[2] = 1 + (int)(Math.random()*54);
        }while( record[2]==record[0] || record[2]==record[1] );
      
      ImageIcon card1 = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-9\\card\\"+record[0]+".png");
      ImageIcon card2 = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-9\\card\\"+record[1]+".png");
      ImageIcon card3 = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-9\\card\\"+record[2]+".png");
            
      JLabel label1 = new JLabel(card1);
      JLabel label2 = new JLabel(card2);
      JLabel label3 = new JLabel(card3);
      
      setLayout(new GridLayout(1,3));
      add(label1);
      add(label2);
      add(label3);
  }    
}
