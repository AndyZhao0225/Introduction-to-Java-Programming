import javax.swing.JFrame;
import java.awt.GridLayout;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setTitle("15-7");
      frame.setSize(600,600);
      frame.setLocationRelativeTo(null);
      frame.setLayout(new GridLayout(3,3));
      
      for( int i=0; i<=8; i++)
          frame.add(new MyPanel());
      
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
