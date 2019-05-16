import java.util.Date;

  public class Transaction 
{
    private Date date;    
    private char type;
    private double amount;
    private double balance;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description)
  {
      this.type = type;
      this.amount = amount;
      this.balance = balance;
      this.description = description;
      date = new Date();
  }
    
    public char getType()
  {
      return type;
  }
    
    public void setType( char newType)
  {
      type = newType;
  }
    
    public double getAmount()
  {
      return amount;
  }
    
    public void setAmount( double newAmount)
  {
      amount = newAmount;
  }
    
    public double getBalance()
  {
      return balance;
  }
  
    public String getDescription()
  {
      return description;
  }
    
    public void setBalance(double newBalance)
  {
      balance = newBalance;
  }
    
    public void setDescription(String newDescription)
  {
      description = newDescription;
  }
    
    public String getDate()
  {
      return date.toString();
  }
    
    public void setDate(Date newDate)
  {
      date = newDate;
  }
    
    public String toString()
  {
      return this.getDescription();
  } 
}
