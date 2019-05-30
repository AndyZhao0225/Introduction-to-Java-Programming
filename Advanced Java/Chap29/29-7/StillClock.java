import java.awt.*;
import javax.swing.*;
import java.util.*;

public class StillClock extends JPanel implements Runnable
{
   private int hour;
   private int minute;
   private int second;
   private boolean hourHandVisible = true;
   private boolean minuteHandVisible = true;
   private boolean secondHandVisible = true;

   public StillClock() 
   {
      setCurrentTime();
   }

   
   public StillClock(int hour, int minute, int second) 
   {
      this.hour = hour;
      this.minute = minute;
      this.second = second;
   }
   
   
   public void run() 
   {
	  while(true) 
	    {
	       try 
	         {
		        setCurrentTime();
	            repaint();
		        Thread.sleep(1000); 
	         } 
	       catch(InterruptedException ex) 
	         {
		   
	         }
	    }   
   }
   
 
    public int getHour() 
  {
      return hour;
  }

    public void setHour(int hour) 
  {
      this.hour = hour;
      repaint();
  }

    public int getMinute() 
  {
      return minute;
  }

    public void setMinute(int minute) 
  {
      this.minute = minute;
      repaint();
  }

    public int getSecond() 
  {
      return second;
  }

    public void setSecond(int second) 
  {
      this.second = second;
      repaint();
  }
    
    public boolean getHourHandVisible()
  {
      return hourHandVisible;
  }
    
    public void setHourHandVisible(boolean hourHandVisible)
  {
      this.hourHandVisible = hourHandVisible;
      repaint();
  }
    
    public boolean getMinuteHandVisible()
  {
      return minuteHandVisible;
  }

    public void setMinuteHandVisible(boolean minuteHandVisible)
  {
      this.minuteHandVisible = minuteHandVisible;
      repaint();
  }  
    
    public boolean getSecondHandVisible()
  {
      return secondHandVisible;
  }  
    
    public void setSecondHandVisible(boolean secondHandVisible)
  {
      this.secondHandVisible = secondHandVisible;
      repaint();
  }  
  
    protected void paintComponent(Graphics g) 
  {
      super.paintComponent(g);

      int clockRadius = (int)(Math.min(getWidth(),getHeight())*0.8*0.5);
      int xCenter = getWidth()/2;
      int yCenter = getHeight()/2;

      g.setColor(Color.black);
      g.drawOval((int)(xCenter-1.05*clockRadius),(int)(yCenter-1.05*clockRadius),(int)(2*1.05*clockRadius),(int)(2*1.05*clockRadius));
      g.drawString("12",xCenter-5,yCenter-clockRadius+12);
      g.drawString("9",xCenter-clockRadius+3,yCenter+5);
      g.drawString("3",xCenter+clockRadius-10,yCenter+3);
      g.drawString("6",xCenter-3,yCenter+clockRadius-3);
      
      int x1;
      int y1;
      int x2;
      int y2;
      for( int i=0; i<=59; i++)
         {
            x1 = (int)(xCenter + 1.05*clockRadius*Math.sin(i*Math.PI/30));
            y1 = (int)(yCenter - 1.05*clockRadius*Math.cos(i*Math.PI/30));
            if( i%5==0 )
              {
                 x2 = (int)(xCenter + clockRadius*Math.sin(i*Math.PI/30));
                 y2 = (int)(yCenter - clockRadius*Math.cos(i*Math.PI/30));
              }
            else 
              {
                 x2 = (int)(xCenter + 1.03*clockRadius*Math.sin(i*Math.PI/30));
                 y2 = (int)(yCenter - 1.03*clockRadius*Math.cos(i*Math.PI/30));
              }
            g.drawLine(x1,y1,x2,y2);
         }
      
      int x;
      int y;
      x = (int)(xCenter + clockRadius*Math.sin(Math.PI/6) - 4);
      y = (int)(yCenter - clockRadius*Math.cos(Math.PI/6) + 12);
      g.drawString("1",x,y);
      x = (int)(xCenter + clockRadius*Math.sin(2*Math.PI/6) - 12);
      y = (int)(yCenter - clockRadius*Math.cos(2*Math.PI/6) + 10);
      g.drawString("2",x,y);
      x = (int)(xCenter + clockRadius*Math.cos(Math.PI/6) - 12);
      y = (int)(yCenter + clockRadius*Math.sin(Math.PI/6) - 3);
      g.drawString("4",x,y);
      x = (int)(xCenter + clockRadius*Math.cos(2*Math.PI/6) - 8);
      y = (int)(yCenter + clockRadius*Math.sin(2*Math.PI/6) - 5);
      g.drawString("5",x,y);
      x = (int)(xCenter - clockRadius*Math.sin(Math.PI/6) + 2);
      y = (int)(yCenter + clockRadius*Math.cos(Math.PI/6) - 5);
      g.drawString("7",x,y);
      x = (int)(xCenter - clockRadius*Math.sin(2*Math.PI/6) + 3);
      y = (int)(yCenter + clockRadius*Math.cos(2*Math.PI/6));
      g.drawString("8",x,y);
      x = (int)(xCenter - clockRadius*Math.cos(Math.PI/6) + 5);
      y = (int)(yCenter - clockRadius*Math.sin(Math.PI/6) + 12);
      g.drawString("10",x,y);
      x = (int)(xCenter - clockRadius*Math.cos(2*Math.PI/6) + 1);
      y = (int)(yCenter - clockRadius*Math.sin(2*Math.PI/6) + 14);
      g.drawString("11",x,y);

      int sLength = (int)(clockRadius * 0.8);
      int xSecond = (int)(xCenter + sLength*Math.sin(second*(2*Math.PI/60)));
      int ySecond = (int)(yCenter - sLength*Math.cos(second*(2*Math.PI/60)));
      g.setColor(Color.red);
      if( secondHandVisible ) g.drawLine(xCenter,yCenter,xSecond,ySecond);

      int mLength = (int)(clockRadius*0.65);
      int xMinute = (int)(xCenter + mLength*Math.sin(minute*(2*Math.PI/60)));
      int yMinute = (int)(yCenter - mLength*Math.cos(minute*(2*Math.PI/60)));
      g.setColor(Color.blue);
      if( minuteHandVisible ) g.drawLine(xCenter,yCenter,xMinute,yMinute);

      int hLength = (int)(clockRadius*0.5);
      int xHour = (int)(xCenter + hLength*Math.sin((hour%12 + minute/60.0)*(2*Math.PI/12)));
      int yHour = (int)(yCenter - hLength *
      Math.cos((hour%12 + minute/60.0)*(2*Math.PI/12)));
      g.setColor(Color.green);
      if( hourHandVisible ) g.drawLine(xCenter,yCenter,xHour,yHour);
  }

    public void setCurrentTime() 
  {
      Calendar calendar = new GregorianCalendar();

      this.hour = calendar.get(Calendar.HOUR_OF_DAY);
      this.minute = calendar.get(Calendar.MINUTE);
      this.second = calendar.get(Calendar.SECOND);
  }

    public Dimension getPreferredSize() 
  {
      return new Dimension(200, 200);
  }
}
