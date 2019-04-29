import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

  public class MovingMessagePanel extends JPanel
{
    private String message = "Welcome to Java";
    private int xCoordinate = 0;
    private int yCoordinate = 20;
    private Timer timer;

    public MovingMessagePanel(String message, int delay) 
  {
      this.message = message;

      timer = new Timer(delay, new TimerListener());
      timer.start();
      
      MyMouseListener mouseListener = new MyMouseListener();
      this.addMouseListener(mouseListener); 
  }

    public void paintComponent(Graphics g) 
  {
      super.paintComponent(g);

      if(xCoordinate>getWidth()) xCoordinate = -20;
      
      xCoordinate += 10;
      
      g.setFont(new Font("TimerRoman",Font.BOLD,25));
      g.drawString(message, xCoordinate, yCoordinate);
  }

    private class TimerListener implements ActionListener 
  {
      public void actionPerformed(ActionEvent e) 
    {
        repaint();
    }
  }    
    
    private class MyMouseListener extends MouseAdapter
  {
      public void mousePressed(MouseEvent e)
    {
        timer.stop();
    }  
      
      public void mouseReleased(MouseEvent e)
    {
        timer.start();
    }
  }
}
