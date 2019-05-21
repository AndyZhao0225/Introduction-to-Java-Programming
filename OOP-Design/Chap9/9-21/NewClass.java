import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args) throws Exception
  {
      if( args.length != 2 )
        {
           System.out.println("Usage: java NewClass sourceFile string");
           System.exit(0);
        }  
      
      File sourceFile = new File( args[0] );
      if( !sourceFile.exists() )
        {
           System.out.println("Source file "+args[0]+" does not exist");
           System.exit(0);
        }
      
      File tempFile = new File("tempFile.txt");
      
      Scanner input1 = new Scanner(sourceFile);
      PrintWriter output1 = new PrintWriter(tempFile); 
      
      while( input1.hasNext())
           {
              String s1 = input1.nextLine();
              String s2 = s1.replaceAll(args[1],"");
              output1.println(s2);
           }
      
      output1.close();
      input1.close();
      
      Scanner input2 = new Scanner(tempFile);
      PrintWriter output2 = new PrintWriter(sourceFile);
      while( input2.hasNext())
           {
              String s1 = input2.nextLine();
              output2.println(s1);
           } 
      
      output2.close();
      input2.close();
      
      tempFile.delete();
  }    
}

