import javax.swing.JOptionPane;

  public class Sort 
{
     public static void main(String[] args)
  {
       int number1,number2,number3;
       String number1String,number2String,number3String;
       number1String=JOptionPane.showInputDialog("Enter the first number: ");
       number1=Integer.parseInt(number1String);
       number2String=JOptionPane.showInputDialog("Enter the second number: ");
       number2=Integer.parseInt(number2String);
       number3String=JOptionPane.showInputDialog("Enter the third number: ");
       number3=Integer.parseInt(number3String);
       if(number1<number2)
         {
            if(number1<number3)
              {
                 if(number2<number3)JOptionPane.showMessageDialog(null,number1+"<="+number2+"<="+number3);
                 else JOptionPane.showMessageDialog(null,number1+"<="+number3+"<="+number2);
              }
            else JOptionPane.showMessageDialog(null,number3+"<="+number1+"<="+number2);
         }
       else 
         {
            if(number2<number3)
              {
                 if(number1<number3)JOptionPane.showMessageDialog(null,number2+"<="+number1+"<="+number3);
                 else JOptionPane.showMessageDialog(null,number2+"<="+number3+"<="+number1);
              }
            else JOptionPane.showMessageDialog(null,number3+"<="+number2+"<="+number1);
         }
  }    
}
