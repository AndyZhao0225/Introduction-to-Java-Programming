import javax.swing.JApplet;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
        
  public class AllFansControl extends JApplet
{
    private FanControl fanControl1 = new FanControl();   
    private FanControl fanControl2 = new FanControl();
    private FanControl fanControl3 = new FanControl();
    private JButton startAll = new JButton("Start All");
    private JButton stopAll = new JButton("Stop All");
     
    public AllFansControl()
  {
      setLayout(new BorderLayout());
      
      JPanel panel1 = new JPanel(new GridLayout(1,3));
      panel1.add(fanControl1);
      panel1.add(fanControl2);
      panel1.add(fanControl3);
      
      JPanel panel2 = new JPanel();
      panel2.add(startAll);
      panel2.add(stopAll);
      
      add(panel1,BorderLayout.CENTER);
      add(panel2,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      startAll.addActionListener(listener);
      stopAll.addActionListener(listener);
  } 
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==startAll) 
          {
             fanControl1.setStart();
             fanControl2.setStart();
             fanControl3.setStart();
          }
        if(e.getSource()==stopAll) 
          {
             fanControl1.setStop();
             fanControl2.setStop();
             fanControl3.setStop();
          }
    }
  }
}
