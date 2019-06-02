import java.util.Scanner;

   public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a time length in milliseconds: ");
      long millis=input.nextLong();
      System.out.println("The corresponding time length is\n"+"    "+convertMillis(millis));
  }    
    
    public static String convertMillis(long millis)
  {
      long totalSeconds=millis/1000;
      long hours=totalSeconds/3600;
      long remainingSeconds=totalSeconds%3600;
      long minutes=remainingSeconds/60;
      long seconds=remainingSeconds%60;
      String strHour = String.valueOf(hours);
      String strMinute = String.valueOf(minutes);
      String strSecond = String.valueOf(seconds);
      return strHour+" : "+strMinute+" : "+strSecond;
  }   
}
