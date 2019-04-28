import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

  public class Calculator extends JFrame
{
    private JTextField jtfNumber1 = new JTextField();    
    private JTextField jtfNumber2 = new JTextField();   
    private JTextField jtfResult = new JTextField();   
    private JButton jbtAdd = new JButton("Add");
    private JButton jbtSubtract = new JButton("Subtract");
    private JButton jbtMultiply = new JButton("Multiply");
    private JButton jbtDivide = new JButton("Divide");
    
    public Calculator()
  {
      JPanel p1 = new JPanel(new GridLayout(1,6)); 
      p1.add(new JLabel("Number 1"));
      p1.add(jtfNumber1);
      p1.add(new JLabel("Number 2"));
      p1.add(jtfNumber2);
      p1.add(new JLabel("Result"));
      p1.add(jtfResult);
      p1.setBorder(new TitledBorder(""));
      
      JPanel p2 = new JPanel(new FlowLayout());
      p2.add(jbtAdd);
      p2.add(jbtSubtract);
      p2.add(jbtMultiply);
      p2.add(jbtDivide);
      
      this.add(p1,BorderLayout.CENTER);
      this.add(p2,BorderLayout.SOUTH);
      
      ButtonListener listener = new ButtonListener();
      jbtAdd.addActionListener(listener);
      jbtSubtract.addActionListener(listener);
      jbtMultiply.addActionListener(listener);
      jbtDivide.addActionListener(listener);
  }
    
    private class ButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        double number1 = Double.parseDouble(jtfNumber1.getText());
        double number2 = Double.parseDouble(jtfNumber2.getText());
        
        String resultString = "";
        if(e.getSource()==jbtAdd) resultString += String.format("%.2f",number1+number2);
        if(e.getSource()==jbtSubtract) resultString += String.format("%.2f",number1-number2);
        if(e.getSource()==jbtMultiply) resultString += String.format("%.2f",number1*number2);
        if(e.getSource()==jbtDivide) resultString += String.format("%.2f",number1/number2);
        
        jtfResult.setText(resultString);
    }  
  } 
}
