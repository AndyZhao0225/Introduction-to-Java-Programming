import javax.swing.JFrame;

  public class Main 
{
    public static void main(String[] args)
  {
      Tictactoe tictactoe = new Tictactoe();
      tictactoe.setTitle("Tic-tac-toe");
      tictactoe.setSize(300,300);
      tictactoe.setLocationRelativeTo(null);
      tictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      tictactoe.setVisible(true);
  }    
}
