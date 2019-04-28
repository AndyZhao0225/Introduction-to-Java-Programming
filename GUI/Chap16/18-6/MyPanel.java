import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.FontMetrics;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

  public class MyPanel extends JPanel
{
    private String message1 = "Java is fun";
    private String message2 = "Java is powerful";
    private String message = message1;
    
    public MyPanel()
  {
      MyMouseListener listener = new MyMouseListener();
      this.addMouseListener(listener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.setFont(new Font("TimesRoman",Font.BOLD,20));
      FontMetrics fm = g.getFontMetrics();
      int stringWidth = fm.stringWidth(message);
      int stringAscent = fm.getAscent();
      
      g.drawString(message,getWidth()/2-stringWidth/2,getHeight()/2+stringAscent/2);
  }
    
    private class MyMouseListener extends MouseAdapter
  {
      public void mouseClicked(MouseEvent e)
    {
        if(message == message1) message = message2;
        else message = message1;
        repaint();
    }
  }
}
