import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      String[] words = { "consecutive", "write", "rectangle", "hello", "banana", "industry", "apple", "information", "shit", "restroom",
                         "scan", "cold", "building", "school", "moon", "star", "space", "further", "team", "basketball"};
      boolean another = true;
      while( another )
           {
              String word = selectWord(words);
              guess(word); 
              System.out.print("Do you want to guess for another word? Enter y or n> ");
              if( input.next().charAt(0) == 'n' ) another = false;
           }
  }    
    
    public static String selectWord(String[] words)
  {
      int select = (int)(Math.random()*words.length);
      return words[select];
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
