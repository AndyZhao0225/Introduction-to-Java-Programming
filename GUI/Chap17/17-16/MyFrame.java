import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

  public class MyFrame extends JFrame
{
    private MyFirstPanel panel1 = new MyFirstPanel();  
    private MySecondPanel panel2 = new MySecondPanel();
    private JPanel panel = new JPanel(); 
    private JLabel label = new JLabel("Show Colors");
    private int redValue = 0;
    private int greenValue = 0;
    private int blueValue = 0;
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      label.setFont(new Font("TimesRoman",Font.BOLD,30));
      label.setHorizontalAlignment(JLabel.CENTER);
      
      panel.setLayout(new BorderLayout());
      panel.add(panel1,BorderLayout.WEST);
      panel.add(panel2,BorderLayout.CENTER);
      panel.setBorder(new TitledBorder("Choose colors"));
      
      this.add(label,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      panel2.redSlider.addChangeListener(listener);
      panel2.greenSlider.addChangeListener(listener);
      panel2.blueSlider.addChangeListener(listener);
  } 
    
    private class MyListener implements ChangeListener
  {
      public void stateChanged(ChangeEvent e)
    {
        if(e.getSource()==panel2.redSlider) redValue = panel2.redSlider.getValue();
        if(e.getSource()==panel2.greenSlider) greenValue = panel2.greenSlider.getValue();
        if(e.getSource()==panel2.blueSlider) blueValue = panel2.blueSlider.getValue();
        
        Color color = new Color(redValue,greenValue,blueValue);
        label.setForeground(color);

    }  
  }
}
