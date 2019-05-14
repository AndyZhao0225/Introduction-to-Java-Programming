  public class Main 
{
    public static void main(String[] args) 
  {
      if( args.length!=3 ) 
        {
           System.out.println("Usage: java Calculator operand1 operator operand2");
           System.exit(0);
        }

      for( int i=0; i<=args[0].length()-1; i++)
         {
            if( args[0].charAt(i)>'9' || args[0].charAt(i)<'0' )
              {
                 System.out.println("Invalid input: " + args[0]);
                 return;
              }
         }
      
      for( int i=0; i<=args[2].length()-1; i++)
         {
            if( args[2].charAt(i)>'9' || args[2].charAt(i)<'0' )
              {
                 System.out.println("Invalid input: " + args[2]);
                 return;
              }
         }
      
      int result = 0;
      switch(args[1].charAt(0)) 
         {
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
            case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
         }
      System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
  }
}

