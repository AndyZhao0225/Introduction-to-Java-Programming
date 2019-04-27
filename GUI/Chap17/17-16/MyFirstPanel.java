import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.Font;

  public class MyFirstPanel extends JPanel
{
    public MyFirstPanel()
  {
      this.setLayout(new GridLayout(3,1));
      
      JLabel label1 = new JLabel("Red");
      label1.setFont(new Font("TimesRoman",Font.BOLD,18));

      JLabel label2 = new JLabel("Green");
      label2.setFont(new Font("TimesRoman",Font.BOLD,18));

      JLabel label3 = new JLabel("Blue");
      label3.setFont(new Font("TimesRoman",Font.BOLD,18));
      
      this.add(label1);
      this.add(label2);
      this.add(label3);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }
}
