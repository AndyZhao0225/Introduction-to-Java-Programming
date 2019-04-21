import javax.swing.JFrame;
  
  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new MyFrame();
      frame.setTitle("18-24");
      frame.setSize(1200,280);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setResizable(false);
  }    
}
