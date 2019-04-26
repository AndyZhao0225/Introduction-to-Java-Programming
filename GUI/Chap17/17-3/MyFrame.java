import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

  public class MyFrame extends JFrame
{
    private ButtonPanel buttonPanel = new ButtonPanel();   
    private LightPanel lightPanel = new LightPanel(); 
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      this.add(buttonPanel,BorderLayout.SOUTH);
      this.add(lightPanel,BorderLayout.NORTH);
      
      MyListener listener = new MyListener();
      buttonPanel.redButton.addActionListener(listener);
      buttonPanel.yellowButton.addActionListener(listener);
      buttonPanel.greenButton.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==buttonPanel.redButton) lightPanel.setColor(Color.RED);
        if(e.getSource()==buttonPanel.yellowButton) lightPanel.setColor(Color.YELLOW);
        if(e.getSource()==buttonPanel.greenButton) lightPanel.setColor(Color.GREEN);
        
        lightPanel.repaint();
    }
  }
}
