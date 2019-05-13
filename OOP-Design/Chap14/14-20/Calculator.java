  public class Calculator 
{
    public static void main(String[] args) 
  {
      if( args.length!=3 ) 
        {
           System.out.println("Usage: java Calculator operand1 operator operand2");
           System.exit(0);
        }
      
      Rational[] n = new Rational[2];
      String[] tokens;
      for( int i=0; i<=1; i++)
         {
            if(i==0) tokens = args[0].split("/"); 
            else tokens = args[2].split("/");
            long numerator = Long.parseLong(tokens[0]);
            long denominator = Long.parseLong(tokens[1]);
            n[i] = new Rational(numerator,denominator);
         }

      Rational result;
      switch(args[1].charAt(0)) 
            {
               case '+': result = n[0].add(n[1]); break;
               case '-': result = n[0].subtract(n[1]); break;
               case '*': result = n[0].multiply(n[1]); break;
               case '/': result = n[0].divide(n[1]); break;
               default: result = new Rational();
            }

      System.out.println(args[0] + ' ' + args[1] + ' ' + args[2]
                       + " = " + result.toString());
  }
}

