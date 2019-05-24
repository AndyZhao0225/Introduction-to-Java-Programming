  public class Location 
{
    private int row, column;
    private double maxValue;
    private double[][] matrix;
    private int maxRow, maxColumn;
    
    Location(double[][] a)
  {
      row = a.length;
      column = a[0].length;
      matrix = a; 
  }
    
    public int getRows()
  {
      return row;
  }
    
    public int getColumns()
  {
      return column;
  }
    
    public double getMaxValue()
  {
      double largest = matrix[0][0];
      maxRow = 0;
      maxColumn = 0;
      for( int i=0; i<=row-1; i++)
         {
            for( int j=0; j<=column-1; j++)
               {
                  if( matrix[i][j] > largest )
                    {
                       largest = matrix[i][j]; 
                       maxRow = i;
                       maxColumn =j;
                    }
               }
         }
      return largest; 
  }
    
    public int getMaxRow()
  {
      return maxRow;
  }
    
    public int getMaxColumn()
  {
      return maxColumn;
  }
}
