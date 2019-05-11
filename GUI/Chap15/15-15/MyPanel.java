import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      int xCenter = getWidth()/2;
      int yCenter = getHeight()/2;
      int radius = (int)(Math.min(getWidth(),getHeight())*0.4);
      g.setFont(new Font("TimesRoman",Font.PLAIN,18));
      
      g.setColor(Color.RED);
      g.fillArc(xCenter-radius,yCenter-radius,2*radius,2*radius,0,(int)(0.2*360));
      g.setColor(Color.BLACK);
      g.drawString("Project--20%",(int)(xCenter+radius*Math.cos(0.2*2*Math.PI/2)),(int)(yCenter-radius*Math.sin(0.2*2*Math.PI/2)));
      
      g.setColor(Color.BLUE);
      g.fillArc(xCenter-radius,yCenter-radius,2*radius,2*radius,(int)(0.2*360),(int)(0.1*360));
      g.setColor(Color.BLACK);
      g.drawString("Quizzes--10%",(int)(xCenter+radius*Math.cos(0.2*2*Math.PI+0.1*2*Math.PI/2)),
                                  (int)(yCenter-radius*Math.sin(0.2*2*Math.PI+0.1*2*Math.PI/2)));
      
      g.setColor(Color.GREEN);
      g.fillArc(xCenter-radius,yCenter-radius,2*radius,2*radius,(int)(0.3*360),(int)(0.3*360));
      g.setColor(Color.BLACK);
      g.drawString("Midterm--30%",(int)(xCenter+radius*Math.cos(0.3*2*Math.PI+0.3*2*Math.PI/2)),
                                  (int)(yCenter-radius*Math.sin(0.3*2*Math.PI+0.3*2*Math.PI/2)));
      
      g.setColor(Color.ORANGE);
      g.fillArc(xCenter-radius,yCenter-radius,2*radius,2*radius,(int)(0.6*360),(int)(0.4*360));
      g.setColor(Color.BLACK);
      g.drawString("Final--40%",(int)(xCenter+radius*Math.cos(0.6*2*Math.PI+0.4*2*Math.PI/2)),
                                  (int)(yCenter-radius*Math.sin(0.6*2*Math.PI+0.4*2*Math.PI/2)));
  }   
}
