import java.util.Date;

  public class Account 
{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();
    
    Account()
  {
  
  }
    
    Account(int newId, int newBalance)
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
    
    public void setBalance(double newBalance)
  {
      balance = (newBalance>0)? newBalance: 0;
  }
    
    public void setAnnualInterestRate(double newAnnualInterestRate)
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
}
