import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

  public class MyPanel extends JPanel
{
    private JLabel hourLabel = new JLabel("Hour");
    private JLabel minuteLabel = new JLabel("Minute");
    private JLabel secondLabel = new JLabel("Second");
    JTextField hourField = new JTextField(2);
    JTextField minuteField = new JTextField(2);
    JTextField secondField = new JTextField(2);
      
    public MyPanel()
  {
      this.add(hourLabel);
      this.add(hourField);
      this.add(minuteLabel);
      this.add(minuteField);
      this.add(secondLabel);
      this.add(secondField);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }  
    
    public Dimension getPreferredSize() 
  {
      return new Dimension(600,40);
  }
}
