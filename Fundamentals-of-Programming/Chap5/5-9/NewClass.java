  public class NewClass 
{
    public static void main(String[] args)
  {
      System.out.println("foot        meter\t\t\t meter         foot");
      for( double feet=1.0, meters=20.0; feet<=10.0 || meters<=65.0; feet++, meters+=5)
         System.out.printf("%-4.1f        %.3f\t\t\t%5.1f          %.3f\n",feet,Conversion.footTometer(feet),meters,Conversion.meterToFoot(meters)); 
  }    
}
