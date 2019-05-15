import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      MyFrame frame = new MyFrame();
      frame.setTitle("Frame");
      frame.setSize(400,600);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
