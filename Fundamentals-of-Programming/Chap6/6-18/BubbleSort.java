  public class BubbleSort 
{
    public static double[] bubbleSort(double...array)
  {
      for( int i=array.length-1; i>=1; i--)
         {
            for( int j=0; j<=i-1; j++)
               {
                  if(array[j]>array[j+1])
                    {
                       double temp = array[j];
                       array[j] = array[j+1];
                       array[j+1] = temp;
                    }
               }
         }
      return array;
  }    
}
