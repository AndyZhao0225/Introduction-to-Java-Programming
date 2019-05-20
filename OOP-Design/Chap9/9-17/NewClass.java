import java.util.Scanner;
import java.io.File;

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
           System.out.println("Source file "+args[0]+" doesn't exist!");
           System.exit(0);
        }
      
      Scanner input = new Scanner(file);
      int lines = 0;
      int words = 0;
      int characters = 0;
      while( input.hasNext() )
           {
              String s = input.nextLine();
              lines++;
              characters += s.length();
              boolean preSpace = true;
              for( int i=0; i<=s.length()-1; i++)
                 {
                    char ch = s.charAt(i);
                    if( ch==' ' )
                      {
                         if( !preSpace ) words++;
                         preSpace = true;
                      }
                    else preSpace = false;
                 }
              if( s.length()!=0 )
                 if( s.charAt(s.length()-1)!=' ' ) words++;
           }
      input.close();
      
      System.out.println("File "+args[0]+" has");
      System.out.println(characters+" characters");
      System.out.println(words+" words");
      System.out.println(lines+" lines");
  }    
}
