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
      if(args.length<2)
        {
           System.out.println("Usage: java Main SourceFile1 ... SourceFilen TargetFile");
           System.exit(0);
        } 
      
      File targetFile = new File(args[args.length-1]);
      FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
      BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
      
      for( int i=0; i<=args.length-2; i++)
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
