import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String s = input.nextLine();
      MyString2 myStr = new MyString2(s);
      
      System.out.println("Enter another string: ");
      String sCom = input.nextLine();
      System.out.println(myStr.compare(sCom));
      
      System.out.println("Enter an index: ");
      int index = input.nextInt();
      MyString2 subMyStr = myStr.subString(index);
      if( subMyStr.abnormal ) 
        {
           System.out.println("Invalid input");
           System.exit(0);
        } 
      System.out.println(subMyStr.str);
      
      System.out.println(myStr.toUpperCase().str);
      
      char[] chars = myStr.toChars();
      for( int i=0; i<=chars.length-1; i++)
          System.out.print(chars[i]);
      
      System.out.println("\n"+myStr.valueOf(true).str);
      System.out.println(myStr.valueOf(false).str);
  }    
}
