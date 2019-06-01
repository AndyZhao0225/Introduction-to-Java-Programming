  public class NewClass 
{
    public static void print(char ch1, char ch2, int numberPerLine)
  {
      int count=0;
      for( char i=ch1; i<=ch2; i++)
         {
            System.out.print(i+" "); 
            count++;
            if(count==numberPerLine)
              {
                 System.out.println(); 
                 count=0;
              }
         }
      System.out.println();
  }
    
    public static void main(String[] args)
  {
      print('1', 'Z', 10);
  }    
}
