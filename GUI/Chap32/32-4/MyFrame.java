import javax.swing.*;
import java.awt.*;
import java.util.*;

  public class MyFrame extends JFrame
{
    private Clock clock1 = new Clock();
    private Clock clock2 = new Clock();
    private Clock clock3 = new Clock();
    private Clock clock4 = new Clock();
    //private Clock 
    
    public MyFrame()
  {
      clock2.setTimeZoneID("CTT");
      clock2.setUsingTimeZoneID(true);
      clock2.setHeader("Beijing");
      
      clock3.setTimeZoneID("Europe/Moscow");
      clock3.setUsingTimeZoneID(true);
      clock3.setHeader("Moscow");
      
      clock4.setTimeZoneID("Europe/London");
      clock4.setUsingTimeZoneID(true);
      clock4.setHeader("London");
      
      this.setLayout(new GridLayout(1,4));
      this.add(clock1);  
      this.add(clock2);
      this.add(clock3);
      this.add(clock4);
  }     
}
