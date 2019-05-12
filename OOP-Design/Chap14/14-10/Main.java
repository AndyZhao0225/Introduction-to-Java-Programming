import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      GregorianCalendar gCal;
      int month;
      int year;
      
      if( args.length==0 )  gCal = new GregorianCalendar();
      else if( args.length==1 ) 
        {
           GregorianCalendar temp = new GregorianCalendar();
           month = Integer.parseInt(args[0])-1;
           gCal = new GregorianCalendar(temp.get(Calendar.YEAR),month,1);
        }
      else if( args.length==2 )
        {
           year = Integer.parseInt(args[1]);
           month = Integer.parseInt(args[0])-1;
           gCal = new GregorianCalendar(year,month,1);
        }
      else
        {
           System.out.println("Usage: java Main Month Year");
           System.exit(0);
           return;
        }
      
      printMonth(gCal);
  }   
    
    public static void printMonth(GregorianCalendar gCal)
  {
      printMonthTitle(gCal);
      printMonthBody(gCal);  
  }
     
    public static void printMonthTitle(GregorianCalendar gCal) 
  {
      System.out.println("         " + getMonthName(gCal.get(Calendar.MONTH)+1) + " " + gCal.get(Calendar.YEAR));
      System.out.println("-----------------------------");
      System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
  }
    
    public static String getMonthName(int month) 
  {
      String monthName = "";
      switch(month) 
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
    
    public static void printMonthBody(GregorianCalendar gCal)
  {
      int startDay = gCal.get(Calendar.DAY_OF_WEEK) - 1;
      for( int i=0; i<startDay; i++)
          System.out.print("    ");
      
      for( int i=1; i<=gCal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) 
         {
            System.out.printf("%4d", i);
            if( (i+startDay)%7==0 ) System.out.println();
         }
      System.out.println();
  }
}
