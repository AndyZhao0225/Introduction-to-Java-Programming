  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("Current date and time is ");
      
      long totalMilliseconds = System.currentTimeMillis();
      long totalSeconds = totalMilliseconds / 1000 ;
      long remainingSeconds=totalSeconds;
      boolean leapYear=commonOrLeapYear(remainingSeconds);
      remainingSeconds=showYear(remainingSeconds);
      remainingSeconds=showMonth(remainingSeconds,leapYear);
      remainingSeconds=showDay(remainingSeconds);
      remainingSeconds=showHour(remainingSeconds);
      remainingSeconds=showMinute(remainingSeconds);
      System.out.println(remainingSeconds+"    Atlanta,US Time");
 }   
   
    public static boolean isLeapYear(int year)
  {
      if( (year%4==0 && year%100!=0) || year%400==0 ) return true;    
      return false;
  }   
    
    public static boolean commonOrLeapYear(long remainingSeconds)
  {
      int year=1970;
      for( ; ; year++)
          {  
             int days=365;
             if(isLeapYear(year))days=366;
             long yearSeconds=days*24*60*60;
             if( remainingSeconds<=yearSeconds ) 
               {
                   if(days==366)return true;
                   else return false;
               }
             remainingSeconds-=yearSeconds;
          }
  }
    
    public static long showYear(long remainingSeconds)
  {
      int year=1970;
      for( ; ; year++)
          {  
             int days=365;
             if(isLeapYear(year))days=366;
             long yearSeconds=days*24*60*60;
             if( remainingSeconds<=yearSeconds ) 
               {
                   System.out.print(year+" ");
                   break;
               }
             remainingSeconds-=yearSeconds;
          }
      return remainingSeconds;
  } 
    
    public static long showMonth(long remainingSeconds, boolean leapYear)
  {
      long monthSeconds=0;
      for( int month=1; month<=12; month++)
         {
            monthSeconds=monthSeconds(month,leapYear);
            if(remainingSeconds <= monthSeconds)
              {
                 String monthName="";
                 switch(month)
                   {
                     case 1: monthName="January"; break;
                     case 2: monthName="February"; break;
                     case 3: monthName="March"; break;
                     case 4: monthName="April"; break;
                     case 5: monthName="May"; break;
                     case 6: monthName="June"; break;
                     case 7: monthName="July"; break;
                     case 8: monthName="August"; break;
                     case 9: monthName="September"; break;
                     case 10: monthName="October"; break;
                     case 11: monthName="November"; break;
                     case 12: monthName="December"; break;
                   }
                 System.out.print(monthName+" ");
                 break;
              }
            remainingSeconds -= monthSeconds;
         }
      return remainingSeconds;
  }
    
    public static long monthSeconds(int month, boolean leapYear)
  {
      long monthSeconds=0;
      long daySeconds=24*60*60;
      switch(month)
        {
          case 1: monthSeconds=31*daySeconds; break;   
          case 2: monthSeconds=leapYear? 29*daySeconds:28*daySeconds;; break; 
          case 3: monthSeconds=31*daySeconds; break;
          case 4: monthSeconds=30*daySeconds; break; 
          case 5: monthSeconds=31*daySeconds; break; 
          case 6: monthSeconds=30*daySeconds; break; 
          case 7: monthSeconds=31*daySeconds; break; 
          case 8: monthSeconds=31*daySeconds; break; 
          case 9: monthSeconds=30*daySeconds;; break; 
          case 10: monthSeconds=31*daySeconds; break; 
          case 11: monthSeconds=30*daySeconds;; break; 
          case 12: monthSeconds=31*daySeconds; break; 
        }
      return monthSeconds;
  }
    
   public static long showDay(long remainingSeconds)
 {
     long daySeconds=24*60*60;
     for(int day=1; day<=31; day++)
        {
           if( remainingSeconds<= daySeconds)
             {
                System.out.print(day+"  "); 
                break;
             }
           remainingSeconds -= daySeconds;
        }
     return remainingSeconds;
 } 
   
   public static long showHour(long remainingSeconds)
 {
     long hourSeconds=60*60;
     for(int hour=0; hour<=24; hour++)
        {
           if( remainingSeconds<= hourSeconds)
             {
                hour -= 5;  //Atlanta,USA Time
                System.out.print(hour+":"); 
                break;
             }
           remainingSeconds -= hourSeconds;
        }
     return remainingSeconds;
 }
   
   public static long showMinute(long remainingSeconds)
 {
     long minuteSeconds=60;
     for(int minute=0; minute<=60; minute++)
        {
           if( remainingSeconds<= minuteSeconds)
             {
                System.out.print(minute+":"); 
                break;
             }
           remainingSeconds -= minuteSeconds;
        }
     return remainingSeconds;
 }
}
