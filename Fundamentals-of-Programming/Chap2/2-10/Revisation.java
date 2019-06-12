 import javax.swing.JOptionPane;

   public class Revisation 
{
     public static void main(String[] args)
   {
       double amount;
       int remainingAmount,numberOfOneDollars,numberOfQuarters,numberOfDimes,numberOfNickels,numberOfPennies;
       String amountString=JOptionPane.showInputDialog("Enter an amount in double, for example 11.56:");
       amount=Double.parseDouble(amountString);
       remainingAmount=(int)(amount*100);
       numberOfOneDollars=remainingAmount/100;
       remainingAmount=remainingAmount%100;
       numberOfQuarters=remainingAmount/25;
       remainingAmount=remainingAmount%25;
       numberOfDimes=remainingAmount/10;
       remainingAmount=remainingAmount%10;
       numberOfNickels=remainingAmount/5;
       remainingAmount=remainingAmount%5;
       numberOfPennies=remainingAmount;
       String output="Your amount "+amount+" consists of\n"+
            "\t"+numberOfOneDollars+" dollars\n"+  
            "\t"+numberOfQuarters+" quarters\n"+
            "\t"+numberOfDimes+" dimes\n"+
            "\t"+numberOfNickels+" nickels\n"+
            "\t"+numberOfPennies+" pennies";
       JOptionPane.showMessageDialog(null,output);
   }
}
