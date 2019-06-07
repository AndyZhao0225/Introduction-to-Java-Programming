import java.util.Scanner;

  public class DecimalToBinary 
{
    public static void main(String[] args)
  {
      System.out.print("Enter a decimal integer: ");
      Scanner input=new Scanner(System.in);
      int decimal=input.nextInt();
      int value=decimal;
      int digit=0;
      String bin="";
      if(value==0)System.out.println("The binary number which equals to it is\n0");
      else
        {
           while(value!=0)
              {
                 digit=value%2;
                 if(digit==0)bin="0"+bin;
                 if(digit==1)bin="1"+bin;
                 value=value/2;
              }
           System.out.println("The binary number which equals to it is\n"+bin);
        }
  }    
}
