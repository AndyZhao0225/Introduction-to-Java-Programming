import javax.swing.JFrame;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

  public class MyFrame extends JFrame
{
    public MyFrame()
  {
      MyListener listener = new MyListener();
      this.addComponentListener(listener);
  }
       
    private class MyListener implements ComponentListener
  {
      public void componentMoved(ComponentEvent e)
    {
        System.out.println("Component moved");
    }  
      
      public void componentResized(ComponentEvent e)
    {
        System.out.println("Component resized");
    } 
      
      public void componentShown(ComponentEvent e)
    {
        System.out.println("Component shown");
    }
      
      public void componentHidden(ComponentEvent e)
    {
        System.out.println("Component hidden");
    }
  }
}
