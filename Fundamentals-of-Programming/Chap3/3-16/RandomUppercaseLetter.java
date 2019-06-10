  public class RandomUppercaseLetter 
{
    public static void main(String[] args)
  {
      int random=(int)(Math.random()*100);
      char letter=(char)(random%26+65);
      System.out.println(letter);
  }
}
