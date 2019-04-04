import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
 
  public class MyFrame extends JFrame
{
    private JButton leftButton = new JButton("left button");
    private JButton rightButton = new JButton("right button");
    private JTextField field = new JTextField(20);
    private JLabel label = new JLabel("Divider Size");
    private JRadioButton horizontalButton = new JRadioButton("Horizontal");
    private JRadioButton verticalButton = new JRadioButton("Vertical");
    private JCheckBox box = new JCheckBox("Continous Layout");
    private JSplitPane pane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,false,leftButton,rightButton);
    
    public MyFrame()
  {
      ButtonGroup group = new ButtonGroup();
      group.add(horizontalButton);
      group.add(verticalButton);
      
      this.add(pane,BorderLayout.CENTER);
      
      JPanel panel1 = new JPanel(new GridLayout(2,1));
      panel1.add(horizontalButton);
      panel1.add(verticalButton);
      panel1.setBorder(new TitledBorder("Orientation"));
      
      JPanel panel3 = new JPanel();
      panel3.add(label);
      panel3.add(field);
      
      JPanel panel2 = new JPanel(new BorderLayout());
      panel2.add(box,BorderLayout.NORTH);
      panel2.add(panel3,BorderLayout.CENTER);
      
      JPanel panel = new JPanel();
      panel.add(panel1);
      panel.add(panel2);
      
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      box.addActionListener(listener);
      field.addActionListener(listener);
      horizontalButton.addActionListener(listener);
      verticalButton.addActionListener(listener);
  }   
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==box)
          {
             pane.setContinuousLayout(box.isSelected());
             pane.revalidate();
          }
        if(e.getSource()==horizontalButton) 
          {
             pane.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
             pane.revalidate();
          }
        if(e.getSource()==verticalButton) 
          {
             pane.setOrientation(JSplitPane.VERTICAL_SPLIT);
             pane.revalidate();
          }
        if(e.getSource()==field) 
          {
             int dividerSize = Integer.parseInt(field.getText());
             pane.setDividerSize(dividerSize);
             pane.revalidate();
          }
    } 
  } 
}
