import java.util.Scanner;
import java.util.Date;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      String[] str = new String[10];
      for( int i=0; i<=9; i++)
          str[i] = input.next();
      System.out.println(max(str));
      
      System.out.println();
      Integer[] number = new Integer[10];
      for( int i=0; i<=9; i++)
          number[i] = input.nextInt();
      System.out.println(max(number));
      
      System.out.println();
      Date[] date = new Date[10];
      for( int i=0; i<=9; i++)
          date[i] = new Date();
      System.out.println(max(date));
  } 
    
    public static Object max(Comparable[] a)
  {
      Comparable max = a[0];
      for( int i=1; i<=a.length-1; i++)
          if( max.compareTo(a[i])<0 ) max = a[i]; 
      return max;
  }
}
