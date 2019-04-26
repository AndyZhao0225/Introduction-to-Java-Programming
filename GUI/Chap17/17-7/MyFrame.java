import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyFrame extends JFrame
{
    private StillClock clock = new StillClock(); 
    private MyPanel panel = new MyPanel();
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      this.add(clock,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listner = new MyListener();
      panel.hourField.addActionListener(listner);
      panel.minuteField.addActionListener(listner);
      panel.secondField.addActionListener(listner);
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==panel.hourField) 
          {
             int newHour = Integer.parseInt(panel.hourField.getText());
             clock.setHour(newHour);
          }
        if(e.getSource()==panel.minuteField) 
          {
             int newMinute = Integer.parseInt(panel.minuteField.getText());
             clock.setMinute(newMinute);
          }
        if(e.getSource()==panel.secondField) 
          {
             int newSecond = Integer.parseInt(panel.secondField.getText());
             clock.setSecond(newSecond);
          }
        
        clock.repaint();
    }  
  }
}
