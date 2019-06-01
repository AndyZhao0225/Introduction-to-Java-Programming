  public class SinAndCos 
{
    public static void main(String[] args)
  {
      System.out.println("Degree      Sin          Cos");
      for(int degree=0; degree<=360; degree+=10)  
        { 
          double radians=Math.toRadians(degree);  
          System.out.printf("%-3d        %7.4f      %7.4f\n",degree,Math.sin(radians),Math.cos(radians));
        }
  }    
}
