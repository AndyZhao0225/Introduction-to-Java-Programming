import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of balls to drop: ");
      int balls = input.nextInt();
      System.out.print("Enter the number of slots in the bean machine: ");
      int slotsNum = input.nextInt();
      int[] slots = new int[slotsNum];
      
      System.out.println();
      for( int i=1; i<=balls; i++)
         {
            char[] track = new char[slotsNum-1];
            int numberOfR = 0;
            for( int j=0; j<=slotsNum-2; j++)
               {
                  track[j] = leftOrRight();
                  System.out.print(track[j]);
                  if(track[j] == 'R')  numberOfR++;
               } 
            System.out.println();
            slots[numberOfR]++;
         }
     
      System.out.println();
      printgraph(slots);
  }    
    
    public static char leftOrRight()
  {
      int direction = (int)(Math.random()*2);
      if(direction == 0) return 'L';
      else return 'R';
  }
    
    public static void printgraph(int slots[])
  {
      int max = 1;
      while( max != 0 )
           {
              max--; 
              for( int i=0; i<=slots.length-1; i++)
                  if( slots[i] > max )  max = slots[i];
              if( max != 0 )
                {
                   System.out.print("|");
                   for( int i=0; i<=slots.length-1; i++)
                      {
                         if( slots[i] == max )
                           {
                              System.out.print("O|");
                              slots[i]--;
                           } 
                         else System.out.print(" |");
                      }        
                }
              System.out.println();
           }
  }
}
