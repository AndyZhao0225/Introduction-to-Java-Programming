import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a,b,c: ");
      double[] eqn = new double[3]; 
      for( int i =0; i<=2; i++)
          eqn[i] = input.nextDouble();    
      double[] roots = new double[2];
      int numberOfRoots = solveQuadratic(eqn,roots);
      
      if( numberOfRoots >99999 ) 
        {
           System.out.println("The number of roots is infinite");
           return;
        }
      
      if( numberOfRoots == 0 )
        {
           System.out.println("There is no roots for the equation");
           return;
        }
      
      System.out.println("The number of roots is "+numberOfRoots);
      if( numberOfRoots == 2 ) System.out.printf("They're %.2f   %.2f\n",roots[0],roots[1]);
      else System.out.printf("It's %.2f\n",roots[0]);
  }   
    
    public static int solveQuadratic(double[] eqn, double[] roots)
  {
      double a = eqn[0];
      double b = eqn[1];
      double c = eqn[2];
      if( a == 0 ) 
        {
           if( b == 0 )
             {
                if( c == 0 ) return 100000;
                else return 0;
             }
           else 
             {
                roots[0] = c / b;
                return 1;
             }
        }
      else
        {
           double judgement = b*b - 4*a*c;
           if( judgement < 0 ) return 0;
           else if( judgement == 0 ) 
                  {
                     roots[0] = - b / ( 2*a );
                     return 1;
                  }
           else 
             {
                roots[0] = (-b + Math.sqrt(judgement))/(2*a);
                roots[1] = (-b - Math.sqrt(judgement))/(2*a);
                return 2;
             }
        }
  }
}
