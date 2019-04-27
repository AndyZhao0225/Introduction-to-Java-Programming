import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.border.TitledBorder;

  public class MyFrame extends JFrame
{
    private JPanel panel = new JPanel();
    private MyFirstPanel panel1 = new MyFirstPanel();
    private MySecondPanel panel2 = new MySecondPanel();
    private JLabel label = new JLabel("Show Colors");
    private int redValue = 0;
    private int greenValue = 0;
    private int blueValue = 0;
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      panel.setLayout(new BorderLayout());
      panel.add(panel1,BorderLayout.WEST);
      panel.add(panel2,BorderLayout.CENTER);
      panel.setBorder(new TitledBorder("Choose colors"));
      
      label.setFont(new Font("TimesRoman",Font.BOLD,30));
      label.setHorizontalAlignment(JLabel.CENTER);
      
      this.add(label,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      AdjustmentListener listener = new MyListener();
      panel2.jsbRed.addAdjustmentListener(listener);
      panel2.jsbGreen.addAdjustmentListener(listener);
      panel2.jsbBlue.addAdjustmentListener(listener);
  }    
    
    private class MyListener implements AdjustmentListener
  {
      public void adjustmentValueChanged(AdjustmentEvent e)
    {
        if(e.getSource()==panel2.jsbRed) redValue = panel2.jsbRed.getValue()*284/panel2.jsbRed.getMaximum();
        if(e.getSource()==panel2.jsbGreen) greenValue = panel2.jsbGreen.getValue()*284/panel2.jsbGreen.getMaximum();
        if(e.getSource()==panel2.jsbBlue) blueValue = panel2.jsbBlue.getValue()*284/panel2.jsbBlue.getMaximum();
        
        Color color = new Color(redValue,greenValue,blueValue);
        label.setForeground(color);
    }
  }
}
