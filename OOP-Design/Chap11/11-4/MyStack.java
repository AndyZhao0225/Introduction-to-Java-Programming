import java.util.ArrayList;

  public class MyStack extends ArrayList
{
    public MyStack()
  {
      
  }    
    
    public Object peek()
  {
      return super.get(super.size()-1);
  }  
    
    public Object pop()
  {
      Object o = peek();
      super.remove(super.size()-1);
      return o;
  }
    
    public void push(Object o)
  {
      super.add(o);
  }
    
    public int search(Object o)
  {
      return super.lastIndexOf(o);
  }
    
    public String toString()
  {
      return "stack" + super.toString();
  }
}
