import java.util.Arrays;
import java.util.Scanner;

  public class Main 
{
    public static void main(String[] args) 
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an size for the array: ");
      int size = input.nextInt();
      int[] list = new int[size];
      System.out.println("Enter the array: ");
      for( int i=0; i<=size-1; i++)
          list[i] = input.nextInt();
      
      quickSort(list);
      
      for( int i=0; i<=list.length-1; i++)
          System.out.print(list[i] + " ");
      System.out.println();
  }  
    
    public static void quickSort(int[] list) 
  {
      quickSort(list,0,list.length-1);
  }

    private static void quickSort(int[] list, int first, int last) 
  {
      if(last>first) 
        {
           int pivotIndex = partition(list,first,last);
           quickSort(list,first,pivotIndex-1);
           quickSort(list,pivotIndex+1,last);
        }
  }

    private static int partition(int[] list, int first, int last) 
  {
      int middle = (first + last)/2;
      int index = median(list[first],list[middle],list[last]);
      int pivotIndex = 0;
      if(index==0) pivotIndex = first;
      if(index==1) pivotIndex = middle;
      if(index==2) pivotIndex = last;
      pivotIndex = middle;
      int pivot = list[pivotIndex];
      
      if(pivotIndex==first)
        {
           int low = first + 1; 
           int high = last;
           
           while(high>low) 
           {
              while(low<=high && list[low]<=pivot)
                    low++;
              while(low<=high && list[high]>pivot)
                    high--;
              if(high>low) 
                {
                   int temp = list[high];
                   list[high] = list[low];
                   list[low] = temp;
                }
           }

          while(high>first && list[high]>=pivot)
                high--;

          if(pivot>list[high]) 
            {
               list[pivotIndex] = list[high];
               list[high] = pivot;
               return high;
            }
          else return first;
        }
      
      if(pivotIndex==middle)
        {
           int temp = list[first];
           list[first] = list[middle];
           list[middle] = temp;
           pivotIndex = first;
            
           int low = first + 1; 
           int high = last;
           
           while(high>low) 
           {
              while(low<=high && list[low]<=pivot)
                    low++;
              while(low<=high && list[high]>pivot)
                    high--;
              if(high>low) 
                {
                   int tempo = list[high];
                   list[high] = list[low];
                   list[low] = tempo;
                }
           }

          while(high>first && list[high]>=pivot)
                high--;

          if(pivot>list[high]) 
            {
               list[pivotIndex] = list[high];
               list[high] = pivot;
               return high;
            }
          else return first;
        }
      
      if(pivotIndex==last)
        {
           int low = first; 
           int high = last - 1;  
           
           while(high>low) 
           {
              while(low<=high && list[low]<=pivot)
                    low++;
              while(low<=high && list[high]>pivot)
                    high--;
              if(high>low) 
                {
                   int temp = list[high];
                   list[high] = list[low];
                   list[low] = temp;
                }
           }

           while(low<last && list[low]<=pivot)
                 low++;

           if(pivot<list[low]) 
             {
                list[pivotIndex] = list[low];
                list[low] = pivot;
                return low;
             }
           else return last;
        }

      return -1;
  }
    
    private static int median(int first, int middle, int last)
  {
      int[] array = new int[3];
      array[0] = first;
      array[1] = middle;
      array[2] = last;
      Arrays.sort(array);
      if(first==array[1]) return 0;
      if(middle==array[1]) return 1;
      if(last==array[1]) return 2;
      return -1; 
  }
}
