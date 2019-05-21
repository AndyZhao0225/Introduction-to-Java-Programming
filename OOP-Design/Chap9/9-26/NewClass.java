import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      MyStringBuilder1 myStrB = new MyStringBuilder1(input.nextLine());
      
      System.out.println("\n"+myStrB.toString());
      System.out.println("string length: "+myStrB.length());
      System.out.println("capacity: "+myStrB.capacity);
      
      System.out.println("\nEnter another string to append to that string: ");
      MyStringBuilder1 myStrB2 = new MyStringBuilder1(input.nextLine());
      myStrB.append(myStrB2);
      System.out.println(myStrB.toString());
      
      System.out.print("\nEnter an integer: ");
      System.out.println(myStrB.append(input.nextInt()).toString());  
      
      System.out.print("\nEnter an index: ");
      char ch = myStrB.charAt(input.nextInt());
      if( ch == '\u0000' ) System.out.println("Invalid input!");
      else System.out.println(ch);
      
      System.out.println("\n"+myStrB.toLowerCase().toString());
      
      System.out.print("\nEnter an index as a beginning: ");
      int begin = input.nextInt();
      System.out.print("Enter an index as an end: ");
      int end = input.nextInt();
      System.out.println(myStrB.toSubString(begin,end).toString());
  }      
}
