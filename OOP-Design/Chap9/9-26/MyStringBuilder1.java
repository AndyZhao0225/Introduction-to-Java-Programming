  public class MyStringBuilder1 
{
    char[] storage;  
    int capacity;
      
    public MyStringBuilder1(String s)
  {
      capacity = s.length()+16;
      storage = new char[capacity];
      for( int i=0; i<=s.length()-1; i++)
          storage[i] = s.charAt(i);
  }    
    
    public int length()
  {
      int i = 0;
      for( ; i<=capacity-1; i++)
          if( storage[i] == '\u0000' ) break;
      return i;
  }
    
    public MyStringBuilder1 append(MyStringBuilder1 s)
  {
      int l1 = this.length();
      int l2 = s.length();
      if( l2 <= capacity - l1 )
        {
           for( int i=l1; i<=l1+l2-1; i++)
               storage[i] = s.storage[i-l1];
        }
      else
        { 
           char[] temp = storage;
           while( capacity < l1 + l2 ) capacity = 2 * (capacity+1);
           storage = new char[capacity];        
           for( int i=0; i<=l1-1; i++) storage[i] = temp[i];
           for( int j=0; j<=l2-1; j++) storage[l1+j] = s.storage[j];
        }
      return this;
  }
    
    public MyStringBuilder1 append(int n)
  {
      boolean negative = n<0? true: false;
      if(negative) n = -n;
      char[] temp = new char[1000];
      int remaining = n;
      int i;
      for( i=0; remaining!=0; i++)
         {
            temp[i] = transfer(remaining%10); 
            remaining /= 10;
         }
      char[] number = negative? new char[i+1]: new char[i];
      int j = 0;
      if(negative) number[j++] = '-';
      for( int k=0; k<=i-1; k++)
          number[k+j] = temp[i-k-1];                
      return this.append(new MyStringBuilder1(new String(number)));
  }
    
    public static char transfer(int digit)
  {
      switch(digit)
              {
                case 0: return '0';
                case 1: return '1';
                case 2: return '2';
                case 3: return '3';
                case 4: return '4';
                case 5: return '5';
                case 6: return '6';
                case 7: return '7';
                case 8: return '8';
                case 9: return '9';
                default: return '\u0000';
              }
  }
    
    public char charAt(int index)
  {
      if( index<0 || index>=this.length() ) return '\u0000';
      return storage[index];
  }
    
    public MyStringBuilder1 toLowerCase()
  {
      for( int i=0; i<=this.length()-1; i++)
          if( Character.isUpperCase(storage[i]) ) storage[i] = Character.toLowerCase(storage[i]);   
      return this;
  }
    
    public MyStringBuilder1 toSubString(int begin, int end)
  {
      if( begin<0 || end<=begin || this.length()<end ) return new MyStringBuilder1("Invalid input!");
      char[] sub = new char[end-begin];
      for( int i=begin; i<=end-1; i++)
          sub[i-begin] = storage[i];
      return new MyStringBuilder1(new String(sub));
  }
    
    public String toString()
  {
      return String.valueOf(storage);
  }
}
