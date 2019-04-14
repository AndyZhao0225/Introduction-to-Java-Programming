import java.util.ArrayList;
import java.util.Iterator;

  public class Main 
{
    public static void main(String[] args)
  {
      ArrayList<String> arrayList1 = new ArrayList<String>();
      arrayList1.add("George");
      arrayList1.add("Jim");
      arrayList1.add("John");
      arrayList1.add("Blake");
      arrayList1.add("Kevin");
      arrayList1.add("Micheal");
      
      ArrayList<String> arrayList2 = new ArrayList<String>();
      arrayList2.add("George");
      arrayList2.add("Katie");
      arrayList2.add("Kevin");
      arrayList2.add("Michelle");
      arrayList2.add("Ryan");
      
      Iterator<String> iterator = union(arrayList1,arrayList2).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
      
      System.out.println();
      iterator = intersection(arrayList1,arrayList2).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
      
      System.out.println();
      iterator = differenceSet(arrayList1,arrayList2).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
      
      System.out.println();
      iterator = differenceSet(arrayList2,arrayList1).iterator();
      while(iterator.hasNext())
            System.out.println(iterator.next());
  }    
    
    public static ArrayList<String> union( ArrayList<String> list1, ArrayList<String> list2)
  {
      ArrayList<String> list = new ArrayList<String>(list1);
      Iterator<String> iterator = list2.iterator();
      while(iterator.hasNext())
           {
              String temp = iterator.next();
              if(!list.contains(temp))
                 list.add(temp);
           }
      return list;
  }

    public static ArrayList<String> intersection( ArrayList<String> list1, ArrayList<String> list2)
  {
      ArrayList<String> list = new ArrayList<String>(list1);
      Iterator<String> iterator = list.iterator();
      while(iterator.hasNext())
           {
              String temp = iterator.next();
              if(!list2.contains(temp))
                 iterator.remove();
           }
      
      return list;
  }

    public static ArrayList<String> differenceSet( ArrayList<String> list1, ArrayList<String> list2)
  {
      ArrayList<String> list = new ArrayList<String>(list1);
      Iterator<String> iterator = list.iterator();
      while(iterator.hasNext())
           {
              String temp = iterator.next();
              if(list2.contains(temp))
                 iterator.remove();
           }
      
      return list;
  }
}
