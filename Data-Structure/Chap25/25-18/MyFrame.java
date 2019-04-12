import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JButton pushButton = new JButton("Insert(push)");  
    private JButton popButton = new JButton("Delete(pop)");
    private JTextField field = new JTextField(5);
    private JLabel label = new JLabel("Enter a value");
    private MyPanel panel = new MyPanel();
      
    public MyFrame()
  {
      JPanel p1 = new JPanel();
      p1.add(label);
      p1.add(field);
      p1.add(pushButton);
      p1.add(popButton);
      
      this.add(panel,BorderLayout.CENTER);
      this.add(p1,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      pushButton.addActionListener(listener);
      popButton.addActionListener(listener);
  }    
    
    public class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==pushButton) panel.push(Integer.parseInt(field.getText()));
        if(e.getSource()==popButton) panel.pop();
    }  
  }
}
