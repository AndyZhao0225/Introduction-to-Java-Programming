import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args) throws Exception
  {
      JFrame frame = new JFrame();
      frame.setTitle("17-20");
      frame.setSize(600,350);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      frame.add(new MyPanel());
  }    
}
