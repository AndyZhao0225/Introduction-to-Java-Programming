import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

  public class CombineFiles
{
    private static final int DEFAULT_FILES_NUMBER = 12;
    
    public static void combine(String target, int numberOfPieces) throws IOException
  {
      String[] args = new String[DEFAULT_FILES_NUMBER+1];
      for( int i=0; i<=DEFAULT_FILES_NUMBER-1; i++)
          args[i] = "temp" + (i+1) + ".txt";
      args[DEFAULT_FILES_NUMBER] = target;
      
      File targetFile = new File(args[args.length-1]);
      FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
      
      for( int i=0; i<=numberOfPieces-1; i++)
         {
            File tempFile = new File(args[i]);
            FileInputStream fileInputStream = new FileInputStream(tempFile);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int value;
            while((value=bufferedInputStream.read())!=-1) 
                  bufferedOutputStream.write(value);
         }
      
      bufferedOutputStream.close();
      fileOutputStream.close();
      bufferedOutputStream.close();
      fileOutputStream.close();
  }    
}
