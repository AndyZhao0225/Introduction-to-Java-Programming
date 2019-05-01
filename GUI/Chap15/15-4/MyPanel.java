import java.awt.Font;
import javax.swing.JPanel;
import java.awt.Graphics;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.setFont(new Font("Times",Font.BOLD,30));
      g.drawString("Multiplication Table",150,50);
      
      g.setFont(new Font("Times",Font.BOLD,20));
      
      for( int j=1; j<=9; j++)
          g.drawString(j+"",100+j*40,90);
      
      for( int i=1; i<=9; i++)
          g.drawString(i+"",80,100+i*40);
      
      g.drawLine(120,110,500,110);
      g.drawLine(120,110,120,480);
      g.drawLine(500,110,500,480);
      g.drawLine(120,480,500,480);
      
      for( int j=1; j<=9; j++)
         {
            for( int i=1; i<=9; i++)
                g.drawString(i*j+"",100+j*40,100+i*40);
         }
         
      
  }
}
