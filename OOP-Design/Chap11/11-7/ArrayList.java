  public class ArrayList 
{
    private int DEFAULT_CAPACITY = 16;  
    private Object[] array; 
    private int size;
    private int capacity;
    
    public ArrayList()
  {
      capacity = DEFAULT_CAPACITY;
      array = new Object[capacity];
      size = 0;
  }  
    
    public void add(Object o)
  { 
      if( size<capacity ) array[size++] = o;  
      else
        {
           capacity = 2 * capacity;
           Object[] temp = new Object[capacity];
           System.arraycopy(array,0,temp,0,size);
           array = temp;
           array[size++] = o;
        }
  }
    
    public void add(int index, Object o)
  {
      if( index<=size-1 && index>=0 )
        {
           if( size>=capacity )
             {
                capacity = 2 * capacity;
                Object[] temp = new Object[capacity];
                System.arraycopy(array,0,temp,0,size);
                array = temp;
             }
           for( int i=size-1; i>=index; i--)
               array[i+1] = array[i];
           size++;
           array[index] = o;
        }
      else if( index==size ) add(o);       
      else System.out.println("Error!");
  }
    
    public void clear()
  {
      for( int i=0; i<=size-1; i++)
          array[i] = null;
      size = 0;   
  }
    
    public boolean contains(Object o)
  {
      for( int i=0; i<=size-1; i++)
          if( o.equals(array[i]) ) return true;
      return false;
  }
    
    public Object get(int index)
  {
      if( index<=size-1 && index>=0 )
         return array[index];
      else return null;
  }
    
    public int indexOf(Object o)
  {
      for( int i=0; i<=size-1; i++)
          if( o.equals(array[i]) ) return i;
      return -1;
  }
    
    public boolean isEmpty()
  {
      return size==0;
  }
    
    public int lastIndexOf(Object o)
  {
      for( int i=size-1; i>=0; i--)
          if( o.equals(array[i]) ) return i;
      return -1;
  }
    
    public boolean remove(Object o)
  {
      boolean mark = false;
      for( int i=0; i<=size-1; i++)
         {
            if( o.equals(array[i]) ) 
              {
                 for( int j=i+1; j<=size-1; j++)
                     array[j-1] = array[j];
                 array[size] = null;
                 size--;   
                 mark = true;
                 i--;
              }
         }  
      return mark;
  }
    
    public int size()
  {
      return size;
  }
    
    public boolean remove(int index)
  {
      if( index<=size-1 && index>=0 )
        {
           for( int i=index+1; i<=size-1; i++)
               array[i-1] = array[i];
           array[size] = null;
           size--;
           return true;
        }
      else return false;
  }
    
    public Object set(int index, Object o)
  {
      if( index<=size-1 && index>=0 )
         array[index] = o;
      return o;
  }
}
