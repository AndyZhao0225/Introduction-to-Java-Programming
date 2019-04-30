import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Timer;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

  public class MyPanel extends JPanel
{
    private Timer timer;  
    private int reverseSwing = -1;
    private double angle = Math.PI/12;
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
      
      int width = getWidth();
      int height = getHeight();
           
      int x1 = (int)(0.25*width);
      int y1 = (int)(0.05*height);
      int x2 = x1;
      int y2 = (int)(0.9*height);
      g.drawLine(x1,y1,x2,y2);
      
      g.drawArc((int)(0.1*width),y2,(int)(0.3*width),(int)(0.2*height),0,180);
      
      x2 = (int)(0.65*width);
      y2 = y1;
      g.drawLine(x1,y1,x2,y2);
      
      x1 = x2;
      y1 = y2;
      int lineLength = (int)(0.06*height); 
      int lineEndX = (int)(x1 - lineLength*Math.sin(angle));
      int lineEndY = (int)(y1 + lineLength*Math.cos(angle));
      g.drawLine(x1,y1,lineEndX,lineEndY);
      
      int radius = (int)(Math.min(width,height)*0.08);
      int circleCenterX = (int)(lineEndX - radius*Math.sin(angle));
      int circleCenterY = (int)(lineEndY + radius*Math.cos(angle));
      g.drawOval(circleCenterX-radius,circleCenterY-radius,2*radius,2*radius);
      
      int bodyLength = (int)(0.22*height);
      int bodyStartX = (int)(lineEndX - 2*radius*Math.sin(angle));
      int bodyStartY = (int)(lineEndY + 2*radius*Math.cos(angle));
      int bodyEndX = (int)(bodyStartX - bodyLength*Math.sin(angle));
      int bodyEndY = (int)(bodyStartY + bodyLength*Math.cos(angle));
      g.drawLine(bodyStartX,bodyStartY,bodyEndX,bodyEndY);
      
      int legLength = (int)(0.2*height);
      int leftLegEndX = (int)(bodyEndX - legLength*Math.sin(angle + Math.PI/6));
      int leftLegEndY = (int)(bodyEndY + legLength*Math.cos(angle + Math.PI/6));
      g.drawLine(bodyEndX,bodyEndY,leftLegEndX,leftLegEndY);
      int rightLegEndX = (int)(bodyEndX + legLength*Math.sin(Math.PI/6 - angle));
      int rightLegEndY = (int)(bodyEndY + legLength*Math.cos(Math.PI/6 - angle));
      g.drawLine(bodyEndX,bodyEndY,rightLegEndX,rightLegEndY);
         
      int armLength = (int)(Math.min(width,height)*0.16);
      int armStartX = (int)(lineEndX - (2*radius + 0.38*armLength)*Math.sin(angle));
      int armStartY = (int)(lineEndY + (2*radius + 0.38*armLength)*Math.cos(angle));
      int leftArmEndX = (int)(armStartX - armLength*Math.sin(Math.PI/3+angle));
      int leftArmEndY = (int)(armStartY + armLength*Math.cos(Math.PI/4+angle));
      g.drawLine(armStartX,armStartY,leftArmEndX,leftArmEndY);
      int rightArmEndX = (int)(armStartX + armLength*Math.sin(Math.PI/3-angle));
      int rightArmEndY = (int)(armStartY + armLength*Math.cos(Math.PI/4-angle));
      g.drawLine(armStartX,armStartY,rightArmEndX,rightArmEndY);
  }
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(angle<=-Math.PI/12)  reverseSwing = 1;
        if(angle>=Math.PI/12) reverseSwing = -1;
        angle += speedControl*reverseSwing*Math.PI/90;

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
             angle = Math.PI/12;
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
