import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;

  public class FirstPanel extends JPanel
{
    public FirstPanel()
  {
      this.setLayout(new GridLayout(2,1,5,5));
      
      JLabel label1 = new JLabel("Horizontal");
      label1.setFont(new Font("TimesRoman",Font.BOLD,18));

      JLabel label2 = new JLabel("Vertical");
      label2.setFont(new Font("TimesRoman",Font.BOLD,18));
      
      this.add(label1);
      this.add(label2);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  } 
}

