import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.setFont(new Font("Times",Font.BOLD,20));
      
      for( int i=1; i*30<=getHeight(); i++)
         {
            for( int j=1; j<=i; j++)
                g.drawString(j+"",j*30,i*30);
         }   
  }
}
