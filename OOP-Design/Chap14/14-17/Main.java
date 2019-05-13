  public class Main 
{
    public static void main(String[] args)
  {
      Rational sum = new Rational();
      for( long i=1; i<=99; i++)
         { 
            Rational item = new Rational(i,i+1);
            sum = sum.add(item); 
         } 
      System.out.println(sum.toString());
  }    
}
