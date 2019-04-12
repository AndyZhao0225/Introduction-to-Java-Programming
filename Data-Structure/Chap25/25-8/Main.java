import java.util.*;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      String expression = input.nextLine();
      
      ArrayList<Character> list = new ArrayList<Character>();
      list.add('+');
      list.add('-');
      list.add('*');
      list.add('/');
      list.add('%');
      list.add('^');
      
      Stack<Integer> stack = new Stack<Integer>();
      for( int i=0; i<=expression.length()-1; i++)
         {
            char character = expression.charAt(i);
            if(Character.isDigit(character))
              {
                 if(stack.size()>=2)
                   {
                      System.out.println("Invalid Expression");
                      return;
                   }
                 stack.push(character-'0');
              }
            else if(list.contains(character))
              {
                 if(stack.size()<2)
                   {
                      System.out.println("Invalid Expression");
                      return;
                   }
                 int num2 = stack.pop();
                 int num1 = stack.pop();
                 int newNum = 0;
                 int index = list.indexOf(character);
                 switch(index)
                   {
                     case 0: newNum = num1 + num2; break;
                     case 1: newNum = num1 - num2; break;
                     case 2: newNum = num1 * num2; break;
                     case 3: newNum = num1 / num2; break;
                     case 4: newNum = num1 % num2; break;
                     case 5: newNum = (int)Math.pow(num1,num2); 
                   }
                 stack.push(newNum);
              }
            else 
              {
                 System.out.println("Invalid Expression");
                 return;
              }
         }
      
      if(stack.size()!=1)
        {
           System.out.println("Invalid Expression");
           return;  
        }
      
      System.out.println(stack.pop());  
  }    
}
