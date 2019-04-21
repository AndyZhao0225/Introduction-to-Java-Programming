import java.awt.event.*;
import javax.swing.*;

public class ClockAnimation extends JApplet {
  private StillClock clock = new StillClock();

  public ClockAnimation() {
    add(clock);

    // Create a timer with delay 1000 ms
    Timer timer = new Timer(1000, new TimerListener());
    timer.start();
  }

  private class TimerListener implements ActionListener {
    /** Handle the action event */
    public void actionPerformed(ActionEvent e) {
      // Set new time and repaint the clock to display current time
      clock.setCurrentTime();
      clock.repaint();
    }
  }
}

