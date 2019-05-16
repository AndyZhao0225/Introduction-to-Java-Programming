import java.util.Date;

  public class Test 
{
    public static void main(String[] args)
  {   
      Account george = new Account("George",1122,1000);
      george.setAnnualInterestRate(0.015);
      
      double testAmount = 30; 
      char testType = 'D';
      Transaction trans1 = new Transaction(testType,testAmount,george.getBalance(),
                                           testType + "  ***  " + testAmount + "  on " + (new Date()).toString());
      george.deposit(trans1);
      
      testAmount = 40;
      Transaction trans2 = new Transaction(testType,testAmount,george.getBalance(),
                                           testType + "  ***  " + testAmount + "  on " + (new Date()).toString());
      george.deposit(trans2);
      
      testAmount = 50;
      Transaction trans3 = new Transaction(testType,testAmount,george.getBalance(),
                                           testType + "  ***  " + testAmount + "  on " + (new Date()).toString());
      george.deposit(trans3);
      
      
      testAmount = 5;
      testType = 'W';
      Transaction trans4 = new Transaction(testType,testAmount,george.getBalance(),
                                           testType + "  ***  " + testAmount + "  on " + (new Date()).toString());
      george.withdraw(trans4);
      
      testAmount = 4;
      testType = 'W';
      Transaction trans5 = new Transaction(testType,testAmount,george.getBalance(),
                                           testType + "  ***  " + testAmount + "  on " + (new Date()).toString());
      george.withdraw(trans5);
      
      testAmount = 2;
      testType = 'W';
      Transaction trans6 = new Transaction(testType,testAmount,george.getBalance(),
                                           testType + "  ***  " + testAmount + "  on " + (new Date()).toString());
      george.withdraw(trans6);
      
      System.out.println("Account holder: " + george.getName());
      System.out.println("Annual Interest Rate: " + george.getAnnualInterestRate());
      System.out.println("Balance: " + george.getBalance());
      System.out.println();
      for( int i=0; i<=george.getTransactions().size()-1; i++)
          System.out.println(george.getEachTransactionDescription(i).toString());
  }    
}
