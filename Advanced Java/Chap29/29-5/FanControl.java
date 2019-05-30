import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FanControl extends JFrame
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
