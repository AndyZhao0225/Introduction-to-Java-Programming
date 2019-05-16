  public class SavingAccount extends Account
{
    public SavingAccount()
  {
  
  }
    
    public SavingAccount(int newId, int newBalance)
  {
      super(newId,newBalance);
  }
    
    public String toString()
  {
      return "SavingAccount: \n"
           + "ID: " + id + "\n"
           + "Balance: "+balance + "\n";
  }
}
