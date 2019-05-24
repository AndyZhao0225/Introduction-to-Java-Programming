  public class TestFan 
{
    public static void main(String[] args)
  {
      final int SLOW = 1, MEDIUM = 2, FAST= 3;
      Fan fan1 = new Fan();
      fan1.setSpeed(FAST);
      fan1.setRadius(10);
      fan1.setColor("yellow");
      fan1.setStatus(true);
      System.out.println("Fan1");
      System.out.println(fan1.toString());
      
      System.out.println();
      
      Fan fan2 = new Fan();
      fan1.setSpeed(MEDIUM);
      fan1.setRadius(5);
      fan1.setColor("blue");
      fan1.setStatus(false);
      System.out.println("Fan2");
      System.out.println(fan1.toString());
  }    
}

  class Fan
{
    final int SLOW = 1, MEDIUM = 2, FAST= 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    String color = "blue";
    
    public Fan()
  {
  
  }
    
    public int getSpeed()
  {
      return speed;
  }
    
    public boolean getStatus()
  {
      return on;
  }
    
    public double getRadius()
  {
      return radius;
  }
    
    public String getColor()
  {
      return color;
  }
    
    public void setSpeed(int newSpeed)
  {
      speed = ( newSpeed<= 3 && newSpeed>=1 )? newSpeed: speed;
  }
    
    public void setStatus(boolean newStatus)
  {
      on = newStatus;
  }
    
    public void setRadius(double newRadius)
  {
      radius = (newRadius>0)? newRadius: 5;
  }
    
    public void setColor(String newColor)
  {
      color = newColor;
  }
    
    public String toString()
  {
      if(on) return "Speed: "+speed+"\nColor: "+color+"\nRadius: "+radius;
      else return "fan is off"+"\nColor: "+color+"\nRadius: "+radius;
  }
}
