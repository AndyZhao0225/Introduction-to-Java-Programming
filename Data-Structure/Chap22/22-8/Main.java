import java.util.*;

  public class Main 
{
    public static void main(String[] args)
  {
      String text = "But one hundred years later, the Negro still is not free. One hundred years later, the life of the Negro is still sadly crippled by the manacles of segregation and the chains of discrimination. One hundred years later, the Negro lives on a lonely island of poverty in the midst of a vast ocean of material prosperity. One hundred years later, the Negro is still languished in the corners of American society and finds himself an exile in his own land. And so we've come here today to dramatize a shameful condition" +
                    "Have a good visit. Have fun!";

      ArrayList<WordOccurrence> list = new ArrayList<WordOccurrence>();   
      String[] words = text.split("[ \n\t\r.,;:!?(){}]");
      for( int i=0; i<=words.length-1; i++)
         {
            String key = words[i].toLowerCase();
            
            if(words[i].length()>1) 
              {
                 boolean newWord = true;
                 for( int j=0; j<=list.size()-1; j++)
                    {
                       WordOccurrence currentWO = list.get(j);
                       if(currentWO.getWord().equals(key))
                         {
                            int count = currentWO.getCount();
                            currentWO.setCount(count+1);
                            newWord = false;
                            break;
                         } 
                    }
                 
                 if(newWord)
                   {
                      WordOccurrence wo = new WordOccurrence(key,1);
                      list.add(wo);
                   }
              }
         }
      
      Collections.sort(list);
      for(WordOccurrence wo: list)
          System.out.println(wo.getCount() + "  " + wo.getWord());
  }
}
