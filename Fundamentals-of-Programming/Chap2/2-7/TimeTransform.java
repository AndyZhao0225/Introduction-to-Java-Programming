import java.util.Scanner;

  public class TimeTransform
{
     public static void main(String[] args)
   {
        Scanner input=new Scanner(System.in);
        int minutes,years,days;
        System.out.print("Enter the number of minutes:");
        minutes=input.nextInt();
        years=minutes/365/24/60;
        days=(minutes%(365*24*60))/24/60;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days.");
   }  
}
