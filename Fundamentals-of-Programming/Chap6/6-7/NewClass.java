  public class NewClass 
{
    public static void main(String[] args)
  {
      int[] counts = new int[10];
      int lineChange=0;
      for( int i=1 ; i<=100; i++)
         {
            int number=(int)(Math.random()*10);
            lineChange++;
            if( lineChange%10==0 ) System.out.println(number);
            else System.out.print(number+" ");
            counts[number]++;
         }
      for( int j=0; j<=9; j++)
          System.out.println("number "+j+" :  "+counts[j]+" times");
  }          
}
