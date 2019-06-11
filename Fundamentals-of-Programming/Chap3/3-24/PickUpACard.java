  public class PickUpACard 
{
    public static void main(String[] args)
  {
      int number=(int)(Math.random()*100)%13;
      String output1;
      switch(number)
         {
           case 1:output1="Ace";break;
           case 2:output1="2";break;
           case 3:output1="3";break;
           case 4:output1="4";break;
           case 5:output1="5";break;
           case 6:output1="6";break;
           case 7:output1="7";break;
           case 8:output1="8";break;
           case 9:output1="9";break;
           case 10:output1="10";break;    
           case 11:output1="Jack";break;
           case 12:output1="Queen";break;
           case 0:output1="King";break;   
           default:output1="";
         }
      String output2;
      int color=(int)(Math.random()*10)%4;
      switch(color)
         {
           case 1:output2="Clubs";break;
           case 2:output2="Diamond";break;
           case 3:output2="Heart";break;
           case 0:output2="Spades";break;
           default: output2="";
         }
      System.out.println("The card you picked is "+output1+" of "+output2);
  }    
}
