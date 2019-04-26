import java.awt.Color;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import java.awt.Font;

  public class MySecondPanel extends JPanel
{
    JTextField mileField = new JTextField();
    JTextField kilometerField = new JTextField();
      
    public MySecondPanel()
  {
      this.setLayout(new GridLayout(2,1));
      
      mileField.setHorizontalAlignment(JTextField.RIGHT);
      mileField.setFont(new Font("TimesRoman",Font.PLAIN,18));
      
      kilometerField.setHorizontalAlignment(JTextField.RIGHT);
      kilometerField.setFont(new Font("TimesRoman",Font.PLAIN,18));
       
      this.add(mileField);
      this.add(kilometerField);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }
}
