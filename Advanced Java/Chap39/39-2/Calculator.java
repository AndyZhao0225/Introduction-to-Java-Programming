package rit;

public class Calculator 
{
   public static int[][] multiplicationTable()
   {
	  int[][] mulTable = new int[9][9];
	  for( int i=0; i<=9-1; i++) 
	     {
		    for( int j=0; j<=9-1; j++)
		    	mulTable[i][j] = (i+1) * (j+1);
	     }
	  return mulTable; 
   }
}
