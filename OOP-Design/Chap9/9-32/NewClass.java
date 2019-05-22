import javax.swing.JOptionPane;

  public class NewClass 
{
    public static void main(String[] args)
  {
      String input = JOptionPane.showInputDialog(null,"Enter a first-9-digit of a ISBN","Input",JOptionPane.QUESTION_MESSAGE);
      JOptionPane.showMessageDialog(null,input+lastDigit(input),"Display Message",JOptionPane.INFORMATION_MESSAGE);      
  }    
    
    public static char lastDigit(String input)
  {
      int temp = 0;
      for( int i=0; i<=input.length()-1; i++)
          temp += (input.charAt(i)-'0') * (i+1);
      int remaining = temp % 11;
      if( remaining == 10 ) return 'X';
      else return String.valueOf(temp % 11).charAt(0);      
  }
} 
