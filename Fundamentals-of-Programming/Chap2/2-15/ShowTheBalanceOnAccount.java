  public class ShowTheBalanceOnAccount 
{
      public static void main(String[] args)
    {
        double balance=100;
        final double INTEREST_RATE=0.00417;
        balance=balance*(1+INTEREST_RATE);
        balance=balance*(1+INTEREST_RATE);
        balance=balance*(1+INTEREST_RATE);
        balance=balance*(1+INTEREST_RATE);
        balance=balance*(1+INTEREST_RATE);
        balance=balance*(1+INTEREST_RATE);
        balance=(int)(balance*100)/100.00;
        System.out.println("The balance on the account after 6 months is "+balance);
    }
}
