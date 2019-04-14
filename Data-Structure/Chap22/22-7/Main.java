import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      TreeMap<Integer,Integer> map = new TreeMap<Integer,Integer>();
      int key = input.nextInt();
      while(key!=0)
           {
              if(map.get(key)==null) map.put(key,1);
              else  
                {
                   int value = map.get(key).intValue();
                   value++;
                   map.put(key,value);
                }
              key = input.nextInt();
           }
      
      Set<Map.Entry<Integer,Integer>> entrySet = map.entrySet();
      int maxOccurrence = 0;
      for(Map.Entry<Integer,Integer> entry: entrySet)
          if(entry.getValue()>maxOccurrence) maxOccurrence = entry.getValue();
      for(Map.Entry<Integer,Integer> entry: entrySet)
          if(entry.getValue()==maxOccurrence) System.out.print(entry.getKey() + " ");
      System.out.println();
  }    
}
