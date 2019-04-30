import javax.swing.JPanel;
import java.awt.Graphics;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

  public class MyPanel extends JPanel
{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int radius;
    private double angle = Math.PI/6;
    private int reverseSwing = -1;
    private int ballRadius;
    private Timer timer;
    private double speedControl = 1.0;
    
    public MyPanel()
  {
      timer = new Timer(125,new MyActionListener());
      timer.start();
      
      MyKeyListener keyListener = new MyKeyListener();
      this.addKeyListener(keyListener);
  }
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      g.drawLine(x1,y1,x2,y2);
      g.fillOval(x2-ballRadius,y2-ballRadius,ballRadius*2,ballRadius*2);
  }    
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        radius = (int)(getHeight()*0.8);
        x1 = getWidth()/2;
        y1 = (int)(getHeight()*0.1);
        ballRadius = (int)(0.05*Math.min(getWidth(),getHeight()));
        
        if(angle<=-Math.PI/6)  reverseSwing = 1;
        if(angle>=Math.PI/6) reverseSwing = -1;
        angle = angle + reverseSwing*speedControl*Math.PI/90;
        
        x2 = (int)(x1 - radius*Math.sin(angle));
        y2 = (int)(y1 + radius*Math.cos(angle));
        
        repaint();
    }  
  } 
    
    private class MyKeyListener extends KeyAdapter
  {
      public void keyPressed(KeyEvent e)
    {
        if(e.getKeyCode()==KeyEvent.VK_S) timer.stop();
        if(e.getKeyCode()==KeyEvent.VK_R) 
          {
             angle = Math.PI/6;
             timer.start();
          }
        if(e.getKeyCode()==KeyEvent.VK_UP) speedControl += 0.1;
        if(e.getKeyCode()==KeyEvent.VK_DOWN) 
          {
             speedControl -= 0.1;
             if(speedControl<=0) speedControl=0.1;
          }
    }  
  }
}
