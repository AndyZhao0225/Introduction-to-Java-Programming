  public class MyString2 
{
    String str = "";
    boolean abnormal = false;
    
    public MyString2(String s)
  {
      str = s;
  }
    
    public int compare(String s)
  {
      int l = str.length()>s.length()? s.length(): str.length();
      int i;
      for( i=0; i<=l-1; i++)
         {
            char a = str.charAt(i);
            char b = s.charAt(i);
            if( a != b ) return a-b;              
         }
      if( str.length() > s.length() ) return str.charAt(i);
      else if( str.length() < s.length() ) return -s.charAt(i);
      else return 0;
  }
    
    public MyString2 subString(int begin)
  {
      String tempS = "";
      if( begin < 0 || begin >=str.length() )
        {
           abnormal = true;
           return new  MyString2(tempS); 
        } 
      for( int i=begin; i<=str.length()-1; i++)
          tempS += str.charAt(i);
      return new  MyString2(tempS);  
  }
    
    public MyString2 toUpperCase()
  {
      String tempS = "";
      for( int i=0; i<=str.length()-1; i++)
         {
            char ch = str.charAt(i);
            if( Character.isLowerCase(ch) ) ch = Character.toUpperCase(ch);
            tempS += ch;
         }
      return new MyString2(tempS);
  }
    
    public char[] toChars()
  {
      char[] value = new char[str.length()];
      for( int i=0; i<=str.length()-1; i++)
          value[i] = str.charAt(i);   
      return value;
  }
    
    public static MyString2 valueOf(boolean b)
  {
      String tempS = "";
      tempS = b? "true": "false";
      return new MyString2(tempS);
  }
}