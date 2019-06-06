  public class ShowLeapYear 
{
    public static void main(String[] args)
  {
      int count=0;
      for(int year=2001;year<=2100;year++)
        {
           if( (year%4==0 && year%100!=0) || (year%400==0) )
             {
                System.out.print(year+" ");
                count++;
                if(count==10)
                  {
                     count=0;
                     System.out.println();
                  }
             }
        }
      System.out.println();
  }    
}
