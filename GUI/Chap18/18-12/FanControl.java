import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

  public class FanControl extends JPanel
{
    private JButton startButton = new JButton("Start");
    private JButton stopButton = new JButton("Stop");
    private JButton reverseButton = new JButton("Reverse");
    private Fan fan = new Fan();
    private JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
    
    public FanControl()
  {
      setLayout(new BorderLayout());
      
      JPanel panel = new JPanel(new GridLayout());
      panel.add(startButton);
      panel.add(stopButton);
      panel.add(reverseButton);
      bar.setMaximum(60);
      bar.setMinimum(5);
      
      add(panel,BorderLayout.NORTH);
      add(fan,BorderLayout.CENTER);
      add(bar,BorderLayout.SOUTH);
      
      MyActionListener listener = new MyActionListener();
      startButton.addActionListener(listener);
      stopButton.addActionListener(listener);
      reverseButton.addActionListener(listener);
      
      MyAdjustmentListener listener2 = new MyAdjustmentListener();
      bar.addAdjustmentListener(listener2);
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      setBorder(lineBorder);
  }
    
    public void setStart()
  {
      fan.start();
  }
    
    public void setStop()
  {
      fan.stop();
  }
    
    private class MyActionListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==startButton) fan.start();
        if(e.getSource()==stopButton) fan.stop();
        if(e.getSource()==reverseButton) fan.reverse();
    }
  }
    
    private class MyAdjustmentListener implements AdjustmentListener
  {
      public void adjustmentValueChanged(AdjustmentEvent e)
    {
        fan.setSpeed(bar.getValue());
    }
  }
}
