import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      CardFrame cardFrame = new CardFrame();
      
      cardFrame.setSize(300,150);
      cardFrame.setLocationRelativeTo(null);
      cardFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      cardFrame.setVisible(true);
  }    
}
