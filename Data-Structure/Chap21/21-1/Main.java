  public class Main 
{
    public static void main(String[] args)
  {
      //String[] str = {"Andy","Maggie","Sallie","Judy"};
      //Integer[] array = {1,20,300,4000,50000};
      Character[] ch = {'a','b','c'};
      GenericStack<Character> stack = new GenericStack<Character>(ch);
      System.out.println(stack.getSize());
      System.out.println(stack.peek());
      stack.push('d');
      System.out.println(stack.pop());
      System.out.println(stack.isEmpty());
  }    
}
