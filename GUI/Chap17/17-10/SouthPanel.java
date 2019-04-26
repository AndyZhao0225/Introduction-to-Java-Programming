import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;

  public class SouthPanel extends JPanel
{
    JButton jbtLeft = new JButton("<=");
    JButton jbtRight = new JButton("=>");  
    private JLabel messageFieldLabel = new JLabel("Enter a new message");
    private JLabel intervalLabel = new JLabel("Select an Interval");
    JTextField message = new JTextField(10);
    JComboBox interval;
    
    public SouthPanel()
  {
      this.setLayout(new FlowLayout());
      
      this.add(jbtLeft);
      this.add(jbtRight);
      this.add(messageFieldLabel);
      this.add(message);
      this.add(intervalLabel);
      
      Object[] array = new Object[20];
      for( int i=0; i<=19; i++)
          array[i] = (i + 1)*5;
      interval = new JComboBox(array);
      interval.setEditable(true);
      this.add(interval);
  }
}
