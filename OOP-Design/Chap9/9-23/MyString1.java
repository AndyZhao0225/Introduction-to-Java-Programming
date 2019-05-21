  public class MyString1 
{
    String str = "";
    char[] value;
    boolean illegal = false;
      
    public MyString1(char[] chars)
  {
      for( int i=0; i<=chars.length-1; i++)
          str += chars[i];
      value = chars;
  } 
    
    public char charAt(int index)
  {
      return value[index];
  }
    
    public int length()
  {
      return value.length;
  }
    
    public MyString1 substring(int begin, int end)
  {
      if( begin < 0 || end > value.length || end<=begin ) 
        {
           illegal = true;
           return this;
        }
      char[] subValue = new char[end-begin];
      int j = 0;
      for( int i=begin; i<=end-1; i++)
          subValue[j++] = value[i];
      return new MyString1(subValue);
  }
    
    public MyString1 toLowerCase()
  {
      char[] tempValue = new char[value.length];
      for( int i=0; i<=tempValue.length-1; i++)
         {
            tempValue[i] = value[i]; 
            if( 65<=tempValue[i] && tempValue[i]<=90 ) tempValue[i] += ('a'-'A');  
         }
      return new MyString1(tempValue);
  }
    
    public boolean equals(MyString1 s)
  {
      if( s.length() != value.length ) return false;
      for( int i=0; i<=value.length-1; i++)
          if( value[i] != s.value[i] ) return false;
      return true;
  }
    
    public static MyString1 valueOf(int n)
  {
      int remainder = -1;
      char[] number = new char[10];
      boolean negative = false;
      int quotient;
      if( n < 0 ) 
        {
           quotient = -n;
           negative = true;
        }
      else quotient = n;
      
      int i = 0;
      while( quotient != 0 )
           {
              remainder = quotient % 10;
              number[i++] = (char)( '0' + remainder );
              quotient /= 10;
           }
      if( negative ) number[i++] = '-';
      char[] finalNumber = new char[i];
      for( int j=0; j<=i-1; j++)
          finalNumber[j] = number[i-j-1];
      return new MyString1(finalNumber);
  }
}
