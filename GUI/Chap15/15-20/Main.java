import java.awt.Color;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Font;

  public class Main 
{
    public static void main(String[] args)
  {
      StillClock clock = new StillClock();
      MessagePanel messagePanel = new MessagePanel(clock.getHour()+":"+clock.getMinute()+":"+clock.getSecond());
      messagePanel.setCentered(true);
      messagePanel.setForeground(Color.BLUE);
      messagePanel.setFont(new Font("Courier",Font.BOLD,20));
      
      JFrame frame = new JFrame();
      frame.setTitle("15-20");
      frame.setSize(400,500);
      frame.setLocationRelativeTo(null);
      frame.setLayout(new BorderLayout());
      frame.add(clock,BorderLayout.CENTER);
      frame.add(messagePanel,BorderLayout.SOUTH);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
