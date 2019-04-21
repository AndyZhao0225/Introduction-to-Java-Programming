import javax.swing.JFrame;

  public class Main 
{
     public static void main(String[] args)
   {
       JFrame frame = new MyFrame();
       frame.setTitle("18-20");
       frame.setSize(300,100);
       frame.setLocationRelativeTo(null);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
   }    
}
