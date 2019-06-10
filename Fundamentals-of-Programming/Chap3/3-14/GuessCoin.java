import java.util.Scanner;
 
  public class GuessCoin 
{
    public static void main(String[] args)
  {
     Scanner input=new Scanner(System.in);
     int coin=(int)(Math.random()*10)%2;
     System.out.print("Please enter your guess for the coin side\n"
                     +"( 0 represents obverse side, 1 for reverse side ): ");
     int guess=input.nextInt();
     System.out.print("The coin shows its ");
     if(coin==0)System.out.print("obverse side\n");
     else System.out.print("reverse side\n");
     System.out.println("Your guess is "+(guess==coin));
  }
}
