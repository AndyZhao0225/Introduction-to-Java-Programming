  public class MyCharacter 
{
    char ch;
      
    public MyCharacter(char value)
  {
      ch = value; 
  }    
    
    public char charValue()
  {
      return ch;
  }
    
    public int compareTo(MyCharacter myCharacter)
  {
      return this.ch - myCharacter.ch;
  }
    
    public boolean equals(MyCharacter myCharacter)
  {
      return (this.ch-myCharacter.ch==0)? true: false;
  }
    
    public static boolean isDigit(char cha)
  { 
      return ('0'<=cha&&cha<='9')? true: false; 
  }
    
    public static boolean isLetter(char cha)
  {
      return ('A'<=cha&&cha<='Z') || ('a'<=cha&&cha<='z')? true: false; 
  }
    
    public static boolean isLetterOrDigit(char cha)
  {
      return isDigit(cha)||isLetter(cha)? true: false;
  }
    
    public static boolean isLowerCase(char cha)
  {
      return 'a'<=cha&&cha<='z'? true: false;
  }
    
    public static boolean isUpperCase(char cha)
  {
      return 'A'<=cha&&cha<='Z'? true: false;
  }
    
    public static char toLowerCase(char cha)
  {
      if( isUpperCase(cha) ) return cha += 32;
      else return '0';
  }
    
    public static char toUpperCase(char cha)
  {
      if( isLowerCase(cha) ) return cha -= 32;
      else return '0';
  }
}
