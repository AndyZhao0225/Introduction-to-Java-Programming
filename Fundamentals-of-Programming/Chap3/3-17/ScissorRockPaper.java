import java.util.Scanner;

  public class ScissorRockPaper 
{
    public static void main(String[] args)
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
      if(user==computer)System.out.println(" too. It is a draw");
      else 
        {
           if(((user==0)&&(computer==2))||((user==1)&&(computer==0))||((user==2)&&(computer==1)))System.out.println(". You won.");
           else System.out.println(". You lose.");
        }
  }    
}
