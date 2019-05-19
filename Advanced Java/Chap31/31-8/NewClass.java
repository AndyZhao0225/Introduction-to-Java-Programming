import java.text.*;

  public class NewClass 
{
    private static DecimalFormat decimaFormat = (DecimalFormat)DecimalFormat.getInstance();
      
    public static void main(String[] args)
  {  
      decimaFormat.applyPattern("0.##");
      System.out.println("celsius     fahrenheit\t\t\tfahrenheit     celsius");
      for( double celsius=40.0, fahrenheit=120.0; celsius>=31.0 || fahrenheit>=30; celsius--, fahrenheit-=10)
          System.out.printf("%-12s%-12s\t\t%-15s%-15s\n",
                            decimaFormat.format(celsius),decimaFormat.format(Conversion.celsiusToFarenheit(celsius)),
                            decimaFormat.format(fahrenheit),decimaFormat.format(Conversion.fahrenheitToCelsius(fahrenheit))); 
  }
}
