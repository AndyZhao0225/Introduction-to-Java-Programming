  public class WordOccurrence implements Comparable
{
     private String word;
     private int count;
      
     public WordOccurrence(String newWord, int newCount)
   {
       word = newWord;
       count = newCount;
   }
     
     public int getCount()
   {
       return count;
   }
     
     public void setCount(int newCount)
   {
       count = newCount;
   }
     
     public String getWord()
   {
       return word;
   }
     
     public void setWord(String newWord)
   {
       word = newWord;
   }
     
     public int compareTo(Object o)
   {
       if(this.getCount()<((WordOccurrence)o).getCount()) return -1;
       else if(this.getCount()>((WordOccurrence)o).getCount()) return 1;
       else return 0;
   }
}
