import java.util.Scanner;

  public class ComputeCurrentTime 
{
     public static void main(String[] args)
   {
       int timeZone; 
       long totalMilliseconds,totalSeconds,currentSecond,totalMinutes,currentMinute,totalHours,currentHour,currentLocalHour;
       Scanner input=new Scanner(System.in);
       System.out.print("Enter the time zone offset to GMT: "); 
       timeZone=input.nextInt();
       totalMilliseconds=System.currentTimeMillis();
       totalSeconds=totalMilliseconds/1000;
       currentSecond=totalSeconds%60;
       totalMinutes=totalSeconds/60;
       currentMinute=totalMinutes%60;
       totalHours=totalMinutes/60;
       currentHour=totalHours%24;
       currentLocalHour=currentHour+timeZone;
       System.out.println("The current time is "+currentLocalHour+":"+currentMinute+":"+currentSecond);
   }
}
