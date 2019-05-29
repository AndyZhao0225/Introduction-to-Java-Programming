import java.util.Scanner;

  public class SearchMinimum 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      System.out.println("Enter ten numbers:");
      double[] array=new double[10];
      for(int i=0; i<=9; i++) 
          array[i]=input.nextDouble();
      System.out.println("The minimum number is "+min(array));
  }   
    
    public static double min(double[] array)
  {
      double min=array[0];
      for(int j=1; j<=array.length-1; j++)
          if(array[j]<min) min=array[j];
      return min;
  }
}
