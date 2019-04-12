import java.util.ArrayList;

  public class Main 
{
    public static void main(String[] args)
  {
      final int TOTAL_RADIX_NUM = 4;
      final int BASE = (int)Math.pow(10,TOTAL_RADIX_NUM);
      int[] array = new int[1000000];
      for( int i=0; i<=array.length-1; i++)
          array[i] = (int)(Math.random()*BASE);
      radixSort(array,TOTAL_RADIX_NUM);
      myPrint(array);
  }   
    
    public static void radixSort(int[] list, int totalRadixNum)
  {
      for( int radix=totalRadixNum-1; radix>=0; radix--)
          bucketSort(list,radix,totalRadixNum);
  }
    
    public static void bucketSort(int[] list, int radix, int totalRadixNum)
  {
      ArrayList[] buckets = new ArrayList[10];
      for( int i=0; i<=list.length-1; i++)
         {
            String str = "" + list[i];
            int l = str.length();
            for( int j=0; j<totalRadixNum-l; j++) 
                str = "0" + str;
            int key = str.charAt(radix) - '0';
            if(buckets[key]==null) buckets[key] = new ArrayList();
            buckets[key].add(list[i]);
         }
      
      int k = 0;
      for( int i=0; i<=buckets.length-1; i++)
         {
            if(buckets[i]!=null)
              {
                 for( int j=0; j<=buckets[i].size()-1; j++)
                     list[k++] = (int)buckets[i].get(j);
              }
         }
  }
    
    public static void myPrint(int[] list)
  {
      int k = 0;
      for( int i=0; i<=10000-1; i++)
         {
            for( int j=0; j<=100-1; j++)
                System.out.printf("%-6d",list[k++]);
            System.out.println();
         }
  }
}
