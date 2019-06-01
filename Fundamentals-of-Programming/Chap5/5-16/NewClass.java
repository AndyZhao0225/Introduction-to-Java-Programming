  public class NewClass 
{
    public static int numberofDaysInAYear(int year)
  {
      boolean isLeapYear=false;
      int numberOfDays;
      
      if( (year%4==0 && year%100!=0) || (year%400==0) ) isLeapYear=true;
      
      if(isLeapYear)numberOfDays=366;
      else numberOfDays=365;
      return numberOfDays;
  }
    
    public static void main(String[] args)
  {
      System.out.println("Year        Number_of_days");
      for(int year=2000; year<=2010; year++) 
          System.out.println(year+"        "+numberofDaysInAYear(year));
  }    
}
