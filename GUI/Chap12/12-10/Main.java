
import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      Chessboard board = new Chessboard();
      board.setSize(400,400);
      board.setLocationRelativeTo(null);
      board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      board.setVisible(true);
  }    
}
