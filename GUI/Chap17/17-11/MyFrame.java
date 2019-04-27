import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyFrame extends JFrame
{
    private JTextField field = new JTextField("Type any thing",30);
    private JLabel label = new JLabel("Text field");
    private MyPanel myPanel = new MyPanel();
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      JPanel panel = new JPanel();
      panel.add(label);
      panel.add(field);
      
      this.add(panel,BorderLayout.CENTER);
      this.add(myPanel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      myPanel.left.addActionListener(listener);
      myPanel.center.addActionListener(listener);
      myPanel.right.addActionListener(listener);
      myPanel.columnSizeField.addActionListener(listener);
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==myPanel.left) field.setHorizontalAlignment(JTextField.LEFT);
        if(e.getSource()==myPanel.center) field.setHorizontalAlignment(JTextField.CENTER);
        if(e.getSource()==myPanel.right) field.setHorizontalAlignment(JTextField.RIGHT);
        if(e.getSource()==myPanel.columnSizeField) 
          {
             String text = myPanel.columnSizeField.getText();
             field.setColumns(Integer.parseInt(text));
          }
    }        
  }
}
