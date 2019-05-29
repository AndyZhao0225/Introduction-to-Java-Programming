import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of students: ");
      int numOfStu = input.nextInt();
      int[] grades = new int[numOfStu];
      System.out.print("Enter "+numOfStu+" scores: ");
      for( int i=0; i<numOfStu; i++)
         grades[i] = input.nextInt();
      int best=findTheBest(grades);
      for( int i=0; i<numOfStu; i++)
         {
            System.out.print("Student "+i+" score is "+grades[i]+" and grade is ");
            System.out.println(gradeLevel(grades[i], best));
         }   
  }
    
   public static int findTheBest(int[] array)
 {
      int best=array[0];
      for( int i=1; i<=array.length-1; i++)
          if(array[i]>best) best=array[i];   
      return best;
 }
   
   public static char gradeLevel(int grade, int best)
 {
     if(grade >= best-10) return 'A';
     else if(grade >= best-20) return 'B';
     else if(grade >= best-30) return 'C';
     else if(grade >= best-40) return 'D';
     else return 'F';
 }
}