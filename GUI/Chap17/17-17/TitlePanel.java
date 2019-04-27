import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

  public class TitlePanel extends JPanel
{
    public TitlePanel()
  {
      this.setLayout(new GridLayout(1,7));
      Border lineBorder = new LineBorder(Color.BLACK,1);
      this.setBorder(lineBorder);
      
      JLabel[] weekdays = {new JLabel("Sunday"),new JLabel("Monday"),new JLabel("Tuesday"),new JLabel("Wednesday"),
                           new JLabel("Thursday"),new JLabel("Friday"),new JLabel("Saturday")};
      
      for( int i=0; i<=weekdays.length-1; i++)
         {
            weekdays[i].setHorizontalAlignment(SwingConstants.CENTER);
            this.add(weekdays[i]);
         }
  }    
}
