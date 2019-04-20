import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

  public class Main 
{
    public static void main(String[] args) throws IOException
  {  
      if(args.length!=2)
        {
           System.out.println("Usage: java Main SourceFile numberOfPieces");
           System.exit(0);
        }
      
      File file = new File(args[0]);
      FileInputStream fileInputStream = new FileInputStream(file);
      BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
      int numberOfPieces = Integer.parseInt(args[1]);
      
      System.out.println("File size: " + bufferedInputStream.available() + " bytes");
      long fileSize = bufferedInputStream.available();
      int splitFileSize = (int)Math.ceil(1.0*fileSize/numberOfPieces);
      for( int i=1; i<=numberOfPieces; i++)
         {
            File tempFile = new File(assignAName(args[0],i));
            FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int value;
            int count = 0;
            while(count++<splitFileSize && (value=bufferedInputStream.read())!=-1) 
                  bufferedOutputStream.write(value);
        
            bufferedOutputStream.close();
            fileOutputStream.close();;
         }
          
      bufferedInputStream.close();
      fileInputStream.close();
  }    
    
    public static String assignAName(String original, int i)
  {
      int indexOfThePoint = -1;
      for( int j=0; j<=original.length()-1; j++)
         {  
            if(original.charAt(j)=='.')
              {
                 indexOfThePoint = j;
                 break;
              }
         }
      String head = original.substring(0,indexOfThePoint);
      String tail = original.substring(indexOfThePoint);
      StringBuilder name = new StringBuilder(head);
      name.append(i);
      name.append(tail);
      return name.toString();
  }
}
