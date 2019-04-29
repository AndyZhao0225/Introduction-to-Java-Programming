import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setTitle("16-20");
      frame.setSize(400,200);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
      
      frame.add(new MyPanel());
  }    
}
