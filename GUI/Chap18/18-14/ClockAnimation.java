import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

  public class ClockAnimation extends JPanel
{
    private JButton jbtStart = new JButton("Resume");
    private JButton jbtStop = new JButton("Suspend");
    private StillClock clock = new StillClock();
    private Timer timer = new Timer(1000,new MyTimerListener());
     
    public ClockAnimation()
  {
      this.setLayout(new BorderLayout());
      
      JPanel panel = new JPanel();
      panel.add(jbtStart);
      panel.add(jbtStop);
      this.add(clock,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      jbtStart.addActionListener(listener);
      jbtStop.addActionListener(listener);
  }    
    
    public void timerResume()
  {
      timer.start();
  }
    
    public void timerSuspend()
  {
      timer.stop();
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==jbtStart) timer.start();
        else timer.stop();
    }   
  }
    
    private class MyTimerListener implements ActionListener 
  {
      public void actionPerformed(ActionEvent e)
    {
        clock.setCurrentTime();
        clock.repaint();
    } 
  }
}
