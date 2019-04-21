import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MySecondPanel extends JPanel
{
    JTextField decField = new JTextField("0",50);
    JTextField hexField = new JTextField("0",50);
    JTextField binField = new JTextField("0",50);
    
    public MySecondPanel()
  {
      setLayout(new GridLayout(3,1));
      
      decField.setHorizontalAlignment(JTextField.RIGHT);
      hexField.setHorizontalAlignment(JTextField.RIGHT);
      binField.setHorizontalAlignment(JTextField.RIGHT);
      
      add(decField);
      add(hexField);
      add(binField);
      
      MyListener listener = new MyListener();
      decField.addActionListener(listener);
      hexField.addActionListener(listener);
      binField.addActionListener(listener);
  }  
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==decField)
          {
             int decimal = Integer.parseInt(decField.getText());
             hexField.setText(Integer.toHexString(decimal));
             binField.setText(Integer.toBinaryString(decimal));
          }
        if(e.getSource()==hexField)
          {
             int hexadecimal = Integer.parseInt(hexField.getText(),16);
             decField.setText(String.valueOf(hexadecimal));
             binField.setText(Integer.toBinaryString(hexadecimal));
          }
        if(e.getSource()==binField)
          {
             int binary = Integer.parseInt(binField.getText(),2);
             decField.setText(String.valueOf(binary));
             hexField.setText(Integer.toHexString(binary));
          }
    }
  }
}
