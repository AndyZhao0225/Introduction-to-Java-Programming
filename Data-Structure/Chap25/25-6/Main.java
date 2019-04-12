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
      
      Stack<Character> stack = new Stack();
      ArrayList<Character> spliter = new ArrayList();
      spliter.add('(');
      spliter.add('{');
      spliter.add('[');
      spliter.add(']');
      spliter.add('}');
      spliter.add(')');
      
      int lineCounter = 0;
      String line = dataInputStream.readLine();
      
      while(line!=null)
         {
            lineCounter++;
            for( int i=0; i<=line.length()-1; i++)
               {
                  char character = line.charAt(i);
                  if(spliter.contains(character))
                    {
                       int index = spliter.indexOf(character);
                       if(index>=3) 
                         {
                            if(stack.isEmpty()) 
                              {
                                 System.out.println("Incorrect grouping pairs at " + lineCounter);
                                 dataInputStream.close();
                                 fileInputStream.close();
                                 return;
                              } 
                            else
                              {
                                 char charInStack = stack.pop();
                                 int indexForCharInStack = spliter.indexOf(charInStack);
                                 if(indexForCharInStack+index!=5)
                                   {
                                      System.out.println("Incorrect grouping pairs at " + lineCounter);
                                      dataInputStream.close();
                                      fileInputStream.close();
                                      return;
                                   }
                              }
                         }
                       else stack.push(character);
                       
                    }
               }
           
            line = dataInputStream.readLine();
         }
      
      if(!stack.isEmpty()) System.out.println("Incorrect grouping pairs");
      dataInputStream.close();
      fileInputStream.close();
  }    
}
