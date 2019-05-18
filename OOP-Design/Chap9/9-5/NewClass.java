import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = input.nextLine();
      
      int[] counts = count(str);
      
      for( int i=0; i<=counts.length-1; i++)
          if( counts[i] != 0 ) System.out.println(i+" appears "+counts[i]+((counts[i]>=2)?" times":" time"));   
  }   
    
    public static int[] count(String s)
  {
      int[] counts = new int[10];
      for( int i=0; i<=s.length()-1; i++)
          if( Character.isDigit(s.charAt(i)) ) counts[s.charAt(i)-'0']++;
      return counts;
  }
}
