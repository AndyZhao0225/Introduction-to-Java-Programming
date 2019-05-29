import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int number = input.nextInt();
      String[] name = new String[number]; 
      int[] score = new int[number];
      for( int i=0; i<=number-1; i++)
         {
            System.out.println();
            System.out.print("Enter a student's name: ");
            name[i] = input.next();
            System.out.print("Enter the student's score: ");
            score[i] = input.nextInt();
         }
      display( name, score );
  }
    
    public static void display(String[] name, int[] score)
  {
      int l = score.length;
      int currentMax;
      int currentMaxIndex;
      for( int i=0; i<=l-2; i++)
         {
            currentMax = score[i];
            currentMaxIndex = i;
            for( int j=i+1; j<=l-1; j++)
               {
                  if( score[j] > currentMax)
                    {
                       currentMax = score[j];
                       currentMaxIndex = j;
                    }  
               }
            if(currentMaxIndex != i)
              {
                 score[currentMaxIndex] = score[i];
                 score[i] = currentMax; 
                 String temp = name[currentMaxIndex];
                 name[currentMaxIndex] = name[i];
                 name[i] = temp; 
              }
         }
      System.out.println();
      for( int i=0; i<=l-1; i++)
          System.out.printf("%-10s%-3d\n",name[i],score[i]);         
  }
}
