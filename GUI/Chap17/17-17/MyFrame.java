import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.SwingConstants;

  public class MyFrame extends JFrame
{
    private TitlePanel titlePanel = new TitlePanel();
    private GregorianCalendar calendar = new GregorianCalendar();
    private int year = calendar.get(Calendar.YEAR);
    private int month = calendar.get(Calendar.MONTH) + 1;
    private int numOfDaysInTheMonth = calendar.get(Calendar.DATE);
    private int monthStartWeekDay = new GregorianCalendar(year,month-1,1).get(Calendar.DAY_OF_WEEK);
    private MyPanel calendarPanel = new MyPanel(numOfDaysInTheMonth,monthStartWeekDay);
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout()); 
      
      JPanel bigPanel = new JPanel();
      bigPanel.setLayout(new BorderLayout());
      bigPanel.add(titlePanel,BorderLayout.NORTH);
      bigPanel.add(calendarPanel,BorderLayout.CENTER);
      
      JLabel titleLabel = new JLabel(month + "/" + year);
      titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
      
      this.add(titleLabel,BorderLayout.NORTH);
      this.add(bigPanel,BorderLayout.CENTER);
  }    
}
