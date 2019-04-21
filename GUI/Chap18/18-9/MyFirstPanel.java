import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;

  public class MyFirstPanel extends JPanel
{
    private JLabel label1 = new JLabel("Decimal");
    private JLabel label2 = new JLabel("Hexadecimal");
    private JLabel label3 = new JLabel("Binary");
    
    public MyFirstPanel()
  {
      setLayout(new GridLayout(3,1));
      
      add(label1);
      add(label2);
      add(label3);
  }  
}
