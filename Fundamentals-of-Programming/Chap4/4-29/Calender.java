import java.util.Scanner;

  public class Calender 
{
    public static void main(String[] args)
  {
      System.out.print("Enter a year: ");
      Scanner input=new Scanner(System.in);
      int year=input.nextInt();
      System.out.print("Enter what week day it is for the first day of this year: ");
      int weekDay=input.nextInt();
      
      boolean leapYear=((year%4==0 && year%100!=0) || year%400==0)? true: false;
      String monthName;
      int monthDays=0;
      System.out.println();
      for(int month=1;month<=12;month++)
         {
            switch(month)
                {
                    case 1:monthName="January";monthDays=31; break;
                    case 2:monthName="February"; if(leapYear==true)monthDays=29;else monthDays=28;break;
                    case 3:monthName="March"; monthDays=31; break;
                    case 4:monthName="April"; monthDays=30; break;
                    case 5:monthName="May"; monthDays=31; break;
                    case 6:monthName="June"; monthDays=30; break;
                    case 7:monthName="July"; monthDays=31; break;
                    case 8:monthName="August"; monthDays=31; break;
                    case 9:monthName="Septemper"; monthDays=30; break;
                    case 10:monthName="October"; monthDays=31; break;
                    case 11:monthName="November"; monthDays=30; break;
                    case 12:monthName="December"; monthDays=31; break;
                    default:monthName="";
                }
            System.out.printf("\t\t%s %d\t\t\n",monthName,year);  
            System.out.println("----------------------------------------------");
            System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat   ");
            
            for(int i=0;i<weekDay;i++)System.out.print("      ");
            for(int j=1;j<=monthDays;j++)
               {
                  System.out.printf("%2d    ",j);
                  weekDay++;
                  if(weekDay==7)
                    {
                      System.out.println();  
                      weekDay=0;
                    }
               }
            System.out.println("\n");
        }
  }    
}
