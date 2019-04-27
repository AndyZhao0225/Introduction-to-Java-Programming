import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.SwingConstants;

  public class MyPanel extends JPanel
{     
    public MyPanel(int numOfDaysInTheMonth,int monthStartWeekDay)
  {
      this.setLayout(new GridLayout(5,7));
      Border lineBorder = new LineBorder(Color.BLACK,2);
      
      int startWeekDay = 1;
      
      while(startWeekDay<monthStartWeekDay)
           {
              JLabel label = new JLabel("");
              this.add(label);
              
               startWeekDay++; 
           }
      
      int count = 1;
      while(count<=numOfDaysInTheMonth)
           {
              JLabel label = new JLabel(count + "");
              label.setHorizontalAlignment(SwingConstants.RIGHT);
              label.setBorder(lineBorder);
              this.add(label);
              count++;
           } 
  }  
}
