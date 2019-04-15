  public class Main 
{
    public static void main(String[] args)
  {
      Integer[] integers = {1,2,37,4,5};
      System.out.println(max(integers));
      
      String[] str = {"zbc","zbd","zbdaa"};
      System.out.println(max(str));
      
      Character[] ch = {'A','z','c','k','*'}; 
      System.out.println(max(ch));
      
      Double[] doubles = {2.01,3.87,10.25,4.30,10.01};
      System.out.println(max(doubles));
  }   
    
    public static <E extends Comparable<E>> E max(E[] list)
  {
      E maxE = list[0];
      for( int i=1; i<=list.length-1; i++)
          if(list[i].compareTo(maxE)>0) maxE = list[i];
      
      return maxE;
  }
}
