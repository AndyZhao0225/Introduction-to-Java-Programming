import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;

/**
 * @author  Junan Zhao
 * @version May-29-2019
 */
public class ClockAnimation extends JPanel 
{
   private JButton jbtStart = new JButton("Resume");
   private JButton jbtStop = new JButton("Suspend");
   private StillClock clock = new StillClock();
   private Thread thread;
     
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
      
      thread = new Thread(clock);
      thread.start();
   }  
   
 
   @SuppressWarnings("deprecation")
   public void timeResume()
   {
      thread.resume();
   }
   
   
   @SuppressWarnings("deprecation")
   public void timeSuspend()
   {
      thread.suspend();
   }
    
   
   private class MyListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
         if(e.getSource()==jbtStart) timeResume();
         else timeSuspend();
      }   
   }
}
