import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new JFrame();
      frame.setTitle("16-17");
      frame.setLocationRelativeTo(null); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600,300);
      frame.setVisible(true);
      
      frame.add(new MovingMessagePanel("Moving Message",125));
  }    
}
