import java.util.Scanner;
import java.text.*;
import java.util.Locale;

  public class ComputeLoan 
{
    private static NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
      
    public static void main(String[] args) {   
    // Create a Scanner
    Scanner input = new Scanner(System.in);

    // Enter yearly interest rate
    System.out.print("Enter yearly interest rate, for example 8.25: ");
    double annualInterestRate = input.nextDouble();
    
    // Obtain monthly interest rate
    double monthlyInterestRate = annualInterestRate / 1200;

    // Enter number of years
    System.out.print(
      "Enter number of years as an integer, for example 5: ");
    int numberOfYears = input.nextInt();
    
    // Enter loan amount
    System.out.print("Enter loan amount, for example 120000.95: ");
    double loanAmount = input.nextDouble();
    
    // Calculate payment
    double monthlyPayment = loanAmount * monthlyInterestRate / (1
      - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
    double totalPayment = monthlyPayment * numberOfYears * 12;

    // Display results
    System.out.println("The monthly payment is " + 
      currencyFormat.format((monthlyPayment * 100) / 100.0));
    System.out.println("The total payment is " + 
      currencyFormat.format((totalPayment * 100) / 100.0));
  }
}
