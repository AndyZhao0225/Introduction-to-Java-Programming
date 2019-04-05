import java.awt.*;
import java.util.*;
import javax.swing.*;
import java.text.*;

  public class Clock extends JPanel implements Runnable
{
    protected transient Thread thread = null;
    private Color digitalDateTimeColor;//
    private String header = "Atlanta";//
    private Color headerColor = Color.BLACK;//
    private Color hourHandColor = Color.MAGENTA;//
    private Color minuteHandColor = Color.BLUE;//
    private Color secondHandColor = Color.RED;//
    private boolean running;//
    private boolean showingDigitalDateTime = true;//
    private boolean showingHeader = true;//
    private int dateStyle = 0;//
    private int timeStyle = 0;//
    private String timeZoneID = "EST";
    private int timeZoneOffset = -5;//
    private TimeZone timeZone = TimeZone.getDefault(); //
    private boolean usingTimeZoneID = false;//
    
    public Clock()
  {
      setRunning(true);
  }

    public Clock(String timeZoneID)
  {
      this.timeZoneID = timeZoneID;
      setRunning(true);
  }    
    
    public void start()
  {
      if(thread==null) 
        {
           thread = new Thread(this);
           thread.start();
        }
  }
    
    public void stop()
  {
      if(thread!=null) thread = null;
  }
    
    public void run()
  {
      while(true) 
        {
           if(thread==null) return;
           try
             {
                thread.sleep(1000);
             }
           catch(InterruptedException e) {}
           repaint();
        }
  }
    
    public String getTimeZoneID()
  {
      return timeZoneID;
  }
    
    public void setTimeZoneID(String timeZoneID)
  {
      this.timeZoneID = timeZoneID;
  }
    
    public TimeZone getTimeZone()
  {
      return timeZone;
  }
    
    public void setTimeZone(TimeZone timeZone)
  {
      this.timeZone = timeZone;
  }
    
    public String getHeader()
  {
      return header;
  }
    
    public void setHeader(String header)
  {
      this.header = header;
  }
    
    public Color getSecondHandColor() 
  {
      return secondHandColor;
  }

    public void setSecondHandColor(Color secondHandColor) 
  {
      this.secondHandColor = secondHandColor;
  }

    public Color getMinuteHandColor() 
  {
      return minuteHandColor;
  }

    public void setMinuteHandColor(Color minuteHandColor) 
  {
      this.minuteHandColor = minuteHandColor;
  }

    public Color getHourHandColor() 
  {
      return hourHandColor;
  }

    public void setHourHandColor(Color hourHandColor)
  {
      this.hourHandColor = hourHandColor;
  }

    public Color getHeaderColor()
  {
      return headerColor;
  }

    public void setHeaderColor(Color headerColor) 
  {
      this.headerColor = headerColor;
  }

    public boolean isShowingHeader() 
  {
      return showingHeader;
  }

    public void setShowingHeader(boolean showingHeader) 
  {
      this.showingHeader = showingHeader;
  }

    public Color getDigitalDateTimeColor() 
  {
      return digitalDateTimeColor;
  }

    public void setDigitalDateTimeColor(Color digitalDateTimeColor) 
  {
      this.digitalDateTimeColor = digitalDateTimeColor;
  }

    public boolean isShowingDigitalDateTime()
  {
      return showingDigitalDateTime;
  }

    public void setShowingDigitalDateTime(boolean showingDigitalDateTime) 
  {
      this.showingDigitalDateTime = showingDigitalDateTime;
  }

    public int getDateStyle() 
  {
      return dateStyle;
  }

    public void setDateStyle(int dateStyle) 
  {
      this.dateStyle = dateStyle;
  }

    public int getTimeStyle() 
  {
      return timeStyle;
  }

    public void setTimeStyle(int timeStyle) 
  {
      this.timeStyle = timeStyle;
  }

    public boolean isUsingTimeZoneID() 
  {
      return usingTimeZoneID;
  }

    public void setUsingTimeZoneID(boolean usingTimeZoneID) 
  {
      this.usingTimeZoneID = usingTimeZoneID;
  }

    public boolean isRunning() 
  {
      return running;
  }

    public void setRunning(boolean running) 
  {
      this.running = running;
      if(running) start(); 
      else stop();
  }

    public int getTimeZoneOffset() 
  {
      return timeZoneOffset;
  }

    public void setTimeZoneOffset(int timeZoneOffset) 
  {
      this.timeZoneOffset = timeZoneOffset;
  }
  
    protected void paintComponent(Graphics g) 
  {
      super.paintComponent(g);
      if(usingTimeZoneID) timeZone = TimeZone.getTimeZone(timeZoneID);
      else timeZone.setRawOffset(timeZoneOffset*1000*3600);

      GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);

      int clockRadius = (int)(Math.min(getWidth(),getHeight())*0.8*0.5);
      int xCenter = getWidth()/2;
      int yCenter = getHeight()/2;

      g.setColor(Color.black);
      g.drawOval(xCenter-clockRadius,yCenter-clockRadius,2*clockRadius,2*clockRadius);
      g.drawString("12",xCenter-5,yCenter-clockRadius+12);
      g.drawString("9",xCenter-clockRadius+3,yCenter+5);
      g.drawString("3",xCenter+clockRadius-10,yCenter+3);
      g.drawString("6",xCenter-3,yCenter+clockRadius-3);

      int second = gregorianCalendar.get(GregorianCalendar.SECOND);
      int sLength = (int)(clockRadius*0.8);
      int xSecond = (int)(xCenter+sLength*Math.sin(second*(2*Math.PI/60)));
      int ySecond = (int)(yCenter-sLength*Math.cos(second*(2*Math.PI/60)));
      g.setColor(secondHandColor);
      g.drawLine(xCenter,yCenter,xSecond,ySecond);

      int minute = gregorianCalendar.get(GregorianCalendar.MINUTE);
      int mLength = (int)(clockRadius*0.65);
      int xMinute = (int)(xCenter+mLength*Math.sin(minute*(2*Math.PI/60)));
      int yMinute = (int)(yCenter-mLength*Math.cos(minute*(2*Math.PI/60)));
      g.setColor(minuteHandColor);
      g.drawLine(xCenter,yCenter,xMinute,yMinute);

      int hour = gregorianCalendar.get(Calendar.HOUR);
      int hLength = (int)(clockRadius*0.5);
      int xHour = (int)(xCenter+hLength *Math.sin((hour%12+minute/60.0)*(2*Math.PI/12)));
      int yHour = (int)(yCenter-hLength*Math.cos((hour%12+minute/60.0)*(2*Math.PI/12)));
      g.setColor(hourHandColor);
      g.drawLine(xCenter,yCenter,xHour,yHour);
      
      if(showingHeader) 
        {
           FontMetrics fm = g.getFontMetrics();
           g.setColor(headerColor);
           g.drawString(header,(getWidth()-fm.stringWidth(header))/2,(yCenter-clockRadius)/2);
        } 
      
      if(showingDigitalDateTime) 
        {
           DateFormat myFormat = DateFormat.getDateTimeInstance(dateStyle,timeStyle,new Locale("en"));
           myFormat.setTimeZone(timeZone);
           String today = myFormat.format(gregorianCalendar.getTime());
           FontMetrics fm = g.getFontMetrics();
           g.setColor(digitalDateTimeColor);
           g.drawString(today,(getWidth()-fm.stringWidth(today))/2,yCenter+clockRadius+30);
        }
  }    
}
