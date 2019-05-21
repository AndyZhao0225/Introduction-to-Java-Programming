import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      MyStringBuilder2 myStrB1 = new MyStringBuilder2();
      System.out.println(myStrB1.length());
      System.out.println(myStrB1.capacity); 
      
      System.out.println("\nEnter a string: ");
      MyStringBuilder2 myStrB2 = new MyStringBuilder2(input.nextLine().toCharArray());
      System.out.println(myStrB2.length());
      System.out.println(myStrB2.capacity);
      System.out.println(new String(myStrB2.storage));       
      
      System.out.println("\nEnter another string: ");
      MyStringBuilder2 myStrB3 = new MyStringBuilder2(input.nextLine());
      System.out.println(myStrB3.length());
      System.out.println(myStrB3.capacity);
      System.out.println(new String(myStrB3.storage));
      
      System.out.println("\n"+new String(myStrB3.reverse().storage));
      System.out.println(myStrB3.length());
      System.out.println(myStrB3.capacity);
      
      System.out.print("\nEnter an index: ");
      int index1 = input.nextInt();
      if( index1>=myStrB3.length() || index1<0 ) System.out.println("Invalid input!");
      else System.out.println(new String(myStrB3.substring(index1).storage));
      
      System.out.println("\n"+new String(myStrB3.toUpperCase().storage));
      
      System.out.print("\nEnter an offset of the string3 :");
      int offset = input.nextInt();
      if( offset>=myStrB3.length() || offset<0 ) System.out.println("Invalid input!");
      else 
        {
           System.out.println(new String(myStrB3.insert(offset, myStrB2).storage));
           System.out.println(myStrB3.length());
           System.out.println(myStrB3.capacity);
        }                        
  }    
}
