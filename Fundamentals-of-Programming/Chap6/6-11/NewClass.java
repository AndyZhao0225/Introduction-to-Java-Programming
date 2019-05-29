import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      double[] array = new double[10];
      System.out.print("Enter ten numbers:");
      for( int i=0; i<=9; i++)
            array[i] = input.nextDouble();
      System.out.printf("The mean is %.2f\n",mean(array)); 
      System.out.printf("The standard deviation is %.5f\n",deviation(array));
  }  
    
    public static double mean(double[] x)
  {
      double sum=0;
      for( int i=0; i<=x.length-1; i++)
          sum += x[i];
      double mean = sum/x.length;
      return mean;
  }
    
    public static double deviation(double[] x)
  {
      double mean = mean(x);
      double numerator = 0;
      for( int i=0; i<=x.length-1; i++)
          numerator += ( x[i] - mean ) * ( x[i] - mean );
      return Math.sqrt( numerator / ( x.length-1 ) );
  } 
}
