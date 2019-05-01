import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      MyFrame frame = new MyFrame();
      frame.setSize(550,550);
      frame.setLocationRelativeTo(null);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
