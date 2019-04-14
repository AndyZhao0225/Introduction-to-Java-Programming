import java.util.HashSet;
import java.util.Iterator;

  public class Main 
{
    public static void main(String[] args)
  {
      HashSet<String> set1 = new HashSet<String>();
      set1.add("George");
      set1.add("Jim");
      set1.add("John");
      set1.add("Blake");
      set1.add("Kevin");
      set1.add("Micheal");
      
      HashSet<String> set2 = new HashSet<String>();
      set2.add("George");
      set2.add("Katie");
      set2.add("Kevin");
      set2.add("Michelle");
      set2.add("Ryan");
      
      Iterator<String> iterator = union(set1,set2).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
      
      System.out.println();
      iterator = intersection(set1,set2).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
      
      System.out.println();
      iterator = differenceSet(set1,set2).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
      
      System.out.println();
      iterator = differenceSet(set2,set1).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
  }   
    
    public static HashSet<String> union( HashSet<String> set1, HashSet<String> set2)
  {
      HashSet<String> set = new HashSet<String>(set1);
      Iterator<String> iterator = set2.iterator();
      while(iterator.hasNext())
           {
              String temp = iterator.next();
              if(!set.contains(temp))
                 set.add(temp);
           }
      return set;
  }
    
    public static HashSet<String> intersection( HashSet<String> set1, HashSet<String> set2)
  {
      HashSet<String> set = new HashSet<String>(set1);
      Iterator<String> iterator = set.iterator();
      while(iterator.hasNext())
           {
              String temp = iterator.next();
              if(!set2.contains(temp))
                 iterator.remove();
           }
      
      return set;
  }
    
    public static HashSet<String> differenceSet( HashSet<String> set1, HashSet<String> set2)
  {
      HashSet<String> set = new HashSet<String>(set1);
      Iterator<String> iterator = set.iterator();
      while(iterator.hasNext())
           {
              String temp = iterator.next();
              if(set2.contains(temp))
                 iterator.remove();
           }
      
      return set;
  }
}
