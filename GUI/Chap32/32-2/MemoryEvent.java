import java.util.*;

  public class MemoryEvent extends EventObject
{
    Runtime runtime = Runtime.getRuntime();
      
    public MemoryEvent(Object object)
  {
      super(object);
  }
    
    public long freeMemory()
  {
      return runtime.freeMemory();
  }
     
    public long totalMemory()
  {
      return runtime.totalMemory();
  }
}
