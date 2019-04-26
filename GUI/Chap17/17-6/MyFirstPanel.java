import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

  public class MyFirstPanel extends JPanel
{
    public MyFirstPanel()
  {
      this.setLayout(new GridLayout(2,1));
      
      JLabel label1 = new JLabel("Mile");
      label1.setFont(new Font("TimesRoman",Font.BOLD,18));
      
      JLabel label2 = new JLabel("Kilometer");
      label2.setFont(new Font("TimesRoman",Font.BOLD,18));
      
      this.add(label1);
      this.add(label2);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }    
}
