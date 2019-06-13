import javax.swing.JOptionPane;

  public class PrintSalaryInvoice 
{
     public static void main(String[] args)
   {
       String name,hoursWorkedString,payRateString,federalTaxRateString,stateTaxRateString;
       double hoursWorked,payRate,federalTaxRate,stateTaxRate,grossPay,netPay,federalTax,stateTax,deduction;
       name=JOptionPane.showInputDialog("Enter the employee's name:");
       hoursWorkedString=JOptionPane.showInputDialog("Enter number of hours worked in a week:");
       payRateString=JOptionPane.showInputDialog("Enter hourly pay rate:");
       federalTaxRateString=JOptionPane.showInputDialog("Enter federal tax withholding rate:");
       stateTaxRateString=JOptionPane.showInputDialog("Enter state tax withholding rate;");
       hoursWorked=Double.parseDouble(hoursWorkedString);
       payRate=Double.parseDouble(payRateString);
       federalTaxRate=Double.parseDouble(federalTaxRateString);
       stateTaxRate=Double.parseDouble(stateTaxRateString);
       grossPay=hoursWorked*payRate;
       federalTax=grossPay*federalTaxRate;
       stateTax=grossPay*stateTaxRate;
       deduction=federalTax+stateTax;
       netPay=grossPay-deduction;
       JOptionPane.showMessageDialog(null,"Employee Name: "+name
                                         +"\nHours Worked: "+hoursWorked
                                         +"\nPay Rate: $"+payRate
                                         +"\nGross Rate: $"+grossPay
                                         +"\nDeductions"
                                         +"\n  Federal Withholding ("+(int)(federalTaxRate*100)/1.0+"%); $"+federalTax
                                         +"\n  State Withholding ("+(int)(stateTaxRate*100)/1.0+"%): $"+stateTax
                                         +"\n  Total Deduction: $"+deduction
                                         +"\nNet Pay: $"+netPay);                                          
   }
}
