import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

  public class MyFrame extends JFrame
{
    private StillClock clock = new StillClock();  
      
    public MyFrame()
  {
      clock.setSecondHandVisible(false);
      
      MyListener listener = new MyListener();
      clock.addMouseListener(listener);
      
      this.add(clock);
  }    
    
    private class MyListener extends MouseAdapter
  {
      public void mouseClicked(MouseEvent e)
    {
        int hour = (int)(Math.random()*12);
        int minute = (int)(Math.random()*60);       
        clock.setHour(hour);
        clock.setMinute(minute);
        clock.setSecondHandVisible(false);
    }  
  }
}
