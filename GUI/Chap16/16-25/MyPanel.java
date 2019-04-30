import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;

  public class MyPanel extends JPanel
{
    private int balloonCenterX = 100;
    private int balloonCenterY = 100;
    private int balloonRadius;
    private Timer timer;
    private int bulletX = -100;
    private int bulletY = -100;
    private int bulletRadius = 5;
    private int gunHeadX;
    private int gunHeadY;
    private int gunLength;
    private double angle;
    private boolean initial = true;
    private boolean bulletOnTheWay = false;
    private boolean hit = false;
    private int hitCount = 0;
    private Color balloonColor = Color.BLUE; 
    private final Font font = new Font("TimerRoman",Font.BOLD,20);
    private long timeStartRecord = 0; 
    private int timePastInSecond = -1;
    private boolean gameOver = false;
    private final int TOTAL_TIME = 60;
    
    public MyPanel()
  {
      MyKeyListener listener = new MyKeyListener();
      this.addKeyListener(listener);
      
      timer = new Timer(80,new MyActionListener());
      timer.start();
      timeStartRecord = System.currentTimeMillis();
  }  
    
    protected void paintComponent(Graphics g)
  {
      super.paintComponent(g);
      
      if(initial)
        {
           gunLength = (int)(getHeight()*0.1);
           gunHeadX = (int)(getWidth()*0.5);
           gunHeadY = (int)(getHeight()*0.9);
           angle = 0;
           balloonRadius = (int)(Math.min(getWidth(),getHeight())*0.05);
           balloonCenterX = (int)(Math.random()*getWidth());
           balloonCenterY = (int)(getHeight()*0.86);
           initial = false;
        }
      
      for( int i=-5; i<=5; i++)
          g.drawLine(gunHeadX+i,gunHeadY,(int)(getWidth()*0.5)+i,getHeight());;
      
      g.setColor(Color.BLACK);
      g.fillOval(bulletX - bulletRadius,bulletY - bulletRadius,2*bulletRadius,2*bulletRadius);
      
      g.setFont(font);
      g.drawString("Hit Count: " + hitCount,10,30);
      
      g.drawString("Time: " + (TOTAL_TIME - timePastInSecond),(int)(0.85*getWidth()),30);
      
      g.setColor(balloonColor);
      if(!hit) g.fillOval(balloonCenterX - balloonRadius,balloonCenterY - balloonRadius,2*balloonRadius,2*balloonRadius);
      else 
        {
           hitCount++;

           int debrisX = (balloonCenterX - 30) + (int)(Math.random()*60);
           int debrisY = (balloonCenterY - 30) + (int)(Math.random()*60);
           int debrisRadius = 5;
           g.fillOval(debrisX  - debrisRadius,debrisY  - debrisRadius,2*debrisRadius,2*debrisRadius);
           
           debrisX = (balloonCenterX - 30) + (int)(Math.random()*60);
           debrisY = (balloonCenterY - 30) + (int)(Math.random()*60);
           g.fillOval(debrisX  - debrisRadius,debrisY  - debrisRadius,2*debrisRadius,2*debrisRadius);
           
           debrisX = (balloonCenterX - 30) + (int)(Math.random()*60);
           debrisY = (balloonCenterY - 30) + (int)(Math.random()*60);
           g.fillOval(debrisX  - debrisRadius,debrisY  - debrisRadius,2*debrisRadius,2*debrisRadius);
           
           debrisX = (balloonCenterX - 30) + (int)(Math.random()*60);
           debrisY = (balloonCenterY - 30) + (int)(Math.random()*60);
           g.fillOval(debrisX  - debrisRadius,debrisY  - debrisRadius,2*debrisRadius,2*debrisRadius);
           
           balloonCenterX = (int)(Math.random()*getWidth());
           balloonCenterY = (int)(getHeight()*0.86);
           
           balloonColor = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
           
           bulletOnTheWay = false;
        }
      
      if(gameOver) 
        {
           FontMetrics fm = g.getFontMetrics();
           int stringWidth = fm.stringWidth("GAME OVER");
           int stringAscent = fm.getAscent();
           
           g.setColor(Color.BLACK);
           g.setFont(new Font("TimesRoman",Font.BOLD,40));
           g.drawString("GAME OVER",getWidth()/2 - stringWidth*6/7,getHeight()/2 + stringAscent/2);
        }
  }    
    
    private class MyKeyListener extends KeyAdapter
  {        
      public void keyPressed(KeyEvent e)
    {   
        if(!bulletOnTheWay && !gameOver)
          {
             if(e.getKeyCode()==KeyEvent.VK_SPACE)
               {
                  bulletX = gunHeadX;
                  bulletY = gunHeadY;
                  bulletOnTheWay = true;   
               }
        
             if(e.getKeyCode()==KeyEvent.VK_LEFT)
               {
                  angle += Math.PI/36;
                  if(angle>=Math.PI/2) angle = Math.PI/2; 
                  gunHeadX = (int)(getWidth()/2 - gunLength*Math.sin(angle));
                  gunHeadY = (int)(getHeight() - gunLength*Math.cos(angle));
               }
        
             if(e.getKeyCode()==KeyEvent.VK_RIGHT)
               {
                  angle -= Math.PI/60;
                  if(angle<=-Math.PI/2) angle = -Math.PI/2;
                  gunHeadX = (int)(getWidth()/2 - gunLength*Math.sin(angle));
                  gunHeadY = (int)(getHeight() - gunLength*Math.cos(angle));
               }
   
             repaint();
          }
    } 
  }
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        int timePast = (int)((System.currentTimeMillis() - timeStartRecord)/1000);
        if(timePast>timePastInSecond) timePastInSecond = timePast;
        if(timePast>=TOTAL_TIME) 
          {
             timer.stop();
             gameOver = true;
          }  
        
        bulletX -= 55*Math.sin(angle);
        bulletY -= 55*Math.cos(angle);
        
        if(bulletX<0 || bulletX>getWidth() || bulletY<0 || bulletY>getHeight()) 
          {
             bulletOnTheWay = false;
             bulletX = -100;
             bulletY = -100;
          }
           
        hit = (bulletX - balloonCenterX)*(bulletX - balloonCenterX) + (bulletY - balloonCenterY)*(bulletY - balloonCenterY) <= balloonRadius*balloonRadius; 
        
        balloonCenterY -= 6;
        if(balloonCenterY<=0)
          {
             balloonColor = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
             balloonCenterX = (int)(Math.random()*getWidth());
             balloonCenterY = (int)(getHeight()*0.86);
          }
        
        repaint();
    }  
  }
}
