import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.GridLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;

  public class MyPanel extends JPanel
{
    JRadioButton left = new JRadioButton("Left");
    JRadioButton center = new JRadioButton("Center");
    JRadioButton right = new JRadioButton("Right");
    JTextField columnSizeField = new JTextField("30",12);
    private JLabel columnSizeLabel = new JLabel("Column Size");
    
    public MyPanel()
  {
      this.setLayout(new GridLayout(1,2));
      
      JPanel panel1 = new JPanel();
      panel1.add(left);
      panel1.add(center);
      panel1.add(right);
      left.setSelected(true);
      panel1.setBorder(new TitledBorder("Horizontal Alignment"));
              
      ButtonGroup group = new ButtonGroup();
      group.add(left);
      group.add(center);
      group.add(right);
      
      JPanel panel2 = new JPanel();
      panel2.add(columnSizeLabel);
      panel2.add(columnSizeField);
      panel2.setBorder(new TitledBorder(""));
      
      this.add(panel1);
      this.add(panel2);
  }    
}
