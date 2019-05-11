import javax.swing.JFrame;
import java.awt.GridLayout;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setTitle("15-25");
      frame.setSize(1200,300);
      frame.setLayout(new GridLayout(1,6));
      for( int i=0; i<=5; i++)
          frame.add(new RegularPolygonPanel(i+5));
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
