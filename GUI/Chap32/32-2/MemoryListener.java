import java.util.*;

  public interface MemoryListener extends EventListener
{     
    public void sufficientMemory(MemoryEvent e);
    
    public void insufficientMemory(MemoryEvent e);
}
