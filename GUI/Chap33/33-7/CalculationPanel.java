import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

  public abstract class CalculationPanel extends JPanel
{
    private JButton addButton = new JButton("Add");
    private JButton subtractButton = new JButton("Subtract");
    private JButton multiplyButton = new JButton("Multiply");
    private JButton divideButton = new JButton("Divide");   
    protected JTextField num1Field = new JTextField(8);
    protected JTextField num2Field = new JTextField(8);
    protected JTextField resultField = new JTextField(8);
    
    public CalculationPanel(String title)
  {
      this.setLayout(new BorderLayout());
      
      JPanel p1 = new JPanel();
      JPanel p2 = new JPanel();
      JPanel p3 = new JPanel();
      
      p1.add(new JLabel(title));
      
      p2.add(new JLabel("Number 1"));
      p2.add(num1Field);
      p2.add(new JLabel("Number 2"));
      p2.add(num2Field);
      p2.add(new JLabel("Result"));
      p2.add(resultField);
      
      p3.add(addButton);
      p3.add(subtractButton);
      p3.add(multiplyButton);
      p3.add(divideButton);
      
      this.add(p1,BorderLayout.NORTH);
      this.add(p2,BorderLayout.CENTER);
      this.add(p3,BorderLayout.SOUTH);
      
      resultField.setEditable(false);
      
      MyListener listener = new MyListener();
      addButton.addActionListener(listener);
      subtractButton.addActionListener(listener);
      multiplyButton.addActionListener(listener);
      divideButton.addActionListener(listener);
  }    
    
    protected class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==addButton) add();
        else if(e.getSource()==subtractButton) subtract();
        else if(e.getSource()==multiplyButton) multiply();
        else if(e.getSource()==divideButton) divide();
    }  
  } 
    
    protected abstract void add();
    
    protected abstract void subtract();
    
    protected abstract void multiply();
    
    protected abstract void divide();
}
