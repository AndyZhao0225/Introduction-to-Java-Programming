  public class Main 
{
    public static void main(String[] args)
  {
      Integer[][] integers = {{3,7,5},{2,3,6},{1,3,2},{1,2,0,10}};
      System.out.println(max(integers));
      
      Character[][] ch = {{'b','d','m','i'},{'W','g','m','n','M','B'},{'a','T','X'}};
      System.out.println(max(ch));
      
      Double[][] doubles = {{2.01,3.25,3.65},{3.75,3.80,3.57,2.75,2.99,2.09}};
      System.out.println(max(doubles));
      
      String[][] str = {{"Andy","Miles","Vivian","Somnus"},{"Lily","Cinderella"},{"Sallie","LeeAnna","Katherine"},{"Seline","Mary","Alice"}};
      System.out.println(max(str));
  }    
    
    public static <E extends Comparable<E>> E max(E[][] list)
  {
      E maxValue = list[0][0];
      for( int i=0; i<=list.length-1; i++)
         {
            for( int j=0; j<=list[i].length-1; j++)
                if( list[i][j].compareTo(maxValue)>0 ) maxValue = list[i][j]; 
         }
      
      return maxValue;
  }
}
