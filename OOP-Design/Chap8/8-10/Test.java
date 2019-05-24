import java.util.Scanner;

  public class Test 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a,b,c for a quadratic equation: ");
      double a = input.nextDouble();
      double b = input.nextDouble();
      double c = input.nextDouble();
      
      QuadraticEquation equation = new QuadraticEquation(a,b,c);
      if(a==0) System.out.println("Your input is not a quadratic equation.");
      else if(equation.getDiscriminant()>0)
        {
           System.out.println("The two roots for the equation are");
           System.out.println(equation.getRoot1()+"   "+equation.getRoot2());
        }
      else if(equation.getDiscriminant()==0)
             {
                System.out.println("The only root for the equation is");
                System.out.println(equation.getRoot1());
             }
      else System.out.println("The equation has no roots.");
  }    
}
