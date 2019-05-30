  public class NewClass 
{
    public static void main(String[] args)
  {
      int sum = 0;
      int card = 0;
      int count = 0;
      System.out.println("Spade     Club      Diamond   Heart     "); 
      while(sum != 24)
           {
              count++;
              sum = 0; 
              for( int i=0; i<=3; i++)
                 {
                    card = select();
                    System.out.printf("%-10s",display(card)); 
                    sum += card;
                 }
              System.out.println();
           }
      System.out.println(count);
  }   
    
    public static int select()
  {
      int card = 1 + (int)(Math.random()*13);
      return card;
  }
    
    public static String display(int card)
  {
      String str = "";
      switch(card)
            {
               case 1: str = "Ace"; break;
               case 2: str = "2"; break;
               case 3: str = "3"; break;
               case 4: str = "4"; break;
               case 5: str = "5"; break;
               case 6: str = "6"; break;
               case 7: str = "7"; break;
               case 8: str = "8"; break;
               case 9: str = "9"; break;
               case 10: str = "10"; break;
               case 11: str = "Jack"; break;
               case 12: str = "Queen"; break;
               case 13: str = "King"; break;
               default: ;
            }
      return str;
  }
}
