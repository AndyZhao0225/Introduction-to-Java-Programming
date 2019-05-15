import java.awt.Color;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;

  public class Tictactoe extends JFrame
{
    public Tictactoe()
  {
      setLayout(new GridLayout(3,3));
      LineBorder lineBorder = new LineBorder(Color.BLACK);
      for( int i=0; i<=8; i++)
         {
            JLabel label;
            int mark = (int)(Math.random()*3);
            if( mark==0 ) label = new JLabel();
            else 
              {
                ImageIcon icon; 
                if( mark==1 ) icon = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-7\\o.gif");
                else icon = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-7\\x.gif");
                label = new JLabel(icon);
              }
            label.setBackground(Color.WHITE);
            label.setBorder(lineBorder);
            
            add(label);
         }
  }       
}
