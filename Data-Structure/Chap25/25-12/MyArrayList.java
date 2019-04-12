import java.io.*;
import java.util.*;

  public class MyArrayList<E extends Object> extends AbstractList<E> implements List<E>, Cloneable, Serializable
{
    public static final int INITIAL_CAPACITY = 16;
    private E[] data = (E[])new Object[INITIAL_CAPACITY]; 
    private int size;
      
    public MyArrayList()
  {
      size = 0;
  } 
    
    public MyArrayList(E[] newData)
  {
      for( int i=0; i<=newData.length-1; i++)
          add(newData[i]);
      size = newData.length;
  }   
    
    public boolean add(E e)
  {
      ensureCapacity();
      data[size] = e;
      size++;
      return true;
  }
    
    public void add(int index, E e)
  {
      ensureCapacity();
      if(index==size) add(e);    
      else 
        {
           for( int i=size-1; i>=index; i--)
               data[i+1] = data[i]; 
           data[index] = e; 
           size++;
        }
  }
    
    public E get(int i)
  {
      return data[i];
  }
    
    public boolean contains(Object obj)
  {
      for( int i=0; i<=size()-1; i++)
          if(obj.equals(data[i])) return true;
      return false;
  }
    
    public int indexOf(Object obj)
  {
      for( int i=0; i<=size()-1; i++)
          if(obj.equals(data[i])) return i;
      return -1;
  }
  
    public int lastIndexOf(Object obj)
  {
      for( int i=size()-1; i>=0; i--)
          if(obj.equals(data[i])) return i;
      return -1;
  }  
  
    public E remove(int index)
  {
      E temp =  data[index];
      for( int i=index; i<=size-2; i++)
          data[i] = data[i+1];
      data[size-1] = null;
      size--;
      return temp;
  }
    
    public E set(int index, E e)
  {
      E old =  data[index];
      data[index] = e;
      return old;
  }
    
    public String toString()
  {
      String str = "";
      for( int i=0; i<=size()-1; i++)
          str = str + get(i)+" ";
      return str;
  }
    
    public int size()
  {
      return size;
  }
    
    public void clear()
  {
      data = (E[])new Object[INITIAL_CAPACITY];  
      size = 0;
  }
    
    private void ensureCapacity()
  {
      if(size>=data.length)
        {
           E[] newData = (E[])new Object[2*data.length+1];
           System.arraycopy(data,0,newData,0,size);
           data = newData;
        }
  }    
    
    public void trimToSize()
  {
      if(size!=data.length)
        {
           E[] newData = (E[])new Object[size];
           System.arraycopy(data,0,newData,0,size);
           data = newData;
        }
  }
}
