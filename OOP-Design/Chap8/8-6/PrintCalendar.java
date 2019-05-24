import javax.swing.JOptionPane;

  public class PrintCalendar 
{
      
    public static String output;  
    private int year, month;
    
    PrintCalendar(int newYear, int newMonth)
  {
      year = newYear;
      month = newMonth;
  }

    public void printMonth() 
  {
      output = makeMonthTitle(year,month);
      output += makeMonthBody(year,month);
      JOptionPane.showMessageDialog(null,output);
  }

    public String makeMonthTitle(int newYear, int newMonth) 
  {
      String title;
      title = "         " + getMonthName(newMonth)+ "   " + newYear;
      title += "\n----------------------------------------------------";
      title += "\n  Sun   Mon   Tue   Wed   Thu   Fri   Sat";
      return title;
  }

    public String getMonthName(int newMonth) 
  {
      String monthName = "";
      switch (newMonth) 
             {
                case 1: monthName = "January"; break;
                case 2: monthName = "February"; break;
                case 3: monthName = "March"; break;
                case 4: monthName = "April"; break;
                case 5: monthName = "May"; break;
                case 6: monthName = "June"; break;
                case 7: monthName = "July"; break;
                case 8: monthName = "August"; break;
                case 9: monthName = "September"; break;
                case 10: monthName = "October"; break;
                case 11: monthName = "November"; break;
                case 12: monthName = "December";
             }
       return monthName;
  }

    public String makeMonthBody(int newYear, int newMonth) 
  {
      String monthBody = "";
      int startDay = getStartDay(newYear,newMonth);
      int numberOfDaysInMonth = getNumberOfDaysInMonth(newYear,newMonth);
      monthBody += "\n";
      int i = 0;
      for( i=0; i<startDay; i++) monthBody += "          ";
      for( i=1; i<=numberOfDaysInMonth; i++) 
         {
            if(i<10) monthBody += "     "+0+i;
            else     monthBody += "     "+i;
            if( ( i + startDay ) % 7 == 0) monthBody +="\n";
         }
      monthBody += "\n";
      return monthBody;
  }

 
    public int getStartDay(int newYear, int newMonth) 
  {
      final int START_DAY_FOR_JAN_1_1800 = 3;
      int totalNumberOfDays = getTotalNumberOfDays(newYear,newMonth);
      return ( totalNumberOfDays + START_DAY_FOR_JAN_1_1800 ) % 7;
  }

  
    public int getTotalNumberOfDays(int newYear, int newMonth) 
  {
      int total = 0;
      for( int i=1800; i<newYear; i++)
         {
            if(isLeapYear(i)) total = total + 366;
            else total = total + 365;
         }
      for(int i=1; i<newMonth; i++)
          total = total + getNumberOfDaysInMonth(newYear,i);
      return total;
  }

 
    public int getNumberOfDaysInMonth(int newYear, int newMonth) 
  {
      if( newMonth == 1 || newMonth == 3 || newMonth == 5 || newMonth == 7 ||
          newMonth == 8 || newMonth == 10 || newMonth == 12 ) return 31;
      if( newMonth == 4 || newMonth == 6 || newMonth == 9 || newMonth == 11 ) return 30;
      if( newMonth == 2 ) return isLeapYear(newYear)? 29 : 28;
      return 0; 
  }

    public boolean isLeapYear(int newYear) 
  {
      return newYear % 400 == 0 || ( newYear % 4 == 0 && newYear % 100 != 0 );
  }
}
