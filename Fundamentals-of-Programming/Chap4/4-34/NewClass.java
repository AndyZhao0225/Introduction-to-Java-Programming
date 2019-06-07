import java.util.Scanner;

 public class NewClass 
{ 
    public static void main(String[] args)
  {
      int userCount=0,computerCount=0;
      while(userCount<2 && computerCount<2)
        {
           System.out.print("scissor(0),rock(1),paper(2): ");
           Scanner input=new Scanner(System.in);
           int user=input.nextInt();
           int computer=(int)(Math.random()*10)%3;
           switch(computer)
              {
                 case 0:System.out.print("The computer is scissor. ");break;
                 case 1:System.out.print("The computer is rock. ");break;
                 case 2:System.out.print("The computer is paper. ");
              }
           switch(user)
              {
                 case 0:System.out.print("You are scissor");break; 
                 case 1:System.out.print("You are rock");break;
                 case 2:System.out.print("You are paper"); 
              } 
           if(user==computer)
             { 
                 System.out.println(" too. It is a draw");
                 computerCount=0;
                 userCount=0;
             }
           else 
             {
                 if(((user==0)&&(computer==2))||((user==1)&&(computer==0))||((user==2)&&(computer==1)))
                   {
                      System.out.println(". You won.");
                      userCount++;
                      computerCount=0;
                   }
                 else 
                   {
                      System.out.println(". You lose.");
                      computerCount++;
                      userCount=0;
                   }
             }
        }
      if(userCount==2)System.out.println("\nYou have already won 2 times consecutively. You are the final winner!");
      else System.out.println("\nThe computer has already won 2 times consecutively. You are the final loser.");
  }   
}
