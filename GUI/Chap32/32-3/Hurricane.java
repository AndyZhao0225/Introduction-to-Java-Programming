import java.awt.event.*; 
import java.util.*;

  public class Hurricane 
{
    private String name;
    private int category;
    private ArrayList<ActionListener> actionListenerList;
    
    public void setCategory(int newCategory)
  {  
      category = newCategory;
      checkCategory();
  }
    
    public int getCategory()
  {
      return category;
  }    
    
    public synchronized void addActionListener(ActionListener listener)
  {
      if(actionListenerList==null) actionListenerList = new ArrayList<ActionListener>(2);
      if(!actionListenerList.contains(listener)) actionListenerList.add(listener);
  }
    
    public synchronized void removeAcitonListener(ActionListener listener)
  {
      if(actionListenerList!=null && actionListenerList.contains(listener)) actionListenerList.remove(listener);
  }
    
    private void checkCategory()
  {
      if(category<2) processEvent(new ActionEvent(this,ActionEvent.ACTION_PERFORMED,"Hurricane category "+category));
      else processEvent(new ActionEvent(this,ActionEvent.ACTION_PERFORMED,"Hurricane category "+category+" Warning!!!"));
  }
    
    private void processEvent(ActionEvent e)
  {
      ArrayList list;
      
      synchronized(this)
        {
           if(actionListenerList==null) return;
           list = (ArrayList)actionListenerList.clone();
        }
      
      for( int i=0; i<=list.size()-1; i++)
         {
            ActionListener listener = (ActionListener)list.get(i);
            listener.actionPerformed(e);
         } 
  }
}
