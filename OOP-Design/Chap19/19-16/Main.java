import java.util.Scanner;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

  public class Main 
{
    public static void main(String[] args) throws IOException
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a file name: ");
      String fileName = input.next();
      
      int[] charCounter = new int[128];
      File file = new File(fileName);
      if(!file.exists()) 
        {
           System.out.println("File doesn't exist!");
           return;
        }
      FileInputStream fileInputStream = new FileInputStream(file);
      BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
      int r;
      while((r=fileInputStream.read())!=-1) 
            charCounter[(byte)r]++;
      System.out.printf("%15s%15s\n", "ASCII Code", "Counts");
      for( int i=0; i<=charCounter.length-1; i++)
          if(charCounter[i]!=0) System.out.printf("%15d%15d\n",i,charCounter[i]);
              
      bufferedInputStream.close();
      fileInputStream.close();
  }    
}
