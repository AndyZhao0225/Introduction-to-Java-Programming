import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Font;

  public class MyPanel extends JPanel
{
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      Font originalFont = g.getFont();
      g.setFont(new Font("TimesRoman",Font.BOLD,20));
      FontMetrics fm = g.getFontMetrics();
      int stringWidth = fm.stringWidth("Java is fun");
      int stringAscent = fm.getAscent();
      int stringHeight = fm.getHeight();
      int xCoordinate = (int)(getWidth()/2 - 1.5*stringWidth);
      int yCoordinate = getHeight()/3;
      g.drawString("Java is fun",xCoordinate,yCoordinate);
      
      xCoordinate -= 0.2*stringWidth;
      yCoordinate = 4*getHeight()/7;
      String text = "Ascent " + stringAscent + "   Descent " + fm.getDescent() 
                  + "   Leading " + fm.getLeading() + "   Height " + stringHeight + "   String Width " + stringWidth;
      g.setFont(originalFont);
      g.drawString(text,xCoordinate,yCoordinate);
  }
}
