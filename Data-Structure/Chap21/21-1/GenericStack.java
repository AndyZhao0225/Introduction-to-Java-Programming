  public class GenericStack<E> 
{
    private final int DEFAULT_CAPACITY = 10;
    private int pointer = 0;
    private E[] list; 
    
    public GenericStack()
  {
      list = (E[])new Object[DEFAULT_CAPACITY];
  }
    
    public GenericStack(E[] array)
  {
      int capacity = DEFAULT_CAPACITY;
      while(array.length>capacity) capacity *= 2;
      list = (E[])new Object[capacity];
      int i = 0;
      for( ; i<=array.length-1; i++)
          list[i] = array[i];
      pointer = i;
  }
    
    public int getSize() 
  {
      return pointer;
  }

    public E peek() 
  {
      return list[pointer-1];
  }

    public void push(E o) 
  {
      list[pointer] = o;
      pointer++;
  }

    public E pop() 
  {
      E o = peek();
      pointer--;
      return o;
  }

    public boolean isEmpty() 
  {
      return pointer==0;
  }
}
