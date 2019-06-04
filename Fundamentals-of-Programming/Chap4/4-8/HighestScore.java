import java.util.Scanner;

  public class HighestScore 
{
    public static void main(String[] args)
  {
      System.out.print("Enter the number of students: ");
      Scanner input=new Scanner(System.in);
      int numOfStudent=input.nextInt();
      
      System.out.print("Enter a student's name: ");
      String highestStu=input.next();
      System.out.print("Enter the student's score: ");
      int highestScore=input.nextInt();
      
      for(int i=2;i<=numOfStudent;i++)
        {
           System.out.print("Enter a student's name: ");
           String student=input.next();
           System.out.print("Enter the student's score: ");
           int score=input.nextInt();  
           if(score>highestScore)
             {
                highestStu=student;
                highestScore=score;
             }
        }
      System.out.println("The student with highest score is "+highestStu);
  }    
}
