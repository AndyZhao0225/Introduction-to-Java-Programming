import java.util.Scanner;
import java.util.InputMismatchException;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      boolean done = false;
      
      do
        {
           System.out.print("Input two integers: ");       
           try
             {   
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println(num1+num2);
                done = true;
             }
           catch(InputMismatchException ex)
             {
                System.out.println("Invalid input! Please input again!");
                input.nextLine();
             }
        }while( !done );
  }    
}
