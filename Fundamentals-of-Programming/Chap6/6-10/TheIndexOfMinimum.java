import java.util.Scanner;

  public class TheIndexOfMinimum 
{
    public static void main(String[] args)
  {
      Scanner input=new Scanner(System.in);
      double[] array=new double[10];
      System.out.println("Enter 10 integers:");
      for( int i=0; i<=9; i++)
          array[i]=input.nextDouble();
      System.out.println("The index of the minimum in the array is "+indexOfSmallestElement(array));         
  }     
    
    public static int indexOfSmallestElement(double[] array)
  {
      double currentMin=array[0]; 
      int currentMinIndex=0;
      for( int j=1; j<array.length; j++)
         {
            if(array[j]<currentMin)
              {
                 currentMin=array[j];
                 currentMinIndex=j;
              }
         }
      return currentMinIndex;
  }
}
