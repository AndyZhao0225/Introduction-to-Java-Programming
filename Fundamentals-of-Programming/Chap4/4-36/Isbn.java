import javax.swing.JOptionPane;

  public class Isbn   
{
    public static void main(String[] args)
  {
      String input;
      int firstNineDigits,digit=0,sum=0,i=9;;
      input=JOptionPane.showInputDialog("Enter the first nine digits of the ISBN");
      firstNineDigits=Integer.parseInt(input);
      
      int remaining=firstNineDigits,d10;
      while(remaining>=10)
         {
            digit=remaining%10;
            sum+=digit*i;
            i--;
            remaining=remaining/10;
         }
      sum+=remaining*i;
      
      d10=sum%11;
      if(d10!=10)JOptionPane.showMessageDialog(null,input+d10);
      else JOptionPane.showMessageDialog(null,input+'X');   
  }
}
