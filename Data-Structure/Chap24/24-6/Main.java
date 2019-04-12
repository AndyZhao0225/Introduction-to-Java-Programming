import java.util.Comparator;

  public class Main 
{ 
    public static boolean ordered(int[] list)
  {
      for( int i=0; i<=list.length-2; i++)
          if(list[i]>list[i+1]) return false; 
      return true;
  }
    
    public static boolean ordered(int[] list, boolean ascending)
  {
      if(ascending) return ordered(list);
      
      for( int i=0; i<=list.length-2; i++)
          if(list[i]<list[i+1]) return false; 
      return true;
  }
    
    public static boolean ordered(double[] list)
  {
      for( int i=0; i<=list.length-2; i++)
          if(list[i]>list[i+1]) return false; 
      return true;
  }
    
    public static boolean ordered(double[] list, boolean descending)
  {
      if(!descending) return ordered(list);
      
      for( int i=0; i<=list.length-2; i++)
          if(list[i]<list[i+1]) return false; 
      return true;
  }
    
    public static <E extends Comparable<E>> boolean ordered(E[] list)
  {
      for( int i=0; i<=list.length-2; i++)
          if(list[i].compareTo(list[i+1])>0) return false;
      return true;
  }
    
    public static <E extends Comparable<E>> boolean ordered(E[] list, boolean ascending)
  {
      if(ascending) return ordered(list);
      
      for( int i=0; i<=list.length-2; i++)
          if(list[i].compareTo(list[i+1])<0) return false; 
      return true;
  }
    
    public static <E> boolean ordered(E[] list, Comparator<? super E> comparator)
  {
      for( int i=0; i<=list.length-2; i++)
          if(comparator.compare(list[i],list[i+1])>0) return false; 
      return true;
  }
    
    public static <E> boolean ordered(E[] list, Comparator<? super E> comparator, boolean ascending)
  {
      if(ascending) return ordered(list,comparator);
      
      for( int i=0; i<=list.length-2; i++)
          if(comparator.compare(list[i],list[i+1])<0) return false;
      return true;
  }
}
