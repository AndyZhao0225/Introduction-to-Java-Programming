import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

  public class MyPanel extends JPanel
{
    private JCheckBox box = new JCheckBox();
    private Font font = new Font("SansSerif",Font.PLAIN,24);
      
    public MyPanel(int[][] set)
  {
      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(4,8));
      for( int i=0; i<=3; i++)
         {
            for( int j=0; j<=3; j++)
               {
                  JLabel label = new JLabel(set[i][j]+"    ");
                  label.setFont(font);       
                  panel.add(label);           
               }
         }
      
      this.add(panel,BorderLayout.CENTER);
      this.add(box,BorderLayout.SOUTH);
      this.setBorder(new LineBorder(Color.red));
  }   
    
    public boolean isChecked()
  {
      return box.isSelected();
  }
}
