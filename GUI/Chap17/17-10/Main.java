import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      JFrame frame = new ButtonDemo();
      frame.setTitle("ButtonDemo");
      frame.pack();;
      frame.setLocationRelativeTo(null); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }    
}
