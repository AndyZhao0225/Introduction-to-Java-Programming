import javax.swing.JOptionPane;

  public class NewClass 
{
    public static void main(String[] args)
  {
      String cardNumber = JOptionPane.showInputDialog(null,"Enter a card number","Input",JOptionPane.QUESTION_MESSAGE);   
      if(isValid(cardNumber)) JOptionPane.showMessageDialog(null,"The card number is legal.","Display Message",JOptionPane.INFORMATION_MESSAGE);
      else JOptionPane.showMessageDialog(null,"The card number is illegal.","Display Message",JOptionPane.INFORMATION_MESSAGE);
  } 
    
    public static boolean isValid(String cardNumber)
  {
      int sum1 = step1AndStep2(cardNumber);
      if( sum1 == -1 ) return false;
      int sum2 = sumOfOddPlace(cardNumber);
      int sum = sum1 + sum2;
      if( sum % 10 == 0 ) return true;
      else return false;
  }
    
    public static int getDigit(char number)
  {
      int temp = ( number - '0' ) * 2;
      if( temp <= 9 ) return temp;
      else
        {
           int singleDigit = temp % 10;
           return 1 + singleDigit;
        } 
  }
    
    public static int step1AndStep2(String cardNumber)
  {
      if( cardNumber.length()<13 || cardNumber.length()>16 ) return -1;
      int sum = 0;
      for( int i=0; i <=cardNumber.length()-1; i+=2)
          sum += getDigit(cardNumber.charAt(i));
      return sum;
  }
    
    public static int sumOfOddPlace(String cardNumber)
  {
      int sum = 0;
      for( int i=1; i<=cardNumber.length()-1; i+=2)
          sum += cardNumber.charAt(i) - '0';
      return sum;
  }
}
