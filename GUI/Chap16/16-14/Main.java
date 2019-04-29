import javax.swing.JFrame;
import java.awt.Image;
import javax.swing.ImageIcon;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setTitle("16-14");
      frame.setSize(600,500);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      Image flag = new ImageIcon("D:\\Java Projects Folder\\Accepted\\16-14\\china.jpg").getImage();
      frame.add(new MyPanel(flag));
  }    
}
