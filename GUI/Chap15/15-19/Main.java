import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      int hour = (int)(Math.random()*12);
      int mark = (int)(Math.random()*2);
      int minute = mark==0? 0: 30; 
      int second = (int)(Math.random()*60);
      StillClock clock = new StillClock(hour,minute,second);
      clock.setSecondHandVisible(false);
      
      JFrame frame = new JFrame();
      frame.setTitle("15-19");
      frame.setSize(400,400);
      frame.setLocationRelativeTo(null);
      frame.add(clock);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
