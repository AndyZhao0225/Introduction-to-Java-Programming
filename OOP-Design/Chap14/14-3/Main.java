  public class Main 
{
    public static void main(String[] args)
  {
      GeometricObject[] o = new GeometricObject[5];
      o[0] = new Square();
      o[3] = new Square();
      o[4] = new Square();
      
      for( int i=0; i<=4; i++ )
         {
            if( o[i] instanceof Colorable ) 
              {
                 System.out.print(i+": ");
                 ((Colorable)o[i]).howToColor();
              }
         }
  }    
}
