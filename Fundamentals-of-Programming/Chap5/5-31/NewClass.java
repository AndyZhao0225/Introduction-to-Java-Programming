import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      System.out.print("Enter a card number: ");
      long cardNumber=input.nextLong();
      
      if(isValid(cardNumber)) System.out.println("The card number is legal.");
      else System.out.println("The card number is illegal.");
  }   
    
    public static boolean isValid(long number)
  {
      int sum1 = step1AndStep2(number);
      int sum2 = sumOfOddPlace(number);
      int sum=sum1+sum2;
      if( sum % 10 == 0 )return true;
      else return false;
  }
    
    public static int getDigit(int number)
  {
      int temp=number*2;
      if(temp<=9) return temp;
      else
        {
           int singleDigit= temp%10;
           return 1+singleDigit;
        } 
  }
    
    public static int step1AndStep2(long number)
  {
      int size = getSize(number);
      int i = size - 1;
      long remaining = number;
      int sum = 0;
      while( i >= 0 )
           {
              long evenDigit = remaining / (long)(Math.pow(10,i)); 
              sum += getDigit((int)evenDigit);
              i--;
              if( i == -1 ) break;
              remaining = remaining % (long)(Math.pow(10,i));
              i--;
           }   
      return sum;
  }
    
    public static int sumOfOddPlace(long number)
  {
      int size = getSize(number);
      int i = size - 1;
      long remaining = number;
      int sum=0;
      while(i>=0)
           {
              remaining = remaining % (long)(Math.pow(10,i)); 
              i--;
              if(i==-1)break;
              long oddDigit = remaining / (long)(Math.pow(10,i));
              sum+=oddDigit;
              i--;
           }   
      return sum;
  }
    
    public static int getSize(long d)
  {
      if( Math.pow(10,13)>d && d>= Math.pow(10,12) ) return 13;
      if( Math.pow(10,14)>d && d>= Math.pow(10,13) ) return 14;
      if( Math.pow(10,15)>d && d>= Math.pow(10,14) ) return 15;
      if( Math.pow(10,16)>d && d>= Math.pow(10,15) ) return 16;
      return 0;
  }
}
