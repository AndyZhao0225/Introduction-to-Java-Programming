  public class NewClass 
{
    public static void main(String[] args)
  {
      char[][] answers = 
                      {
                       {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                       {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                       {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                       {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                       {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                       {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                       {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                       {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
                      };
      
      char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
      
      int[] correctCount = new int[answers.length];
      for (int i = 0; i<answers.length; i++) 
         {
            for(int j = 0; j < answers[i].length; j++) 
                if( answers[i][j] == keys[j] ) correctCount[i]++;
         }    
      
     int[] record = new int[correctCount.length]; 
     System.arraycopy(correctCount,0,record,0,correctCount.length);
     boolean[] mark = new boolean[record.length];
     java.util.Arrays.sort(correctCount);
     for( int i=0; i<answers.length; i++) 
        {
           int j=0;
           for( ; j<=answers.length-1; j++)
              {
                 if( record[j] == correctCount[i] && mark[j] == false )
                   {
                      mark[j] = true;
                      break;
                   }
              }
           System.out.println("Student "+j + "'s correct count is "+correctCount[i]);
        }

     
  }
}
