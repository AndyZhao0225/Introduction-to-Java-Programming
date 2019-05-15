import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

  public class Main 
{
    public static void main(String[] args)
  {
      LineBorder lineBorder = new LineBorder(Color.BLACK,1);
      
      ImageIcon icon1 = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-6\\China-Flag-icon.png");
      JLabel label1 = new JLabel(icon1);
      label1.setBorder(lineBorder);
      
      ImageIcon icon2 = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-6\\Jarvis-Island-Flag-icon.png");
      JLabel label2 = new JLabel(icon2);
      label2.setBorder(lineBorder);
      
      ImageIcon icon3 = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-6\\enFlag.png");
      JLabel label3 = new JLabel(icon3);
      label3.setBorder(lineBorder);
      
      ImageIcon icon4 = new ImageIcon("D:\\Java Projects Folder\\Accepted\\12-6\\Australia-Flag-icon.png");
      JLabel label4 = new JLabel(icon4);
      label4.setBorder(lineBorder);
      
      JFrame frame = new JFrame();
      frame.setLayout(new GridLayout(2,2,1,1));
      frame.setSize(512,512);
      frame.add(label1);
      frame.add(label2);
      frame.add(label3);
      frame.add(label4);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
