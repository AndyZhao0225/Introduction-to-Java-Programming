package rit;

public class Main 
{
   public static final int BASE_YEAR = 1970;	
	
   public static void main(String[] args) 
   {
	  long timePast = System.currentTimeMillis();
	  System.out.println("Current date and time is " + computeDateAndTime(timePast));
   }
   
   
   public static String computeDateAndTime( long timePast) 
   {
	  StringBuilder sb = new StringBuilder();
	  long remainder = computeYear(timePast,sb);
	  int year = Integer.parseInt(sb.toString().trim());
	  boolean leapYear = isLeapYear(year); 
	  remainder = computeMonth(remainder,sb,leapYear); 
	  String month = sb.toString().substring(4).trim();	  
	  remainder = computeDate(remainder,sb,leapYear,month); 
	  sb.delete(0,5);
	  sb.append(", " + year + "  ");
	  remainder = computeHour(remainder,sb); 
	  remainder = computeMinute(remainder,sb);
	  computeSecond(remainder,sb);
	  return sb.toString(); 
   }
   
   
   public static boolean isLeapYear( int year) 
   {
	  if(year%4==0 || year%400==0) return true; 
	  return false;   
   }
   
   
   public static long computeYear( long timePast, StringBuilder sb) 
   {
	  long millisecInAYear = 365L*24L*60L*60L*1000L;
      long millisecInALeapYear = 366L*24L*60L*60L*1000L; 
	  long millisecInFourYear =  millisecInAYear*3 +  millisecInALeapYear;   
	  int quotient = (int)(timePast/millisecInFourYear); 
	  long remainder = timePast%millisecInFourYear; 
	  int year = BASE_YEAR + quotient*4;
	  for( int i=0; i<=3; i++) 
	     {
		    long temp; 
		    if(i==2)  temp = millisecInALeapYear;
		    else temp = millisecInAYear; 
		    if(remainder>temp) 
		      {
		         year++;
		         remainder -= temp;
		      }
	     }
	  sb.append(year);
	  return remainder; 
   }
   
   
   public static long computeMonth( long remainder, StringBuilder sb,  boolean leapYear) 
   {
	  for( int i=1; i<=12; i++) 
	     {
		    int daysInTheMonth;
		    if(i==1|| i==3 || i==5 || i==7 || i==8 || i==10 || i==12)  daysInTheMonth = 31;
		    else if(i==2 && leapYear)  daysInTheMonth = 29;
		    else if(i==2 && !leapYear)   daysInTheMonth = 28;
		    else  daysInTheMonth = 30;
		    long millisecInTheMonth = daysInTheMonth*24L*60L*60L*1000L;
		    if(remainder>millisecInTheMonth)  remainder -= millisecInTheMonth; 
		    else 
		      {
		         if(i==1) sb.append(" Jan");	
		         else if(i==2) sb.append(" Feb");	
		         else if(i==3) sb.append(" Mar");
		         else if(i==4) sb.append(" Apr");
		         else if(i==5) sb.append(" May");
		         else if(i==6) sb.append(" Jun");
		         else if(i==7) sb.append(" Jul");
		         else if(i==8) sb.append(" Aug");
		         else if(i==9) sb.append(" Sep");
		         else if(i==10) sb.append(" Oct");
		         else if(i==11) sb.append(" Nov");
		         else if(i==12) sb.append(" Dec");
		         break;
		      }  	        			      
	     }	   
	  return remainder; 
   }
   
   
   public static long computeDate( long remainder, StringBuilder sb, boolean leapYear, String Month) 
   {
	  int numOfDays = 0;
	  switch(Month) 
	    {
	       case "Jan": 
	       case "Mar": 
	       case "May":
	       case "Jul": 
	       case "Aug": 
	       case "Oct":
	       case "Dec": 
	    	 numOfDays = 31; break;  
	       case "Apr": 
	       case "Jun": 
	       case "Sep":
	       case "Nov": 
	    	 numOfDays = 30; break;  
	       case "Feb": 
             numOfDays = leapYear? 29: 28;
	    }
	  long millisecInADay = 24L*60L*60L*1000L;
	  int day = 1;
	  for( int i=1; i<=numOfDays; i++) 
	     {
		    if(remainder>millisecInADay) 
		      {
		         remainder -= millisecInADay;
		    	 day++;
		      }
		    else 
		      {
		    	 sb.append(" " + day);
		    	 break;
		      }
	     }
	  return remainder;   
   }
   
   
   public static long computeHour( long remainder, StringBuilder sb) 
   {
	  long millisecInAnHour = 60L*60L*1000L;
	  int hour = (int)(remainder / millisecInAnHour);
	  if(hour<10)  sb.append("0");
      sb.append(hour);
	  remainder %= millisecInAnHour;
	  return remainder;   
   }
   
   
   public static long computeMinute( long remainder, StringBuilder sb) 
   {
	  long millisecInAMinute = 60L*1000L;
	  int minute = (int)(remainder / millisecInAMinute);
	  if(minute<10)  sb.append(":0 " + minute);
	  else sb.append(": " + minute);
	  remainder %= millisecInAMinute;
	  return remainder;   
   }
   
   
   public static void computeSecond( long remainder, StringBuilder sb) 
   {
	  long millisecInASecond = 1000L;
	  int second = (int)(remainder / millisecInASecond);
	  if(second<10)  sb.append(": 0" + second);
	  else  sb.append(": " + second);
   }
}
