import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a string: ");
      String str = input.nextLine();
      char[] data = str.toCharArray();
      MyString1 myStr = new MyString1(data);
      System.out.println(myStr.str);
      
      System.out.print("Enter an index; "); 
      int index = input.nextInt();
      System.out.println("The character at "+index+" is "+myStr.charAt(index));
      
      System.out.println("The string length is "+myStr.length());
      
      System.out.println(myStr.toLowerCase().str);
      
      System.out.print("Enter a begin index and an end index: ");
      int begin = input.nextInt();
      int end = input.nextInt();
      myStr.substring(begin,end);
      if( !myStr.illegal ) System.out.println(myStr.substring(begin,end).str);
      else
        {
           System.out.println("Your input is invalid! ");
           System.exit(0);
        }
   
      input.nextLine();
      System.out.print("Enter another string: ");
      String str2 = input.nextLine();
      char[] data2 = str2.toCharArray();
      MyString1 myStr2 = new MyString1(data2);
      System.out.println(myStr.equals(myStr2)? "Equivalent":"Not equaivalent");
      
      System.out.print("Enter an integer: ");
      int number = input.nextInt();
      System.out.println(myStr.valueOf(number).str);
  }   
}
