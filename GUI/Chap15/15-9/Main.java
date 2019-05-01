import javax.swing.JFrame;
import java.awt.GridLayout;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setLayout(new GridLayout(2,2,5,5));
      for( int i=0; i<=3; i++)
          frame.add(new MyPanel());
      frame.setSize(400,400);
      frame.setTitle("15-9");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
  }    
}
