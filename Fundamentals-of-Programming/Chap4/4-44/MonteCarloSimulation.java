  public class MonteCarloSimulation 
{
    public static void main(String[] args)
  {
      final int NUMBER_OF_TRAILS=1000000;
      int numberOfHits=0;
      for(int i=0;i<=NUMBER_OF_TRAILS;i++)
         {
            double x=Math.random()*4.0-2;
            double y=Math.random()*4.0-2;
            if((x<0) || (x>0 && y>0 && x+y-2<0))numberOfHits++;
         }
      double probability=numberOfHits*1.0/NUMBER_OF_TRAILS;
      System.out.println("The probability is "+probability);
  }    
}
