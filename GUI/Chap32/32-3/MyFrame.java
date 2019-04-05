import java.awt.BorderLayout;
import javax.swing.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JTextField field = new JTextField(10); 
    private Hurricane hurricane = new Hurricane();
    private JLabel textLabel = new JLabel("Default Message",SwingConstants.CENTER);
      
    public MyFrame()
  {
      JLabel label = new JLabel("Enter Hurricane Category");
      JPanel panel = new JPanel();
      panel.add(label);
      panel.add(field);
      
      this.add(panel,BorderLayout.NORTH);
      this.add(textLabel,BorderLayout.CENTER);
      
      MyListener listener = new MyListener();
      hurricane.addActionListener(listener);
      field.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==field) hurricane.setCategory(Integer.parseInt(field.getText()));
        if(e.getSource()==hurricane) textLabel.setText(e.getActionCommand());
    }  
  }
}
