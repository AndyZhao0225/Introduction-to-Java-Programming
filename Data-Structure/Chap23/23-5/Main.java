import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter  series of numbers ending with 0: ");
      int[] array = new int[10000];
      int index = 0;
      int num = input.nextInt();
      while(num!=0)
           {
              array[index] = num;
              index++;
              num = input.nextInt();
           }
      
      int[] answers = find(array,index);
      System.out.println("The longest same number sequence starts at index " + answers[0] + " with " 
                         + answers[1] + " values of " + array[answers[0]]);
  }   
    
    public static int[] find( int[] array, int index)
  {
      int[] answers = new int[2];
      int maxCount = 0;
      int maxIndex = 0;
      int j;
      for( int i=0; i<=index-maxIndex; i=j)
         {
            int count = 1;
            for( j=i+1; j<=index-1; j++)
               {
                  if(array[j]==array[i]) count++;
                  else break;  
               }
            if(count>maxCount)  
              {
                 maxCount = count;
                 maxIndex = i;
              }
         }
      
      answers[0] = maxIndex;
      answers[1] = maxCount;
      return answers;
  }
}
