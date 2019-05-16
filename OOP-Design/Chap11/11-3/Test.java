
  public class Test 
{
    public static void main(String[] args)
  {      
      Account account = new Account(1,3000);
      CheckingAccount checkingAccount = new CheckingAccount(2,2400);
      SavingAccount savingAccount = new SavingAccount(3,1800);
      
      System.out.println(account.toString());
      System.out.println(checkingAccount.toString());
      System.out.println(savingAccount.toString());
  }    
}
