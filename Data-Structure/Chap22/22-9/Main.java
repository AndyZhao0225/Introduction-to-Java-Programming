import java.util.*;
import java.io.*;

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
      
      TreeMap<String,Integer> map = new TreeMap<String,Integer>();
      String line = dataInputStream.readLine();
      while(line!=null)
         {
            String[] words = line.trim().split(" |\\,|\\.|;|:|\\?|'|\\(|\\)|\"");
            for( int i=0; i<=words.length-1; i++)
               {
                  String key = words[i].trim().toLowerCase();                
                  boolean notSpace = false;
                  for( int j=0; j<=key.length()-1; j++)
                     {
                        if(key.charAt(j)!=' ')
                          {
                             notSpace = true;
                             break;
                          }
                     }
                  if(notSpace) 
                    {
                       if(Character.isLetter(key.charAt(0))) 
                         {
                            if(map.get(key)==null) map.put(key,1);
                            else 
                              {
                                 int value = map.get(key).intValue();
                                 value++;
                                 map.put(key,value);
                              }
                         }
                    }
               }
            
            line = dataInputStream.readLine();
         }

      Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
      for(Map.Entry<String,Integer> entry: entrySet)
          System.out.printf("%-20s%3d\n",entry.getKey(),entry.getValue());
      
      dataInputStream.close();
      fileInputStream.close();
  }
}
