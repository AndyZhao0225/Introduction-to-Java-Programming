import java.util.Scanner;

  public class NewClass 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a character: ");
      MyCharacter myCharacter = new MyCharacter(input.next().charAt(0));
      
      System.out.println(myCharacter.ch);
      
      System.out.print("Enter another character: ");
      System.out.println( myCharacter.compareTo( new MyCharacter(input.next().charAt(0)) ) );
      
      System.out.print("Enter another character: ");
      System.out.println( myCharacter.equals( new MyCharacter(input.next().charAt(0)) ) );
      
      System.out.print("Enter another character: ");
      char cha = input.next().charAt(0);
      System.out.println(cha+" is "+(MyCharacter.isDigit(cha)?"a digit":"not a digit"));
      
      System.out.print("Enter another character: ");
      cha = input.next().charAt(0);
      System.out.println(cha+" is "+(MyCharacter.isLetter(cha)?"a letter":"not a letter"));
      
      System.out.print("Enter another character: ");
      cha = input.next().charAt(0);
      System.out.println(cha+" is "+(MyCharacter.isLetterOrDigit(cha)?"either a letter or a digit":"neither a letter nor a digit"));
      
      System.out.print("Enter another character: ");
      cha = input.next().charAt(0);
      System.out.println(cha+" is "+(MyCharacter.isLowerCase(cha)?"a lowercase letter":"not a lowercase letter"));
      
      System.out.print("Enter another character: ");
      cha = input.next().charAt(0);
      System.out.println(cha+" is "+(MyCharacter.isUpperCase(cha)?"an uppercase letter":"not an uppercase letter"));
      
      System.out.print("Enter an uppercase letter to transform to its lowercase: ");
      cha = MyCharacter.toLowerCase(input.next().charAt(0));
      if( cha == '0' ) System.out.println("Your input is not a uppercase letter");
      else System.out.println("Its lowercase is "+cha);
      
      System.out.print("Enter a lowercase letter to transform to its uppercase: ");
      cha = MyCharacter.toUpperCase(input.next().charAt(0));
      if( cha == '0' ) System.out.println("Your input is not a lowercase letter");
      else System.out.println("Its uppercase is "+cha);
  }    
}
