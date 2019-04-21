  public class Alarm 
{
    private int hour = 0;
    private int minute = 0;
    private int second = 0;
    
    public Alarm()
  {
  
  }
    
    public Alarm(int newHour, int newMinute, int newSecond)
  {
      hour = newHour;
      minute = newMinute;
      second = newSecond;
  }
    
    public int getHour()
  {
      return hour;
  }
    
    public void setHour(int newHour)
  {
      hour = newHour;
  }
    
    public int getMinute()
  {
      return minute;
  }
    
    public void setMinute(int newMinute)
  {
      minute = newMinute;
  }
    
    public int getSecond()
  {
      return second;
  }
    
    public void setSecond(int newSecond)
  {
      second = newSecond;
  }
}