import java.io.File;
import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args) throws Exception
  {
      Scanner mainInput = new Scanner(System.in); 
      boolean another = true;
      while( another )
           {
              String word = selectWord();
              guess(word); 
              System.out.print("Do you want to guess for another word? Enter y or n> ");
              if( mainInput.next().charAt(0) == 'n' ) another = false;
           }
  }    
    
    public static String selectWord() throws Exception
  {
      File file = new File("Exercise9_33.txt");
      if( !file.exists() )
        {
           System.out.println("File doesn't exist!");
           System.exit(0);
        }
      Scanner scanner = new Scanner(file);
      String[] words = new String[100];
      int i = 0;
      while( scanner.hasNext() )
        {
           words[i] = scanner.next();
           i++;
        }
      
      int size = i;
      int random = (int)(Math.random()*size);
      return words[random];
  }
    
    public static void guess(String word)
  {
      Scanner input = new Scanner(System.in);
      StringBuilder situation = new StringBuilder();
      for( int i=0; i<=word.length()-1; i++)
          situation.append('*');
      boolean[] mark = new boolean[word.length()];
      boolean allClear = false;
      int wrongCount = 0;
      
      System.out.println("(Guess) Enter a letter in word for each time");
      while( !allClear )
           {
              System.out.print(situation.toString()+" > ");
              char ch = input.next().charAt(0);
              boolean match = false;
              
              for( int i=0; i<=word.length()-1; i++)
                 {
                    if( word.charAt(i) == ch )
                      {
                         match = true;
                         if( mark[i] == true )
                           {
                              System.out.println(ch+" is already shown in the word");
                              break;
                           }
                         else 
                           {
                              situation.setCharAt(i,ch);
                              mark[i] = true;
                           }
                      } 
                 }
              if( !match )
                {        
                   wrongCount++;
                   System.out.println(ch+" is not in the word");
                }      
              
              allClear = true;
              for( int j=0; j<=word.length()-1; j++)
                  if( !mark[j] ) allClear = false; 
              if( allClear ) allClear = true; 
           }
      
      System.out.println("The word is "+word+"."+"You missed "+wrongCount+((wrongCount>=2)?" times":" time"));
  }
}

