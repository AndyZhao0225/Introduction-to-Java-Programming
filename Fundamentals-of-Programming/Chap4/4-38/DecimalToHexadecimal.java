import java.util.Scanner;

  public class DecimalToHexadecimal 
{
    public static void main(String[] args)
  {
      System.out.println("Enter an integer in decimal: ");
      Scanner input=new Scanner(System.in);
      int dec=input.nextInt();
      int value=dec;
      if(value==0)
        {
          System.out.println("The hexadecimal number which equals to it is: \n0");
          System.exit(0);
        }
      int number;
      String hex="";
      String addition="";
      while(value!=0)
        {
           number=value%16;
           switch(number)
               {
                   case 0:addition="0";break; 
                   case 1:addition="1";break;
                   case 2:addition="2";break;
                   case 3:addition="3";break;
                   case 4:addition="4";break;
                   case 5:addition="5";break;
                   case 6:addition="6";break;
                   case 7:addition="7";break;
                   case 8:addition="8";break;
                   case 9:addition="9";break;
                   case 10:addition="A";break;
                   case 11:addition="B";break;
                   case 12:addition="C";break;
                   case 13:addition="D";break;
                   case 14:addition="E";break;
                   case 15:addition="F";break;
                   default:;
               }
           hex=addition+hex;
           value=value/16; 
        }
     System.out.println("The hexadecimal number which equals to it is: \n"+hex); 
  }    
}
