import java.util.*;

  public class Main 
{
    public static void main(String[] args)
  {
      Scanner input = new Scanner(System.in);
      String expression = input.nextLine();
      System.out.println(infixToPostfix(expression));
  }   
    
    public static String infixToPostfix(String expression)
  {
      Stack<Character> stack = new Stack<Character>();
      Queue<Character> queue = new LinkedList<Character>();
      Set<Character> set1 = new HashSet<Character>();
      set1.add('+');
      set1.add('-');
      Set<Character> set2 = new HashSet<Character>();
      set2.add('*');
      set2.add('/');
      expression = expression.trim();
      
      String result = "";
      for( int i=0; i<=expression.length()-2; i++)
         {
            char ch = expression.charAt(i);
            if(Character.isDigit(ch)) queue.offer(ch);
            else
              {
                 if(stack.isEmpty() || ch=='(') stack.push(ch);
                 else
                   {
                      if(ch==')')
                        { 
                           while(queue.size()>0) result += queue.poll();
                           while(stack.peek()!='(')
                                 result += stack.pop();
                           stack.pop();
                        }
                      else
                        {
                           char temp = stack.peek();
                           boolean s1 = set1.contains(temp) && set1.contains(ch); 
                           boolean s2 = set2.contains(temp) && set2.contains(ch);
                           boolean s3 = set2.contains(temp) && set1.contains(ch);
                           if(s1||s2||s3)
                             {
                                while(queue.size()>0) result += queue.poll();
                                result += stack.pop();
                                for( int j=0; j<=stack.size()-1; j++) 
                                   {
                                      temp = stack.peek();
                                      boolean s11 = set1.contains(temp) && set1.contains(ch); 
                                      boolean s12 = set2.contains(temp) && set2.contains(ch);
                                      boolean s13 = set2.contains(temp) && set1.contains(ch); 
                                      if(s11||s12||s13) result += stack.pop();
                                      else break;  
                                   }     
                                stack.push(ch);
                             }
                           else stack.push(ch);
                        }
                   }
              } 
         }
      char ch = expression.charAt(expression.length()-1);
      if(Character.isDigit(ch)) queue.offer(ch);
      while(queue.size()>0) result += queue.poll();
      while(stack.size()>0)
           {
              char temp = stack.pop();
              if(set1.contains(temp) || set2.contains(temp)) result += temp;
           }     
  
      return result;
  }
}
