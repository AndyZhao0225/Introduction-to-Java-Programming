import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;

  public class Main 
{
    public static void main(String[] args) throws IOException
  {
      File file = new File("Exercise19_1.txt");
      PrintWriter output;
      if(file.exists()) 
        {
           FileWriter fileWriter = new FileWriter(file,true);
           output = new PrintWriter(fileWriter);
        }
      else output  = new PrintWriter(file);
      for( int i=1; i<=100; i++)
          output.print((int)(Math.random()*100000) + " ");
      output.close();
  }    
}

