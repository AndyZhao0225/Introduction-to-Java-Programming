  public class GenericQueue<E> extends MyLinkedList
{
    public void enqueue(E e)
  {
      super.addLast(e);
  }

    public E dequeue()
  {
      return (E)super.removeFirst();
  }    
    
    public int getSize()
  {
      return super.size;
  }
    
    public String toString()
  {
      return "Queue: " + super.toString();
  }
}
