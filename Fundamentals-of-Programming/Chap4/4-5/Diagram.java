  public class Diagram 
{
   public static void main(String[] args)
 {
     System.out.println("Kilogram        Pound           Pound           Kilogram");
     for(int i=1,j=20;i<=199&&j<=515;i+=2,j+=5)System.out.printf("%-3d\t\t%-4.1f\t\t%-3d\t\t%-5.2f\n",i,i*2.2,j,(j/20.0)*9.09);
 }    
}
