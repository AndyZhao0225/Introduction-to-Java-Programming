import java.io.*;
import java.util.*;

  public class Main 
{
    public static void main(String[] args) throws IOException
  {
      if(args.length!=1)
        {
           System.out.println("Usage: java Main SourceFile");
           System.exit(0);
        }
      
      Set<String> keyWordsSet = new HashSet<String>();
      String keyWords = "abstract assert boolean break byte case catch "
                      + "char class const continue default do double else enum "
                      + "extends final finally float for goto if implements "
                      + "import instanceof int interface long native new "
                      + "package private protected public return short static "
                      + "strictfp super switch synchronized this throw throws "
                      + "transient try void volatile while";
      
      String[] keyWordsArray = keyWords.trim().split(" ");
      for( int i=0; i<=keyWordsArray.length-1; i++)
          keyWordsSet.add(keyWordsArray[i]);
           
      File file = new File(args[0]);
      FileInputStream fileInputStream = new FileInputStream(file);
      DataInputStream dataInputStream = new DataInputStream(fileInputStream);
      String line = dataInputStream.readLine();
      int count = 0;
      while(line!=null)
         {
            String[] words = line.trim().split(" |]|\\+|-|\\*|=|;|\\?|^|<|>|!|:|&|%|/|\\.|\\{|\\}|\\(|\\)|\\[|\\|");
            for( int i=0; i<=words.length-1; i++)
               {
                  words[i] = words[i].trim();
                  if(keyWordsSet.contains(words[i]))
                    {
                       System.out.println(words[i]);
                       count++;
                    }
               }
            
            line = dataInputStream.readLine();
         }
      
      System.out.println(count);
      dataInputStream.close();
      fileInputStream.close();
  }    
}
