  public class Main 
{
    public static void main(String[] args)
  {
      Integer[] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};
      System.out.println(binarySearch(list,11));
      
      String[] str = {"089","ACK","zbc","zbd","zbdaa","zc","zzz"};
      System.out.println(binarySearch(str,"zzz"));
      
      Character[] ch = {'*','A','B','O','c','g','k','z'}; 
      System.out.println(binarySearch(ch,'x'));
      
      Double[] doubles = {2.01,3.87,3.88,4.30,10.01,10.25,30.89};
      System.out.println(binarySearch(doubles,1.0));
  }    
    
    public static <E extends Comparable<E>> int binarySearch(E[]list, E key)
  {
      int low = 0;
      int high = list.length - 1;
      
      while( high>=low )
         {
            int mid = (low + high)/2;
            if( key.compareTo(list[mid])<0 ) high = mid - 1;
            else if( key.compareTo(list[mid])==0 ) return mid;
            else low = mid + 1;
         }
      
      return -low-1;
  }
}
