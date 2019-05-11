import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int width = getWidth();
      int height = getHeight();
      
      g.drawLine((int)(0.03*width),(int)(0.9*height),(int)(0.97*width),(int)(0.9*height));
      int gap = (int)(0.02*0.94*width);
      g.setFont(new Font("TimesRoman",Font.PLAIN,20));
      
      g.setColor(Color.RED);
      int x = (int)(0.03*width + gap);
      int y = (int)(0.9*height - 0.5*0.7*height);
      int recWidth = (int)(0.225*0.94*width);
      int recHeight = (int)(0.9*height-y);
      g.fillRect(x,y,recWidth,recHeight);
      g.setColor(Color.BLACK);
      g.drawString("Project--20%",x,(int)(y-0.05*height));
      
      g.setColor(Color.BLUE);
      x += recWidth + gap;
      y = (int)(0.9*height - 0.25*0.7*height);
      recHeight = (int)(0.9*height-y);
      g.fillRect(x,y,recWidth,recHeight);
      g.setColor(Color.BLACK);
      g.drawString("Quizzes--10%",x,(int)(y-0.05*height));
      
      g.setColor(Color.GREEN);
      x += recWidth + gap;
      y = (int)(0.9*height - 0.75*0.7*height);
      recHeight = (int)(0.9*height-y);
      g.fillRect(x,y,recWidth,recHeight);
      g.setColor(Color.BLACK);
      g.drawString("Midterm--30%",x,(int)(y-0.05*height));
      
      g.setColor(Color.ORANGE);
      x += recWidth + gap;
      y = (int)(0.9*height - 0.7*height);
      recHeight = (int)(0.9*height-y);
      g.fillRect(x,y,recWidth,recHeight);
      g.setColor(Color.BLACK);
      g.drawString("Final--40%",x,(int)(y-0.05*height));
  }
}
