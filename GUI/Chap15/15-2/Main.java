import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setLayout(new GridLayout(1,2,10,10));
      frame.setSize(400, 200);
      frame.setTitle("15-2");
      frame.add(new OvalButton("OK"));
      frame.add(new OvalButton("Cancel"));
      frame.setLocationRelativeTo(null); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
