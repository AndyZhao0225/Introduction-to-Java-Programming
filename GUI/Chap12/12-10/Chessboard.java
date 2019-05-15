import java.awt.Color;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JButton;

  public class Chessboard extends JFrame
{
    public Chessboard()
  {
      setLayout(new GridLayout(8,8));
      int mark = 1;
      for( int i=0; i<=8-1; i++)
         {
            for( int j=0; j<=8-1; j++)
               {
                  JButton jbt = new JButton();
                  if( mark==1 ) jbt.setBackground(Color.WHITE);
                  else jbt.setBackground(Color.BLACK);
                  mark *= -1;  
                  add(jbt);              
               }       
            mark *= -1;
         }
  }    
}
