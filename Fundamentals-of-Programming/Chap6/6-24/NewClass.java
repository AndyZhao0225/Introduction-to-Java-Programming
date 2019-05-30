  public class NewClass 
{
    public static void main(String[] args)
  {
      int count = 0;
      boolean[] mark = new boolean[4];
      for( int i=0; i<=3; i++) mark[i] = false;
      while( !(mark[0]&&mark[1]&&mark[2]&&mark[3]) )
           {
              int card = pick();
              if( !mark[card/13])
                {
                   System.out.println(displayNumber(card)+" of "+displayColor(card));
                   mark[card/13] = true; 
                }
              count++;
           }
      System.out.println("Number of picks: "+count);
  }   
    
    public static int pick()
  {
      int card = (int)(Math.random()*52);
      return card;
  }
    
    public static String displayNumber(int card)
  {
      String str = "";
      switch( card % 13 )
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
               case 0: str = "King"; break;
               default: ;
            }
      return str;
  }
    
    public static String displayColor(int card)
  {
     String color = "";
     switch( card/13 )
           {
              case 0: color = "Spades"; break;
              case 1: color = "Clubs"; break;
              case 2: color = "Hearts";break;
              case 3: color = "Diamonds"; break;
            }
     return color; 
  }
}
