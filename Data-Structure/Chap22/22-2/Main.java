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
      
      File file = new File(args[0]);
      FileInputStream fileInputStream = new FileInputStream(file);
      DataInputStream dataInputStream = new DataInputStream(fileInputStream);
      
      Set<String> set = new HashSet<String>();
      String line = dataInputStream.readLine();
      while(line!=null)
         {
            String[] words = line.trim().split(" ");
            for( int i=0; i<=words.length-1; i++)
               {
                  words[i] = words[i].trim();
                  boolean notSpace = false;
                  for( int j=0; j<=words[i].length()-1; j++)
                     {
                        if(words[i].charAt(j)!=' ')
                          {
                             notSpace = true;
                             break;
                          }
                     }
                  if(notSpace) 
                     if(!set.contains(words[i])) set.add(words[i]);
               }
            
            line = dataInputStream.readLine();
         }
      
      TreeSet<String> treeSet = new TreeSet<String>(set);
      for(String element: treeSet)
          System.out.println(element);
      
      dataInputStream.close();
      fileInputStream.close();
  }    
}
