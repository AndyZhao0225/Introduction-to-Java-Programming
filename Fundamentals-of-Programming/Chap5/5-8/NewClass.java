  public class NewClass 
{
    public static void main(String[] args)
  {  
      System.out.println("celsius     fahrenheit\t\t\tfahrenheit     celsius");
      for( double celsius=40.0, fahrenheit=120.0; celsius>=31.0 || fahrenheit>=30; celsius--, fahrenheit-=10)
         System.out.printf("%.1f        %.1f\t\t\t%5.1f          %.2f\n",celsius,Conversion.celsiusToFarenheit(celsius),fahrenheit,Conversion.fahrenheitToCelsius(fahrenheit)); 
  }
}
