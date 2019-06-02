import java.util.Scanner;

  public class SquareRoot 
{
    public static void main(String[] args)
  {
      Scanner input= new Scanner(System.in);
      System.out.print("Enter a number: ");
      double num=input.nextDouble();
      double squareRoot=computeSquareRoot(num);
      System.out.printf("The square root of %.4f is %.4f\n",num,squareRoot);     
  }    
    
    public static double computeSquareRoot(double num)
  {
      double lastGuess;
      double nextGuess=1;
      do{
           lastGuess=nextGuess;
           nextGuess=( lastGuess+ (num/lastGuess))/2;
        }while(Math.abs(nextGuess-lastGuess)>0.0001);
      return nextGuess;
  }
}
