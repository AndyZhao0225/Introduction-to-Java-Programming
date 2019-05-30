  public class NewClass 
{
    public static void main(String[] args)
  {
      boolean[] cupboard = new boolean[100];
      for( int i=0; i<=99; i++)
          cupboard[i] = false;
      for( int stu=0; stu<=99; stu++)
          cupboard = turn(cupboard,stu);
      display(cupboard);
  }
    
    public static boolean[] turn(boolean[] cupboard, int start)
  {
      for( int i=start; i<=99; i++)
         {
            if( cupboard[i] ) cupboard[i] = false;
            else cupboard[i] = true;
         }
      return cupboard;
  }
    
    public static void display(boolean[] cupboard)
  {
      int count = 0;
      for( int i=0; i<=99; i++)
         {
            if( cupboard[i] == true ) 
              {
                 System.out.printf("%-4d",i+1);
                 count++;
              }
            if( count % 10 == 0 ) System.out.println();
         }
  }
}
