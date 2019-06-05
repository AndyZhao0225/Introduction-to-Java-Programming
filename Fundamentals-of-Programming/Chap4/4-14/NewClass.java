  public class NewClass 
{
    public static void main(String[] args)
  {
      int count=0;
      for(char i='!';i<='~';i++)
        {
           System.out.print(i+" ");
           count++;
           if(count==10)
            {
               System.out.println();
               count=0;
            }
        }
      System.out.println();
  }    
}
