import java.util.*;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      int lottery = (int)(Math.random()*1000);
      System.out.print("Enter your lottery pick (three digits): ");
      int guess = input.nextInt();     
      int lotteryDigit1 = lottery/100;
      int lotteryDigit2 = (lottery - lotteryDigit1*100)/10;
      int lotteryDigit3 = lottery%10;
      int guessDigit1 = guess/100;
      int guessDigit2 = (guess - guessDigit1*100)/10;
      int guessDigit3 = guess%10;
      
      ArrayList<Integer> lotteryList = new ArrayList<Integer>();
      lotteryList.add(lotteryDigit1);
      lotteryList.add(lotteryDigit2);
      lotteryList.add(lotteryDigit3);
      
      System.out.println("The lottery number is " + lottery);
      if(guess==lottery) System.out.println("Exact match: you win $10,000");
      else
        {
           Collections.sort(lotteryList);
           ArrayList<Integer> list1 = new ArrayList<Integer>();
           list1.add(guessDigit1);
           list1.add(guessDigit2);
           list1.add(guessDigit3);
           Collections.sort(list1);
           boolean allDigitsMatch = true;
           for( int i=0; i<=list1.size()-1; i++)
              {
                 if(!lotteryList.get(i).equals(list1.get(i)))
                   {
                      allDigitsMatch = false;
                      break;
                   } 
              }
           if(allDigitsMatch) System.out.println("Match all the digis: you win $3,000");
           else
             {
                int matchesCount = 0;
                for( int i=0; i<=list1.size()-1; i++)
                   {
                      if(lotteryList.contains(list1.get(i)))
                        {
                           lotteryList.remove(lotteryList.indexOf(list1.get(i)));
                           matchesCount++;
                        }
                   }
                if(matchesCount==2) System.out.println("Match two digis: you win $2,000");
                else if(matchesCount==1) System.out.println("Match one digit: you win $1,000");
                else System.out.println("Sorry, no match");
             }
        }
  }    
}
