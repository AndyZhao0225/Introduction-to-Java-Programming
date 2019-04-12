  public class TestHeap 
{
    public static void main(String[] args)
  {
      try
        {
           Integer[] array = {1,5,3,7,9,3,4};
           Heap<Integer> heap1 = new Heap<Integer>(array);
           Heap<Integer> heap2 = heap1;
           Heap<Integer> heap3 = heap1.clone();       
           System.out.println("heap1 == heap2 is " + (heap1==heap2));
           System.out.println("heap1 == heap3 is " + (heap1==heap3));
           System.out.println("heap1.equals(heap3) is " + heap1.equals(heap3));
        }
      catch(Exception ex)
        {
           ex.printStackTrace();
        }
  }
}
