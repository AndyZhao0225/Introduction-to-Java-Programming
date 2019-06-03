  public class NewClass 
{
    public static void main(String[] args)
  {
      int win=0;
      for(int i=0; i<=9999; i++)
        {
           int sum=roll();
           if(sum==7 || sum==11) 
             {
                System.out.println("You win");
                win++;
             }
           else if(sum==2 || sum==3 || sum==12) System.out.println("You lose");
           else 
             {
                System.out.println("point is "+sum);
                int temp=sum;
                int mark=0;
                while(mark==0)
                    {
                       sum=roll();
                       if(sum==temp) 
                         {
                            System.out.println("You win");
                            win++;
                            mark=1;
                         }
                       else if(sum==7) 
                              {
                                 System.out.println("You lose");
                                 mark=1;
                              }
                     }
              }
          System.out.println();
        }
      System.out.println("You win "+win+" times totally.");
  }    
    
    public static int roll()
  {
      int number1=(int)(1+Math.random()*(6-1+1));
      int number2=(int)(1+Math.random()*(6-1+1));
      System.out.println("You rolled "+number1+" + "+number2+" = "+(number1+number2));
      return number1+number2;  
  }
}