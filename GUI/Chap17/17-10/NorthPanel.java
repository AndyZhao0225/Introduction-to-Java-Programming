import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

  public class NorthPanel extends JPanel
{
    JRadioButton redButton = new JRadioButton("Red");  
    JRadioButton greenButton = new JRadioButton("Green"); 
    JRadioButton blueButton = new JRadioButton("Blue"); 
    JCheckBox centered = new JCheckBox("Centered");
    JCheckBox bold = new JCheckBox("Bold");
    JCheckBox italic = new JCheckBox("Italic");
      
    public NorthPanel()
  {
      ButtonGroup group = new ButtonGroup();
      group.add(redButton);
      group.add(greenButton);
      group.add(blueButton);
      
      this.add(redButton);
      this.add(greenButton);
      this.add(blueButton);
      
      this.add(centered);
      this.add(bold);
      this.add(italic);
  } 
}
