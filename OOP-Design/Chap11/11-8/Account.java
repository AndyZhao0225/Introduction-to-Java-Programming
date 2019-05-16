import java.util.Date;
import java.util.ArrayList;

  public class Account 
{
    private int id = 0;
    private double balance = 0;
    private static double annualInterestRate = 0;
    private Date dateCreated = new Date();  
    private String name;
    private ArrayList transactions = new ArrayList();
    
      public Account()
    {
  
    }
    
      public Account( int newId, int newBalance)
    {
        id = newId;
        balance = newBalance;
    }
      
      public Account( String name, int id, double balance)
    {
        this.name = name;
        this.id = id;
        this.balance = balance;
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
    
      public String getName()
    {
        return name;
    }
      
      public ArrayList getTransactions()
    {
        return transactions;
    }
      
      public String getEachTransactionDescription(int index)
    {
        return transactions.get(index).toString();
    }
      
      public void setTransactions(ArrayList newTransactions)
    {
        transactions = newTransactions;
    }
      
      public void setName(String newName)
    {
        name = newName;
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
    
      public void withdraw(Transaction transaction)
    {
        transactions.add(transaction);
        balance -= transaction.getAmount();
    }
    
      public void deposit(Transaction transaction)
    {
        transactions.add(transaction);
        balance += transaction.getAmount();
    } 
}
