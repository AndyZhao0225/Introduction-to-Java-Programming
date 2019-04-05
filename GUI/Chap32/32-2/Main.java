import java.awt.*;
import javax.swing.*;

  public class Main extends JApplet implements MemoryListener
{
    private MemoryWatch memoryWatch = new MemoryWatch(); 
    private boolean isStandalone = false;
    private JScrollPane pane = new JScrollPane();
    private JTextArea area = new JTextArea();

    public void init() 
  {
      this.setSize(new Dimension(400,300));
      area.setText("jTextArea1");
      memoryWatch.addMemoryListener(new MemoryListener(){
      public void sufficientMemory(MemoryEvent e) 
        {
           memoryWatch1_sufficientMemory(e);
        }
      public void insufficientMemory(MemoryEvent e) 
        {
           memoryWatch1_insufficientMemory(e);
        }});
      this.add(pane,BorderLayout.CENTER);
      pane.getViewport().add(area,null);
  }

    public static void main(String[] args) 
  {
      Main applet = new Main();
      applet.isStandalone = true;
      JFrame frame = new JFrame();
      frame.setTitle("32-2");
      frame.add(applet,BorderLayout.CENTER);
      applet.init();
      applet.start();
      frame.setSize(400,320);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null); 
      frame.setVisible(true);
  }

    public void sufficientMemory(MemoryEvent e) 
  {
      area.setText("Sufficient Memory\n");
      area.append("highLimit " + memoryWatch.getHighLimit() + "\n");
      area.append("free memory " + e.freeMemory() + "\n");
      area.append("total memory " + e.totalMemory() + "\n");
  }

    public void insufficientMemory(MemoryEvent e) 
  {
      area.setText("Insufficient Memory\n");
      area.append("lowLimit " + memoryWatch.getLowLimit()+"\n");
      area.append("free memory " + e.freeMemory() + "\n");
      area.append("total memory " + e.totalMemory() + "\n");
  }
   
    public void memoryWatch1_insufficientMemory(MemoryEvent e) 
  {
      insufficientMemory(e);
  }

    public void memoryWatch1_sufficientMemory(MemoryEvent e) 
  {
      sufficientMemory(e);
  }
}
