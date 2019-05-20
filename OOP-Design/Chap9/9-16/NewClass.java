import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args) throws Exception
  {
      if( args.length!=1 ) 
        {
           System.out.println("Usage: java NewClass fileName");
           System.exit(0);
        }
      
      File file = new File(args[0]);
      if( !file.exists() )
        {
           System.out.println("Source file "+args[0]+" doesn't exists");
           System.exit(0);
        }
      
      Scanner input = new Scanner(file);
      StringBuilder strB = new StringBuilder();
      String former = input.nextLine();
      while( input.hasNext() )
           {
              String temp = former.trim();
              if( temp.equals("{") ) former = "";
              if( former.equals("") ) strB.append(former);
              else strB.append("\r\n"+former);              
              String latter = input.nextLine();
              for( int i=0; i<=latter.length()-1; i++)
                  if( latter.charAt(i)=='{' ) strB.append("{"+"\r\n");                    
              former = latter;
           }
      strB.append("\r\n"+former);
      input.close();
      
      PrintWriter output = new PrintWriter(file);
      output.print(strB.toString());
      output.close();
  }    
}