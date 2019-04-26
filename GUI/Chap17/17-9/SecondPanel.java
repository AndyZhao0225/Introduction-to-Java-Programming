import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.GridLayout;

  public class SecondPanel extends JPanel
{
    JComboBox horizontalBox; 
    JComboBox verticalBox; 
      
    public SecondPanel()
  {
      this.setLayout(new GridLayout(2,1,5,5));
      
      String[] horizontalStrs = {"LEFT","CENTER","RIGHT"};
      horizontalBox = new JComboBox(horizontalStrs);
      
      String[] verticalStrs = {"TOP","CENTER","BOTTOM"};
      verticalBox = new JComboBox(verticalStrs);
      
      this.add(horizontalBox);
      this.add(verticalBox);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
  }   
}
