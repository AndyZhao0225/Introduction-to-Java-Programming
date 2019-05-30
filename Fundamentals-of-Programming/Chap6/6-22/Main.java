  public class Main 
{
    public static final int SIZE = 8;  
    private static int[] queens = new int[SIZE];  
    private static int count = 0;
      
    public static void main(String[] args)
  {
      for( int i=0; i<=SIZE-1; i++) 
         {
            for( int a=0; a<=SIZE-1; a++) 
                queens[a] = -1; 
            queens[0] = i;
            for( int j=0; j<=SIZE-1; j++) 
               {
                  if(isValid(1,j)) queens[1] = j;
                  else continue; 
                  for( int k=0; k<=SIZE-1; k++) 
                     {
                        if(isValid(2,k)) queens[2] = k;    
                        else continue; 
                        for( int l=0; l<=SIZE-1; l++)
                           {
                              if(isValid(3,l)) queens[3] = l; 
                              else continue;
                              for( int m=0; m<=SIZE-1; m++)
                                 {
                                    if(isValid(4,m)) queens[4] = m; 
                                    else continue; 
                                    for( int n=0; n<=SIZE-1; n++)
                                       {
                                          if(isValid(5,n)) queens[5] = n; 
                                          else continue;
                                          for( int o=0; o<=SIZE-1; o++)
                                             {
                                                if(isValid(6,o)) queens[6] = o; 
                                                else continue;
                                                for( int p=0; p<=SIZE-1; p++)
                                                   {
                                                      if(isValid(7,p)) 
                                                        {
                                                           queens[7] = p;
                                                           myPrint();
                                                           count++;
                                                        } 
                                                      else continue; 
                                                   } 
                                             } 
                                       } 
                                 } 
                           }  
                     } 
               } 
         }
      System.out.println(count);
  }    
    
    private static void myPrint()
  {
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
      System.out.println();
  }
    
    private static boolean isValid(int row, int column)
  {
      for( int i=1; i<=row; i++)
          if(queens[row-i]==column || queens[row-i]==column-i || queens[row-i]==column+i ) return false;
      
      return true;  
  }
}
