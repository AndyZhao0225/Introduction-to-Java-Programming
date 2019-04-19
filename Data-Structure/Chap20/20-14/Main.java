import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = input.nextLine();
      System.out.println(upperLetterNum(str));
  }   
    
    public static int upperLetterNum(String str)
  {
      return upperLetterNum(str,0,0);
  }
    
    public static int upperLetterNum(String str, int index, int count)
  {
      if(index>=str.length()) return count;
      if(Character.isUpperCase(str.charAt(index))) count++;
      index++;
      return upperLetterNum(str,index,count);
  }
}
