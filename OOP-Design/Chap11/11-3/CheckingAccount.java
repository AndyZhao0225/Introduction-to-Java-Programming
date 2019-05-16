  public class CheckingAccount extends Account 
{
    private double overdraftMax;  
      
    public CheckingAccount()
  {
      
  }
    
    public CheckingAccount(int newId, int newBalance)
  {
      super(newId,newBalance);
  }
    
    public String toString()
  {
      return "CheckingAccount: \n"
           + "ID: " + id + "\n"
           + "Balance: "+balance + "\n";
  }
}
