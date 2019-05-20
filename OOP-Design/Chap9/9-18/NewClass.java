import java.io.File;
import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args) throws Exception
  {
      File file = new File("Exercise9_18.txt");
      if( !file.exists() )
        {
           System.out.println("Source file doesn't exist");
           System.exit(0);
        }
      
     Scanner input = new Scanner(file);
     double sum = 0;
     int count = 0;
     while( input.hasNext() )
          {
             double score = input.nextDouble();
             sum += score;
             count++;
          }
     
     System.out.println("Sum: "+sum+"\nAverage Score: "+sum/count);
  }    
}
