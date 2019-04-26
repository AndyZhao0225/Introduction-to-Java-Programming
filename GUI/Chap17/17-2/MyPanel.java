import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import javax.swing.JCheckBox;

  public class MyPanel extends JPanel
{
    JRadioButton lineButton = new JRadioButton("Line");
    JRadioButton rectangleButton = new JRadioButton("Rectangle");
    JRadioButton ovalButton = new JRadioButton("Oval");
    JRadioButton roundRecButton = new JRadioButton("RoundRec");
    JCheckBox filledCheck = new JCheckBox("Filled"); 
    
    public MyPanel()
  {
      lineButton.setSelected(true);
     
      ButtonGroup group = new ButtonGroup();
      group.add(lineButton);
      group.add(rectangleButton);
      group.add(ovalButton);
      group.add(roundRecButton);
      
      this.add(lineButton);
      this.add(rectangleButton);
      this.add(ovalButton);
      this.add(roundRecButton);
      this.add(filledCheck);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }
   
    public Dimension getPreferredSize() 
  {
      return new Dimension(500,40);
  }
}
