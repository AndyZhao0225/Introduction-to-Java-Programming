import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.FontMetrics;

  public class MyPanel extends JPanel
{
    private JLabel label = new JLabel("What the fuck");  
    private boolean mark = false;
    
    public MyPanel()
  {   
      add(label);
      
      Timer timer = new Timer(500,new MyListener());
      timer.start();
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      FontMetrics  fm = g.getFontMetrics();
      int stringWidth = fm.stringWidth(label.getText());
      int stringAscent = fm.getAscent();
      label.setLocation(getWidth()/2-stringWidth/2,getHeight()/2-stringAscent/2);
      if(mark) label.setVisible(true);
      else label.setVisible(false);
  }   
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        mark = !mark;
        repaint();
    }  
  }
}
