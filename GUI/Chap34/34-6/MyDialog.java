import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Frame;

  public class MyDialog extends JDialog
{
    private String userName;
    private String password;
    private JTextField userNameField = new JTextField(15);
    private JTextField passwordField = new JPasswordField(15);
    private JButton okButton = new JButton("OK");
    private JButton cancelButton = new JButton("Cancel");
    
    public MyDialog()
  {
      this(null,true);
  }
    
    public MyDialog(Frame parent, boolean modal)
  {   
      super(parent,modal); 
     
      JLabel userNameLabel = new JLabel("User name");
      JLabel passwordLabel = new JLabel("Password");
      JPanel panel1 = new JPanel();
      panel1.setLayout(new GridLayout(2,1));
      panel1.add(userNameLabel);
      panel1.add(passwordLabel);
      
      JPanel panel2 = new JPanel();
      panel2.setLayout(new GridLayout(2,1));
      panel2.add(userNameField);
      panel2.add(passwordField);
      
      JPanel panel3 = new JPanel();
      panel3.setLayout(new BorderLayout());
      panel3.add(panel1,BorderLayout.WEST);
      panel3.add(panel2,BorderLayout.EAST);
      
      JPanel panel4 = new JPanel();
      panel4.add(okButton);
      panel4.add(cancelButton);
      
      this.add(panel3,BorderLayout.CENTER);
      this.add(panel4,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      okButton.addActionListener(listener);
      cancelButton.addActionListener(listener);
  }
    
    public String getUserName()
  {
      return userName;
  }
    
    public String getPassword()
  {
      return password;
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==okButton)
          {
             userName = userNameField.getText();
             password = passwordField.getText();
             System.out.println(userName);
             System.out.println(password);
          }
        else
          {
             userName = null;
             password = null;
          }
        setVisible(false);
    }
  }
}
