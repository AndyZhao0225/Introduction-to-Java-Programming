import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.print("How many student's record are you going to input? ");
      Scanner input=new Scanner(System.in);
      int numOfStudent=input.nextInt();
     
      System.out.print("Enter a student's name: ");
      String highestStu=input.next();
      System.out.print("Enter the student's score: ");
      int highestScore=input.nextInt();
      
      System.out.print("Enter a student's name: ");
      String higherStu=input.next();
      System.out.print("Enter the student's score: ");
      int higherScore=input.nextInt();
     
      if(highestScore<higherScore)
        {
           String temp=highestStu;
           highestStu=higherStu;
           higherStu=temp;
           
           int tempo=highestScore;
           highestScore=higherScore;
           higherScore=tempo;
        }
      
      for(int i=3;i<=numOfStudent;i++)
         {
            System.out.print("Enter a student's name: ");
            String stu=input.next();
            System.out.print("Enter the student's score: ");
            int score=input.nextInt();
            
            if(higherScore<score)
              {
                 String temp=stu;
                 stu=higherStu;
                 higherStu=temp;
           
                 int tempo=score;
                 score=higherScore;
                 higherScore=tempo;
               }
            
            if(highestScore<higherScore)
              {
                 String temp=highestStu;
                 highestStu=higherStu;
                 higherStu=temp;
           
                 int tempo=highestScore;
                 highestScore=higherScore;
                 higherScore=tempo;
              }
         }
      System.out.println("\nThe student with highest score is "+highestStu);
      System.out.println("The student with second high score is "+higherStu);
  }    
}
