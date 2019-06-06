import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("Enter year: ");
      Scanner input=new Scanner(System.in);
      int year=input.nextInt();
      System.out.print("Enter what week day it is for the first day of the year: ");
      int firstWeekDay=input.nextInt();
      
      boolean isLeapYear=(year%4==0 && year%100!=0) || (year%400==0);
      String month="",weekDayString="";
      int monthDay=0,weekDay=firstWeekDay;
      for(int i=1; i<=12; i++)
        {
           switch(i)
              {
                 case 1: month="January";   monthDay=31; break;
                 case 2: month="February";  if(isLeapYear)monthDay=29; else monthDay=28; break;   
                 case 3: month="March";     monthDay=31; break;
                 case 4: month="April";     monthDay=30; break;
                 case 5: month="May";       monthDay=31; break;
                 case 6: month="June";      monthDay=30; break;
                 case 7: month="July";      monthDay=31; break;
                 case 8: month="August";    monthDay=31; break;
                 case 9: month="September"; monthDay=30; break;
                 case 10:month="October";   monthDay=31; break;
                 case 11:month="November";  monthDay=30; break;
                 case 12:month="December";  monthDay=31; break;    
                 default:;
              } 
           switch(weekDay)
         {
            case 1: weekDayString="Monday";   break;
            case 2: weekDayString="Tuesday";  break;
            case 3: weekDayString="Wedneday"; break;
            case 4: weekDayString="Thursday"; break;
            case 5: weekDayString="Friday";   break;
            case 6: weekDayString="Saturday"; break;
            case 0: weekDayString="Sunday";   break;    
            default:;    
         }
           System.out.println(month+" 1, "+year+" is "+weekDayString);
           
           if(i==12)break;
           for(int j=1;j<=monthDay;j++)
              {
                 weekDay++;
                 if(weekDay==7)weekDay=0;
              }
        }  
  }    
}
