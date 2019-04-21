import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setTitle("18-32");
      frame.setSize(300,120);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      frame.add(new MyApplet());
  }    
}
