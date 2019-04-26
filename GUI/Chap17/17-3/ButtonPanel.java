import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Dimension;

  public class ButtonPanel extends JPanel
{
    JRadioButton redButton = new JRadioButton("Red");
    JRadioButton yellowButton = new JRadioButton("Yellow");
    JRadioButton greenButton = new JRadioButton("Green");
    
    public ButtonPanel()
  {
      this.add(redButton);
      this.add(yellowButton);
      this.add(greenButton);
      
      ButtonGroup group = new ButtonGroup();
      group.add(redButton);
      group.add(yellowButton);
      group.add(greenButton);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }
    
    public Dimension getPreferredSize() 
  {
      return new Dimension(400,50);
  }
}
