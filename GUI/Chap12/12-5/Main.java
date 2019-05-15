import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import java.awt.Color;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setLayout(new GridLayout(4,1));
      
      LineBorder lineBorder = new LineBorder(Color.BLACK,2);
      
      JLabel label1 = new JLabel("Department of Computing Science");
      label1.setBorder(lineBorder);
      JLabel label2 = new JLabel("School of Computing");
      label2.setBorder(lineBorder);
      JLabel label3 = new JLabel("Armstrong Atlantic State University");
      label3.setBorder(lineBorder);
      JLabel label4 = new JLabel("Tel: (912)921-6440");
      label4.setBorder(lineBorder);
      
      frame.add(label1);
      frame.add(label2);
      frame.add(label3);
      frame.add(label4);
      
      
      frame.setSize(400,150);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      
  }    
}
