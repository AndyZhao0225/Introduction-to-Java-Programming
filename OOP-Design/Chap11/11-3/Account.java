import java.util.Date;

  public class Account 
{
    protected int id = 0;
    protected double balance = 0;
    protected static double annualInterestRate = 0;
    protected Date dateCreated = new Date();
    
    public Account()
  {
  
  }
    
    public Account(int newId, double newBalance)
  {
      id = newId;
      balance = newBalance;
  }
    
    public int getId()
  {
      return id;
  }
    
    public double getBalance()
  {
      return balance;
  }
    
    public static double getAnnualInterestRate()
  {
      return annualInterestRate;
  }
    
    public void setId(int newId)
  {
      id = newId;
  }
    
    public static void setAnnualInterestRate(double newAnnualInterestRate)
  {
      annualInterestRate = (newAnnualInterestRate>0)? newAnnualInterestRate: 0;
  }
    
    public Date getDateCreated()
  {
      return dateCreated;
  }
    
    public double getMonthlyInterestRate()
  {
      return annualInterestRate/12;
  }
    
    public void withdraw(double amount)
  {
      balance -= amount;
  }
    
    public void deposit(double amount)
  {
      balance += amount;
  }
    
    public String toString()
  {
      return "Account: \n"
           + "ID: " + id + "\n"
           + "Balance: "+ balance + "\n";
  }
}
