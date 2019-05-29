  public class Main 
{
    public static final int SIZE = 8;  
    private static int[] queens = new int[SIZE];  
      
    public static void main(String[] args)
  {
      search(0);
      for( int i=0; i<=SIZE-1; i++)
         {
            for( int j=0; j<=SIZE-1; j++)
               {
                  System.out.print("|");
                  if(queens[i]==j) System.out.print("Q");
                  else System.out.print(" ");
               }
            System.out.println("|");
         }
  }    
    
    private static boolean isValid(int row, int column)
  {
      for( int i=1; i<=row; i++)
          if(queens[row-i]==column || queens[row-i]==column-i || queens[row-i]==column+i ) return false;
      
      return true;  
  }
    
    private static boolean search(int row)
  {
      if(row==SIZE) return true;
      for( int column=0; column<SIZE; column++)
         {
            queens[row] = column;
            if(isValid(row,column) && search(row+1)) return true;
         }
      
      return false;
  }
}
