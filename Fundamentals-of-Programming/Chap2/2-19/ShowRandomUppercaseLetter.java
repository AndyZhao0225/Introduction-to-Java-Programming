import java.util.Scanner;

  public class ShowRandomUppercaseLetter 
{     public static void main(String[] args)
   {  
       Scanner input=new Scanner(System.in);
       long randomNumber,totalMilliseconds;
       char upperLetter;
       totalMilliseconds=System.currentTimeMillis();
       randomNumber=totalMilliseconds%26;
       upperLetter=(char)(randomNumber+65);
       System.out.println(upperLetter);
   }
}
