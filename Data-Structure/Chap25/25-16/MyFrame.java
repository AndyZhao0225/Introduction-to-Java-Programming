import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

  public class MyFrame extends JFrame
{
    private JButton insertButton = new JButton("Insert");  
    private JButton deleteButton = new JButton("Delete");
    private JButton searchButton = new JButton("Search");
    private JButton trimButton = new JButton("TrimToSize");
    private JTextField field = new JTextField(5);
    private JTextField indexField = new JTextField(5);
    private JLabel label = new JLabel("Enter a value");
    private JLabel indexLabel = new JLabel("Enter an index");
    private MyPanel panel = new MyPanel();
      
    public MyFrame()
  {
      JPanel p1 = new JPanel();
      p1.add(label);
      p1.add(field);
      p1.add(indexLabel);
      p1.add(indexField);
      p1.add(searchButton);
      p1.add(insertButton);
      p1.add(deleteButton);
      p1.add(trimButton);
      
      this.add(panel,BorderLayout.CENTER);
      this.add(p1,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      searchButton.addActionListener(listener);
      insertButton.addActionListener(listener);
      deleteButton.addActionListener(listener);
      trimButton.addActionListener(listener);
  }    
    
    public class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==insertButton) 
          {
             if(indexField.getText().length()==0) panel.insert(Integer.parseInt(field.getText()));
             else panel.insert(Integer.parseInt(indexField.getText()),Integer.parseInt(field.getText()));
          }
        if(e.getSource()==deleteButton) panel.remove(Integer.parseInt(indexField.getText()));
        if(e.getSource()==searchButton) 
          {
             boolean result = panel.search(Integer.parseInt(field.getText()));
             String text = result? Integer.parseInt(field.getText())+" is in the list": Integer.parseInt(field.getText())+" isn't in the list";
             JOptionPane.showMessageDialog(null,text,"Message",JOptionPane.INFORMATION_MESSAGE);
          }
        if(e.getSource()==trimButton) panel.trim();
    }  
  }
}
