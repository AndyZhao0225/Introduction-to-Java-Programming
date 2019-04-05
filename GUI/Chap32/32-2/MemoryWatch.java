import java.util.*;

  public class MemoryWatch implements Runnable
{
    private long highLimit;
    private long lowLimit;    
    private ArrayList<MemoryListener> listenerList;
    private Runtime runtime = Runtime.getRuntime();
    private Thread thread;
    
    public MemoryWatch()
  {
      thread = new Thread(this);
      thread.start();;
  }
    
    public void run()
  {
      while(true)
        {
           try
             {
                Thread.sleep(1000);
             }
           catch(InterruptedException e)
             {
                
             }
           System.out.println("Free memory: " + runtime.freeMemory());
           System.out.println("Total memory: " + runtime.totalMemory());
           System.out.println();
           if(lowLimit>runtime.freeMemory())
             {
                MemoryEvent e = new MemoryEvent(this);
                processLowFreeMemory(e);
             }
           if(highLimit<runtime.freeMemory()) 
             {
                MemoryEvent e = new MemoryEvent(this);
                processHighFreeMemory(e);
             }
        }
  }
    
    public long getHighLimit()
  {
      return highLimit;
  }
    
    public void setHighLimit(long newHighLimit)
  {
      highLimit = newHighLimit;
  }
    
    public long getLowLimit()
  {
      return lowLimit;
  }
    
    public void setLowLimit(long newLowLimit)
  {
      lowLimit = newLowLimit;
  }
    
    public synchronized void addMemoryListener(MemoryListener listener)
  {
      if(listenerList==null) listenerList = new ArrayList<MemoryListener>(2);
      if(!listenerList.contains(listener)) listenerList.add(listener);
  }
    
    public synchronized void removeListener(MemoryListener listener)
  {
      if(listenerList!=null && listenerList.contains(listener)) listenerList.remove(listener);
  }
    
    public void processLowFreeMemory(MemoryEvent e)
  {
      ArrayList list;
      synchronized(this)
        {
           if(listenerList==null) return;
           list = (ArrayList)listenerList.clone();
        }
      for( int i=0; i<=list.size()-1; i++) 
         {
            MemoryListener listener = (MemoryListener)list.get(i);
            listener.insufficientMemory(e);
         }
  }
    
    public void processHighFreeMemory(MemoryEvent e)
  {
      ArrayList list;
      synchronized(this)
        {
           if(listenerList==null) return;
           list = (ArrayList)listenerList.clone();
        }
      for( int i=0; i<=list.size()-1; i++) 
         {
            MemoryListener listener = (MemoryListener)list.get(i);
            listener.sufficientMemory(e);
         }
  }
}
