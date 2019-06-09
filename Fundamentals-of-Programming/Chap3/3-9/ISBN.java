import javax.swing.JOptionPane;

  public class ISBN 
{
     public static void main(String[] args)
   {
       String input;
       int firstNineDigits,d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,remaining;
       input=JOptionPane.showInputDialog("Enter the first nine digits of the ISBN");
       firstNineDigits=Integer.parseInt(input);
       d9=firstNineDigits%10;
       remaining=firstNineDigits/10;
       d8=remaining%10;
       remaining=remaining/10;
       d7=remaining%10;
       remaining=remaining/10;
       d6=remaining%10;
       remaining=remaining/10;
       d5=remaining%10;
       remaining=remaining/10;
       d4=remaining%10;
       remaining=remaining/10;
       d3=remaining%10;
       remaining=remaining/10;
       d2=remaining%10;
       remaining=remaining/10;
       d1=remaining;
       d10=(d1*1+d2*2+d3*3+d4*4+d5*5+d6*6+d7*7+d8*8+d9*9)%11;
       if(d10!=10)JOptionPane.showMessageDialog(null,input+d10);
       else JOptionPane.showMessageDialog(null,input+'X');
         
   }    
}
