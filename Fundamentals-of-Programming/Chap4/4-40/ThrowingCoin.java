  public class ThrowingCoin 
{
    public static void main(String[] args)
  {
      int obverse=0,reverse=0,number;
      for(int i=0;i<=99;i++)
         {
            number=(int)(Math.random()*10);
            if(number%2==0)obverse++;
            else reverse++;
         }
      System.out.println("obverse side: "+obverse+" times\n"
                         +"reverse side: "+reverse+" times");
  }    
}
