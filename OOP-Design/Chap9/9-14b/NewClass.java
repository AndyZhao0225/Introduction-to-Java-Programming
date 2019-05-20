  public class NewClass 
{
    public static void main(String[] args)
  { 
      StringBuilder[] numbers = new StringBuilder[args[0].length()];
      for( int i=0; i<=args[0].length()-1; i++) numbers[i] = new StringBuilder();
      int n = 0;  
      for( int i=0; i<=args[0].length()-1; i++)
         {
            char ch = args[0].charAt(i);
            if( ch == ' ' ) 
              {
                 n++;
                 continue;
              }
            if( ch != ' ' ) numbers[n].append(ch);
         }
      
      int sum = 0;
      for( int i=0; i<=n; i++) 
          sum += Integer.parseInt(numbers[i].toString());
      System.out.println(sum);
  }   
}
