  public class Main 
{
    public static void main(String[] args)
  {
      try
        {
           House house1 = new House(1,2000);
           System.out.println(house1.getId());
           System.out.println(house1.getArea());
           System.out.println(house1.getWhenBuilt());
           House house2 = (House)house1.clone();
           System.out.println(house2.getId());
           System.out.println(house2.getArea());
           System.out.println(house2.getWhenBuilt());
        }
      catch(CloneNotSupportedException ex)
           {
                 
           }
      
  }    
}
