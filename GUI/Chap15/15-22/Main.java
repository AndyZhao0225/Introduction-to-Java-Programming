import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setTitle("15-22");
      frame.add(new MyPanel());
      frame.setSize(400,400);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
