import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.GraphicsEnvironment;

  public class SelectPanel extends JPanel
{
    JComboBox fontNameBox = new JComboBox();
    JComboBox fontSizeBox; 
    
    public SelectPanel()
  {
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
      
      JLabel label1 = new JLabel("Font Name");
      JPanel panel1 = new JPanel();
      panel1.add(label1);
      GraphicsEnvironment gE = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String[] fontNames = gE.getAvailableFontFamilyNames();
      fontNameBox = new JComboBox(fontNames);
      panel1.add(fontNameBox);
      panel1.setBorder(lineBorder);
      
      JLabel label2 = new JLabel("Font size");
      JPanel panel2 = new JPanel();
      panel2.add(label2);
      Object[] array = new Object[100];
      for( int i=0; i<=99; i++)
          array[i] = i+1;
      fontSizeBox = new JComboBox(array);   
      fontSizeBox.setSelectedIndex(39);
      panel2.add(fontSizeBox);
      panel2.setBorder(lineBorder);
      
      this.add(panel1);
      this.add(panel2);
  }
}
