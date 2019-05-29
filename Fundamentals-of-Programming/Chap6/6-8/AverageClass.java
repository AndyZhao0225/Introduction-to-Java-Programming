  public class AverageClass 
{
    public static int average(int[] array)
  {
      int average=0;
      int sum=0;
      for( int i=0; i<array.length; i++)
         sum+=array[i];
      average=sum/array.length;
      return average;
  }
    
    public static double average(double[] array)
  {
      double average=0;
      double sum=0;
      for( int i=0; i<array.length; i++)
         sum+=array[i];
      average=sum/array.length;
      return average;
  } 
}
