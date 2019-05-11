import javax.swing.JFrame;
import java.awt.GridLayout;

  public class Main 
{
    public static void main(String[] args)
  {
      StillClock clock1 = new StillClock(4,20,45);
      StillClock clock2 = new StillClock(22,46,15);
      JFrame frame = new JFrame();
      frame.setTitle("15-18");
      frame.setSize(800,400);
      frame.setLocationRelativeTo(null);
      frame.setLayout(new GridLayout(1,2));
      frame.add(clock1);
      frame.add(clock2);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
