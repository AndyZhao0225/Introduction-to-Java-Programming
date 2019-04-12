  public abstract class MyAbstractList<E> implements MyList<E> 
{
    protected int size = 0; 

    protected MyAbstractList() 
  {
  
  }

    protected MyAbstractList(E[] objects) 
  {
      for( int i=0; i<=objects.length-1; i++)
          add(objects[i]);
  }

    public void add(E e) 
  {
      add(size,e);
  }

    public boolean isEmpty() 
  {
      return size == 0;
  }

    public int size() 
  {
      return size;
  }

    public boolean remove(E e) 
  {
      boolean changed = false;
      if(indexOf(e)>=0) 
        {
           for( int i=0; i<=this.size-1; i++)
              {
                 if(this.get(i).equals(e)) 
                   {
                      remove(i);
                      changed = true;
                      i--;
                   }
              }
        }
      return changed;
  }
    
    public boolean addAll(MyList<E> otherList)
  {
      if(otherList.isEmpty()) return false;
      for( int i=0; i<=otherList.size()-1; i++)
          add(otherList.get(i));
      return true;
  }
    
    public boolean removeAll(MyList<E> otherList)
  {
      boolean changed = false;
      for( int i=0; i<=otherList.size()-1; i++)
         {
            if(this.contains(otherList.get(i)))
              {
                 remove(otherList.get(i));
                 changed = true;
              }
         }
      return changed;
  }
    
    public boolean retainAll(MyList<E> otherList)
  {
      boolean changed = false;
      for( int i=0; i<=this.size()-1; i++)
         {
            if(!otherList.contains(this.get(i)))
              {
                 this.remove(i);
                 i--;
                 changed = true;
              }
         }
      return changed;
  }
}
