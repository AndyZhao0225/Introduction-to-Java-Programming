  public class MyStringBuilder2 
{
    char[] storage;
    int capacity;
      
    public MyStringBuilder2()
  {
      capacity = 16;
      storage = new char[capacity];
  }
    
    public MyStringBuilder2(char[] chars)
  {
      capacity = chars.length + 16;
      storage = new char[capacity];
      for( int i=0; i<=chars.length-1; i++)
          storage[i] = chars[i];
  }
    
    public MyStringBuilder2(String s)
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
    
    public MyStringBuilder2 insert(int offset, MyStringBuilder2 s)
  { 
      int l1 = this.length();
      int l2 = s.length();
      while( l1+l2 > capacity ) 
            capacity = 2 * (capacity+1);
      char[] temp = new char[l1+l2];
      for( int i=0; i<=offset-1; i++)
          temp[i] = storage[i];
      for( int i=offset; i<=l1-1; i++)
          temp[i+l2] = storage[i];
      for( int i=0; i<=l2-1; i++)
          temp[offset+i] = s.storage[i];
      storage = new char[capacity];
      for( int i=0; i<=temp.length-1; i++)
          storage[i] = temp[i];
      return this;
  }
    
    public MyStringBuilder2 reverse()
  {
      int l = this.length();
      char[] temp = new char[l];
      for(int i=0; i<=l-1; i++)
          temp[i] = storage[l-i-1];
      for( int i=0; i<=l-1; i++)
          storage[i] = temp[i];
      return this;
  }
    
    public MyStringBuilder2 substring(int begin)
  {
      int l = this.length();
      char[] temp =new char[l-begin];
      for( int i=begin; i<=l-1; i++)
          temp[i-begin] = storage[i];
      return new MyStringBuilder2(temp);
  }
    
    public MyStringBuilder2 toUpperCase()
  {
      for( int i=0; i<=this.length()-1; i++)
          if( Character.isLowerCase(storage[i]) ) storage[i] = Character.toUpperCase(storage[i]);   
      return this;
  }
}
