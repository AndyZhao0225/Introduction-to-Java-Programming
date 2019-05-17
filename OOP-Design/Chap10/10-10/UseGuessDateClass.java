import java.util.Scanner;

  public class UseGuessDateClass 
{
    public static void main(String[] args)
  { 
      Scanner input = new Scanner(System.in);
      int date = 0; 
      int answer;

      for( int i=1; i<=5; i++) 
         {
            System.out.println("\nIs your birth date in Set"+(i+1)+"?");       
            for( int j=0; j<4; j++) 
               {
                  for( int k=0; k<4; k++) System.out.print(GuessDate.getValue(i,j,k)+"  ");
                  System.out.println();
               }
            System.out.print("\nEnter 0 for No and 1 for Yes: ");
            answer = input.nextInt();
            if( answer==1 ) date += GuessDate.getValue(i,0,0);
         }
       System.out.println("Your birth date is "+date);
  }    
}
