import java.util.Scanner;

  public class Test 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter 5 strings: ");
      String str1 = input.nextLine();
      String str2 = input.nextLine();
      String str3 = input.nextLine();
      String str4 = input.nextLine();
      String str5 = input.nextLine();
      
      System.out.println();
      
      MyStack stack = new MyStack();
      stack.push(str1);
      stack.push(str2);
      stack.push(str3);
      stack.push(str4);
      stack.push(str5);
      
      for( int i=0; !stack.isEmpty(); i++)
          System.out.println(stack.pop());
  }    
}
