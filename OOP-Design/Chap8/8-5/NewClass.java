import java.util.GregorianCalendar;

  public class NewClass 
{
    public static void main(String[] args)
  {
      GregorianCalendar calendar = new GregorianCalendar();
      System.out.println(calendar.get(GregorianCalendar.MONTH)+1+" "+calendar.get(GregorianCalendar.DAY_OF_MONTH)
                   +", "+calendar.get(GregorianCalendar.YEAR));
      calendar.setTimeInMillis(1234567898765L);
      System.out.println(calendar.get(GregorianCalendar.MONTH)+1+" "+calendar.get(GregorianCalendar.DAY_OF_MONTH)
                   +", "+calendar.get(GregorianCalendar.YEAR));
  }    
}
