import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = input.nextLine();
      System.out.print("Enter a character: ");
      char a = input.next().charAt(0);
      System.out.println("\n" + a + " appears " + count(str,a) + " time(s) in " + str);
  }   
    
    public static int count(String str, char a)
  {
      if(str.length()==0) return 0;
      if(str.charAt(0)==a) return 1 + count(str.substring(1),a);
      else return count(str.substring(1),a);
  }
}
