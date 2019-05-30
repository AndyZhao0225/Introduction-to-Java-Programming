import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter list1 :");
      int length1 = input.nextInt();
      int[] list1 = new int[length1];
      for( int i=0; i<length1; i++)
          list1[i] = input.nextInt();
      
      System.out.println("Enter list2 :");
      int length2 = input.nextInt();
      int[] list2 = new int[length2];
      for( int i=0; i<length2; i++)
          list2[i] = input.nextInt();  
      
      System.out.print("Two lists are ");
      if( ! equal(list1, list2)) System.out.print("not ");
      System.out.println("strictly identical.");;
  }  
    
    public static boolean equal(int list1[], int list2[])
  {
      if( list1.length != list2.length ) return false;
      for( int i=0; i<list1.length; i++)
          if( list1[i] != list2[i] ) return false;    
      return true;
  } 
}