  public class Diagram 
{
   public static void main(String[] args)
 {
     System.out.println("Mile\t\tKilometer\t\tKilometer\tMile");
     for(int i=1,j=20;i<=10&&j<=65;i+=1,j+=5)System.out.printf("%-2d\t\t%-5.3f\t\t\t%d\t\t%5.3f\n",i,i*1.609,j,j/20.0*12.430);
 }    
}
