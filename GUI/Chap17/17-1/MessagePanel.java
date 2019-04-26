import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Font;

  public class MessagePanel extends JPanel 
{
    private String message = "Welcome to Java";
    private int xCoordinate = 50;
    private int yCoordinate = 50;
    private int interval = 10;

    public MessagePanel() 
  {
      
  }

    public MessagePanel(String message) 
  {
      this.message = message;
  }

    public String getMessage() 
  {
      return message;
  }

    public void setMessage(String message) 
  {
      this.message = message;
      repaint();
  }

    public int getXCoordinate() 
  {
      return xCoordinate;
  }

    public void setXCoordinate(int x) 
  {
      this.xCoordinate = x;
      repaint();
  }

    public int getYCoordinate() 
  {
      return yCoordinate;
  }

    public void setYCoordinate(int y) 
  {
      this.yCoordinate = y;
      repaint();
  }

    public int getInterval() 
  {
      return interval;
  }

    public void setInterval(int interval) 
  {
      this.interval = interval;
      repaint();
  }

    protected void paintComponent(Graphics g) 
  {
      super.paintComponent(g);

      g.setFont(new Font("TimesRoman",Font.BOLD,40));
      g.drawString(message,xCoordinate,yCoordinate);
  }

    public void moveLeft()
  {
      xCoordinate -= interval;
      repaint();
  }

    public void moveRight() 
  {
      xCoordinate += interval;
      repaint();
  }

    public void moveUp() 
  {
      yCoordinate -= interval;
      repaint();
  }

    public void moveDown() 
  {
      yCoordinate += interval;
      repaint();
  }

    public Dimension getPreferredSize() 
  {
      return new Dimension(600,200);
  }
}
