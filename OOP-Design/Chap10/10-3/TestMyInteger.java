import java.util.Scanner;

  public class TestMyInteger 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      
      MyInteger myInt = new MyInteger(input.nextInt());
      System.out.println(myInt.getValue());
      System.out.println("Is it even? "+myInt.isEven());
      System.out.println("Is it odd? "+myInt.isOdd());
      System.out.println("Is it prime? "+myInt.isPrime());
      
      System.out.print("\nEnter another integer:");
      int temp = input.nextInt();
      System.out.println("Is it even? "+MyInteger.isEven(temp));
      System.out.println("Is it odd? "+MyInteger.isOdd(temp));
      System.out.println("Is it prime? "+MyInteger.isPrime(temp));
      
      System.out.print("\nEnter another integer:");
      MyInteger myIntTemp = new MyInteger(input.nextInt());
      System.out.println("Is it even? "+MyInteger.isEven(myIntTemp));
      System.out.println("Is it odd? "+MyInteger.isOdd(myIntTemp));
      System.out.println("Is it prime? "+MyInteger.isPrime(myIntTemp));
      
      System.out.println("\nIs the first one integer equal to the second one? "+myInt.equals(temp));
      System.out.println("Is the first one integer equal to the third one? "+myInt.equals(myIntTemp));
      
      System.out.print("\nEnter a string: ");
      String str = input.next();
      char[] array = str.toCharArray();
      int number = MyInteger.parseInt(array);
      System.out.println(number);
      number = MyInteger.parseInt(str);
      System.out.println(number);
  }    
}
