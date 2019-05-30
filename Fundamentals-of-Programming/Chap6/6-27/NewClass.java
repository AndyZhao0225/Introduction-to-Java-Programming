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
      System.out.println("identical.");;
  }  
    
    public static boolean equal(int list1[], int list2[])
  {
      int l1 = list1.length; 
      int l2 = list2.length; 
      if( l1 != l2) return false; 
      while( l1 != 0 )
           {
              boolean equal = false;
              for( int j=0; j<=l2-1; j++)
                 {
                    if( list1[l1-1] == list2[j] )
                      {
                         equal = true;
                         l1--;
                         for( int k=j; k<=l2-2; k++)
                             list2[k] = list2[k+1];  
                         l2--;
                         break;
                      }    
                 }
              if( equal == false) return false;
           }
      return true;
  } 
}
