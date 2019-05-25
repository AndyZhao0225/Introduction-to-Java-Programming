  public class NewClass 
{
    public static void main(String[] args)
  {
      int[][] workingHours = {{2,4,3,4,5,8,8},{7,3,4,3,3,4,4},{3,3,4,3,3,2,2},{9,3,4,7,3,4,1},
                              {3,5,4,3,6,3,8},{3,4,4,6,3,4,4},{3,7,4,8,3,8,4},{6,3,5,9,2,7,9}};
      int[] weekHours = sumHours(workingHours);
      int[] records = new int[weekHours.length];
      System.arraycopy(weekHours,0,records,0,weekHours.length);
      boolean[] mark = new boolean[records.length];
      java.util.Arrays.sort(weekHours);
      weekHours = reverse(weekHours);
      System.out.println("             Su  M   T   W   H   F   Sa     Total");
      for( int i=0; i<=weekHours.length-1; i++)
         {
            for( int j=0; j<=records.length-1; j++)
               {
                  if( records[j] == weekHours[i] && mark[j] == false )
                    {
                       mark[j] = true;
                       System.out.print("Employee"+j+"    "); 
                       for( int k=0; k<=workingHours[j].length-1; k++)
                           System.out.print(workingHours[j][k]+"   "); 
                       System.out.println("   "+weekHours[i]);
                    }
               }    
         }
  }   
    
    public static int[] sumHours(int[][] workingHours)
  {
      int[] sumHours = new int[8];
      for( int i=0; i<=workingHours.length-1; i++)
          for( int j=0; j<=workingHours[i].length-1; j++)
              sumHours[i] += workingHours[i][j];  
      return sumHours;
  }
    
    public static int[] reverse(int[] weekHours)
  {
      int[] reverse = new int[weekHours.length];
      for( int i=0; i<=weekHours.length-1; i++)
          reverse[i] = weekHours[weekHours.length-1-i];  
      return reverse;
  }
}
