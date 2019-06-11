import java.util.Scanner;

  public class WhatDayIsToday 
{
   public static void main(String[] args)
 {
     System.out.print("Enter year (e.g., 2008): ");
     Scanner input=new Scanner(System.in);
     int year=input.nextInt();
     System.out.print("Enter month: ");
     int m=input.nextInt();
     System.out.print("Enter the day of the month : ");
     int q=input.nextInt();
     int totalDaysOfTheMonth;
     switch(m)
       {
         case 1:m=13;year--;totalDaysOfTheMonth=31;break;       
         case 2:m=14;if((year%4==0&&year%100!=0)||year%400==0)totalDaysOfTheMonth=29;else totalDaysOfTheMonth=28;year--;break;
         case 3:totalDaysOfTheMonth=31;break;
         case 4:totalDaysOfTheMonth=30;break;
         case 5:totalDaysOfTheMonth=31;break;
         case 6:totalDaysOfTheMonth=30;break;
         case 7:totalDaysOfTheMonth=31;break;
         case 8:totalDaysOfTheMonth=31;break;
         case 9:totalDaysOfTheMonth=30;break;
         case 10:totalDaysOfTheMonth=31;break;    
         case 11:totalDaysOfTheMonth=30;break;    
         case 12:totalDaysOfTheMonth=31;break;
         default: totalDaysOfTheMonth=0;
       }
     if(q>totalDaysOfTheMonth)
       {
         System.out.println("Your input is not valid !");
         System.exit(0);
       }
     int j=year/100;
     int k=year%100;
     int h=(q+26*(m+1)/10+k+k/4+j/4+5*j)%7;
     String weekDay;
     switch(h)
       {
         case 0:weekDay="Saturday";break;
         case 1:weekDay="Sunday";break;
         case 2:weekDay="Monday";break;
         case 3:weekDay="Tuesday";break;
         case 4:weekDay="Wednesday";break;
         case 5:weekDay="Thursday";break;
         case 6:weekDay="Friday";break;
         default: weekDay="";
       }
     System.out.println("Day of the week is "+weekDay);
 }    
}
