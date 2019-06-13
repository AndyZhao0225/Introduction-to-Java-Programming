import java.util.Scanner;
 
  public class PrintSalaryInvoice 
{
      public static void main(String[] args)
   {
        Scanner input=new Scanner(System.in);
        String name;
        double hoursWorked,payRate,federalTaxWithholdingRate,stateTaxWithholdingRate,grossPay,netPay,federalWithholding,stateWithholding,deduction;
        System.out.print("Enter employee's name: ");
        name=input.next();
        System.out.print("Enter number of hours worked in a week: ");
        hoursWorked=input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        payRate=input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        federalTaxWithholdingRate=input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        stateTaxWithholdingRate=input.nextDouble();
        grossPay=hoursWorked*payRate;
        federalWithholding=federalTaxWithholdingRate*grossPay;
        stateWithholding=stateTaxWithholdingRate*grossPay;
        deduction=federalWithholding+stateWithholding;
        netPay=grossPay-deduction;
        System.out.println("Employee Name; "+name);
        System.out.println("Hours Worked: "+hoursWorked);
        System.out.println("Pay Rate: $"+payRate);
        System.out.println("Gross Pay: $"+grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding("+(int)(federalTaxWithholdingRate*100)/1.0+"%): $"+federalWithholding);
        System.out.println("  State Withholding("+(int)(stateTaxWithholdingRate*100)/1.0+"%): $"+stateWithholding);
        System.out.println("  Total Deduction: $"+deduction);
        System.out.println("Net Pay: $"+netPay);
   }
}
