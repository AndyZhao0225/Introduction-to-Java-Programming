import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;

  public class AlarmDialog extends JDialog
{
    private Alarm alarm;
    private JTextField hourField = new JTextField(15);
    private JTextField minuteField = new JTextField(15);
    private JTextField secondField = new JTextField(15);        
    private JButton okButton = new JButton("OK");
    private JButton cancelButton = new JButton("Cancel");
    
    public AlarmDialog()
  {
      this(null,true);
  } 
    
    public AlarmDialog(Frame parent, boolean modal)
  {     
      super(parent,modal);
      this.setTitle("Set Alarm");
      this.setSize(350,180);
      this.setLocationRelativeTo(null);   
      this.setResizable(false);
      
      JLabel hourLabel = new JLabel("Hour");
      JLabel minuteLabel = new JLabel("Minute");
      JLabel secondLabel = new JLabel("Second");
      JPanel p1 = new JPanel(new GridLayout(3,1));
      p1.add(hourLabel);
      p1.add(minuteLabel);
      p1.add(secondLabel);
      
      JPanel p2 = new JPanel(new GridLayout(3,1));
      p2.add(hourField);
      p2.add(minuteField);
      p2.add(secondField);
      
      JPanel panel1 = new JPanel();
      panel1.add(p1,BorderLayout.WEST);
      panel1.add(p2,BorderLayout.CENTER);
      Border lineBorder = new LineBorder(Color.BLACK,1);
      panel1.setBorder(new TitledBorder("Enter Hour, Minute and Second"));
      
      JPanel panel2 = new JPanel();
      panel2.add(okButton);
      panel2.add(cancelButton);
      
      this.add(panel1,BorderLayout.CENTER);
      this.add(panel2,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      okButton.addActionListener(listener);
      cancelButton.addActionListener(listener);
  }        
    
    public Alarm getAlarm()
  {
      return alarm;
  } 
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==okButton)
          {
             int newHour = Integer.parseInt(hourField.getText().trim());
             int newMinute = Integer.parseInt(minuteField.getText().trim());
             int newSecond = Integer.parseInt(secondField.getText().trim());
             alarm = new Alarm(newHour,newMinute,newSecond);
          }
        if(e.getSource()==cancelButton) alarm = null;
        setVisible(false);
    }  
  }
}