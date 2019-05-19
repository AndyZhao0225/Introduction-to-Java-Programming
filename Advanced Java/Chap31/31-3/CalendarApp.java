import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.text.*;
import javax.swing.Timer;

  public class CalendarApp extends JApplet 
{
  private CalendarPanel calendarPanel = new CalendarPanel();
  private StillClock clock = new StillClock();
  private Timer timer = new Timer(1000, new TimerListener());
  private TimeZone timeZone = TimeZone.getTimeZone("EST");
  private JLabel jlblDigitTime = new JLabel("",JLabel.CENTER);

  public void init() {

    JPanel jpCalendar = new JPanel(new BorderLayout());
    jpCalendar.add(calendarPanel,BorderLayout.CENTER);
    
    JPanel clockPanel = new JPanel(new BorderLayout());
    clockPanel.add(clock,BorderLayout.CENTER);
    clockPanel.add(jlblDigitTime,BorderLayout.SOUTH);
    timer.start();;

    add(jpCalendar, BorderLayout.CENTER);
    add(clockPanel,BorderLayout.EAST);
    
    // Register listeners
    
//    calendarPanel.changeLocale(
//      locales[jcboLocale.getSelectedIndex()]);
  }

  /** Main method */
  public static void main(String[] args) {
    JFrame frame = new JFrame("Calendar and Clock");
    CalendarApp applet = new CalendarApp();
    frame.getContentPane().add(applet, BorderLayout.CENTER);
    applet.init();
    applet.start();
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
  
  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
      Calendar calendar = new GregorianCalendar(timeZone, getLocale());
      clock.setHour(calendar.get(Calendar.HOUR));
      clock.setMinute(calendar.get(Calendar.MINUTE));
      clock.setSecond(calendar.get(Calendar.SECOND));

      // Display digit time on the label
      DateFormat formatter = DateFormat.getDateTimeInstance
        (DateFormat.MEDIUM, DateFormat.LONG, getLocale());
      formatter.setTimeZone(timeZone);
      jlblDigitTime.setText(formatter.format(calendar.getTime()));
    }
  }
}
