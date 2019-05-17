  public class MyInteger 
{
    private int value;
    
    public MyInteger(int value)
  {
      this.value = value;
  }
    
    public int getValue()
  {
      return value;
  }
    
    public boolean isEven()
  {
      if( value%2==0 ) return true;
      else return false;
  }
    
    public boolean isOdd()
  {
      if( value%2!=0 ) return true;
      else return false;
  }
    
    public boolean isPrime()
  {
      if( value<=1 ) return false;
      for( int divisor=2; divisor<=value/2; divisor++)
          if( value%divisor==0 ) return false;
      return true;         
  }
    
    public static boolean isEven(int temp)
  {
      if( temp%2==0 ) return true;
      else return false;
  }
    
    public static boolean isOdd(int temp)
  {
      if( temp%2!=0 ) return true;
      else return false;
  }
    
    public static boolean isPrime(int temp)
  {
      if( temp<=1 ) return false;
      for( int divisor=2; divisor<=temp/2; divisor++)
          if( temp%divisor==0 ) return false;
      return true; 
  }
    
    public static boolean isEven(MyInteger temp)
  {
      if( temp.value%2==0 ) return true;
      else return false;
  }
    
    public static boolean isOdd(MyInteger temp)
  {
      if( temp.value%2!=0 ) return true;
      else return false;
  }
    
    public static boolean isPrime(MyInteger temp)
  {
      if( temp.value<=1 ) return false;
      for( int divisor=2; divisor<=temp.value/2; divisor++)
          if( temp.value%divisor==0 ) return false;
      return true; 
  }
    
    public boolean equals(int temp)
  {
      if( temp==value ) return true;
      else return false;
  }
    
    public boolean equals(MyInteger temp)
  {
      if( value==temp.value ) return true;
      else return false;
  }
    
    public static int parseInt(char[] array)
  {
      char[] record;
      int startPos = ( array[0]=='-' )? 1: 0;
      int recordLen = array.length-startPos;
      record = new char[recordLen];
      System.arraycopy( array, startPos, record, 0, recordLen);
      int sum = 0;
      for( int i=0; i<=recordLen-1; i++)
          sum += (record[i]-'0') * Math.pow(10,recordLen-i-1);
      if( startPos==1 ) sum = -sum;
      return sum;
  }
    
    public static int parseInt(String str)
  {
      return parseInt(str.toCharArray());
  }
}
