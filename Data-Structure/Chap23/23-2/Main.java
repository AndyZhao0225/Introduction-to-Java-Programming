import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a string: ");
      String str = input.next();
      System.out.println(maxAscendStr(str));
  }    
    
    public static String maxAscendStr(String str)
  {
      int maxLen = 0;
      int maxLenIndex = 0;
      String[] maxStrFromEveryChar = new String[str.length()];
      
      for( int i=0; i<=str.length()-maxLen; i++)
         {
            char[] currentStr = new char[str.length()];
            int currentLen = 1;
            currentStr[0] = str.charAt(i);
            for( int j=i+1; j<=str.length()-1; j++) 
               {
                  if(str.charAt(j)>currentStr[currentLen-1])
                    {
                       currentStr[currentLen] = str.charAt(j);
                       currentLen++;
                    }                  
               }
            
            if(currentLen>maxLen)
              {
                 maxStrFromEveryChar[i] = String.valueOf(currentStr);
                 maxLenIndex = i;
                 maxLen = currentLen;
              }
            else if( currentLen==maxLen && String.valueOf(currentStr).compareTo(maxStrFromEveryChar[maxLenIndex])>0)
                   {
                      maxStrFromEveryChar[i] = String.valueOf(currentStr);
                      maxLenIndex = i;
                   }
         }
      return maxStrFromEveryChar[maxLenIndex].trim();
  }
}
