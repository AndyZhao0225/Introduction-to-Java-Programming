import java.util.Scanner;

  public class ATM 
{
    public static void main(String[] args)
  {
      Account[] accounts = new Account[10];
      for( int i=0; i<=9; i++)
          accounts[i] = new Account(i,100);
      
      Scanner input = new Scanner(System.in);
      
      while(true)
           {
              System.out.print("\nEnter an id: ");
              int id = input.nextInt();
              while( id<0 || id>9 )
                   {
                      System.out.println("Please enter a valid id !");
                      System.out.print("Enter an id: ");
                      id = input.nextInt();
                   }
      
              boolean exit = false;
              while( !exit )
                   { 
                      System.out.println("\nMain menu");
                      System.out.println("1.check balance");
                      System.out.println("2.withdraw");
                      System.out.println("3.deposit");
                      System.out.println("4.exit");
      
                      System.out.print("Enter a choice: ");
                      int choice = input.nextInt();
                      while( choice<1 || choice>4 )
                           {
                              System.out.println("Please enter a valid choice !");
                              System.out.print("Enter a choice: ");
                              choice = input.nextInt();
                           }
      
                      if( choice==1 )
                        {
                           System.out.println("The balance is "+accounts[id].getBalance());
                        }
      
                      if( choice==2 )
                        {
                           System.out.print("Enter an amount to withdraw: ");
                           accounts[id].withdraw(input.nextDouble());
                        }
      
                      if( choice==3 )
                        {
                           System.out.println("Enter an amount to deposit: ");
                           accounts[id].deposit(input.nextDouble());
                        }
      
                      if( choice==4 )
                        {
                           exit = true;   
                        }
                   }
           }
  }    
}
