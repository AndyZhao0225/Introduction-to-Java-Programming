import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JButton offerButton = new JButton("Insert(offer)");  
    private JButton pollButton = new JButton("Delete(poll)");
    private JTextField field = new JTextField(5);
    private JLabel label = new JLabel("Enter a value");
    private MyPanel panel = new MyPanel();
      
    public MyFrame()
  {
      JPanel p1 = new JPanel();
      p1.add(label);
      p1.add(field);
      p1.add(offerButton);
      p1.add(pollButton);
      
      this.add(panel,BorderLayout.CENTER);
      this.add(p1,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      offerButton.addActionListener(listener);
      pollButton.addActionListener(listener);;
  }    
    
    public class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==offerButton) panel.offer(Integer.parseInt(field.getText()));
        if(e.getSource()==pollButton) panel.poll();
    }  
  }
}
