import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args) throws Exception
  {
      if( args.length!=3 ) 
        {
           System.out.println(
           "Usage: java Exercise9_34 dir oldStr newStr");
           System.exit(0);
        } 
      
      File currentDir = new File(args[0]);
      
      if( !currentDir.exists() ) 
        {
           System.out.println("Current directory " + args[0] + " deos not exist");
           System.exit(0);
        }
      
      if( currentDir.isFile() ) replaceInAFile(currentDir,args[1],args[2]);
      else
        {
           File[] files = currentDir.listFiles();
           for (int i=0; i<files.length; i++)
    	   if( files[i].isFile() ) replaceInAFile(files[i],args[1],args[2]);
        }
  }    
    
    public static void replaceInAFile(File file, String oldStr, String newStr) throws Exception
  {   
      File tempFile = new File("E:\\Java程序项目文件夹\\Wrong\\9-34\\temp.txt");
      
      Scanner input1 = new Scanner(file);
      PrintWriter output1 = new PrintWriter(tempFile);  
      while( input1.hasNext())
           {
              String s1 = input1.nextLine();
              String s2 = s1.replaceAll(oldStr,newStr);
              output1.println(s2);
           }
      output1.close();
      input1.close();
      
      Scanner input2 = new Scanner(tempFile);
      PrintWriter output2 = new PrintWriter(file);
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