  public class TestTime 
{
    public static void main(String[] args)
  {
      Time time1 = new Time();
      System.out.println(time1.getHour()+":"+time1.getMinute()+":"+time1.getSecond());
      
      Time time2 = new Time(555550000);
      System.out.println(time2.getHour()+":"+time2.getMinute()+":"+time2.getSecond());
      
      Time time3 = new Time(01,45,20);
      System.out.println(time3.getHour()+":"+time3.getMinute()+":"+time3.getSecond());
      
      time3.setTime(555550000);
      System.out.println(time3.getHour()+":"+time3.getMinute()+":"+time3.getSecond());
  }    
}
