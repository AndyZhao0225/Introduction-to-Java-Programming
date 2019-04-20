import java.io.File;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;

  public class Main 
{
    public static void main(String[] args) throws IOException
  {
      File file = new File("Exercise19_1.dat");
      FileOutputStream output;
      if(file.exists()) output = new FileOutputStream(file,true);
      else output  = new FileOutputStream(file);
      DataOutputStream outputStream = new DataOutputStream(output);
      for( int i=1; i<=100; i++)
          outputStream.writeInt((int)(Math.random()*1000));
      output.close();
      outputStream.close();
      
      FileInputStream input = new FileInputStream(file);
      DataInputStream inputStream = new DataInputStream(input);
      try
        {
           int value;
           while((value=inputStream.readInt())!=-1)
                 System.out.print(value + " ");
        }
      catch(EOFException ex)
        {
           
        }
      finally
        {
           input.close();
           inputStream.close();
        }
  }    
}
