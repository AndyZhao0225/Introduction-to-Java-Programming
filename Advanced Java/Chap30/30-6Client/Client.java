import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

  public class Client extends JApplet 
{
    private final int NAME_SIZE = 32;
    private final int STREET_SIZE = 32;
    private final int CITY_SIZE = 20;
    private final int STATE_SIZE = 2;
    private final int ZIP_SIZE = 5;
    private JTextField jtfName = new JTextField(NAME_SIZE);
    private JTextField jtfStreet = new JTextField(STREET_SIZE);
    private JTextField jtfCity = new JTextField(CITY_SIZE);
    private JTextField jtfState = new JTextField(STATE_SIZE);
    private JTextField jtfZip = new JTextField(ZIP_SIZE);
    private JButton jbAdd = new JButton("Add");
    private JButton jbFirst = new JButton("First");
    private JButton jbNext = new JButton("Next");
    private JButton jbPrevious = new JButton("Previous");
    private JButton jbLast = new JButton("Last");
    private boolean isStandAlone = false;
    private RandomAccessFile raf;
    String host = "localhost";

    public Client()
  {
      
  }
    
    public void init() 
  {
      JPanel p1 = new JPanel();
      p1.setLayout(new GridLayout(3,1));
      p1.add(new JLabel("Name"));
      p1.add(new JLabel("Street"));
      p1.add(new JLabel("City"));

      JPanel jpState = new JPanel();
      jpState.setLayout(new BorderLayout());
      jpState.add(new JLabel("State"),BorderLayout.WEST);
      jpState.add(jtfState,BorderLayout.CENTER);

      JPanel jpZip = new JPanel();
      jpZip.setLayout(new BorderLayout());
      jpZip.add(new JLabel("Zip"),BorderLayout.WEST);
      jpZip.add(jtfZip,BorderLayout.CENTER);

      JPanel p2 = new JPanel();
      p2.setLayout(new BorderLayout());
      p2.add(jpState,BorderLayout.WEST);
      p2.add(jpZip,BorderLayout.CENTER);

      JPanel p3 = new JPanel();
      p3.setLayout(new BorderLayout());
      p3.add(jtfCity,BorderLayout.CENTER);
      p3.add(p2,BorderLayout.EAST);

      JPanel p4 = new JPanel();
      p4.setLayout(new GridLayout(3, 1));
      p4.add(jtfName);
      p4.add(jtfStreet);
      p4.add(p3);

      JPanel studentPanel = new JPanel(new BorderLayout());
      studentPanel.setBorder(new BevelBorder(BevelBorder.RAISED));
      studentPanel.add(p1,BorderLayout.WEST);
      studentPanel.add(p4,BorderLayout.CENTER);

      JPanel buttonPanel = new JPanel();
      buttonPanel.add(jbAdd);
      buttonPanel.add(jbFirst);
      buttonPanel.add(jbNext);
      buttonPanel.add(jbPrevious);
      buttonPanel.add(jbLast);
      
      add(studentPanel,BorderLayout.CENTER);
      add(buttonPanel,BorderLayout.SOUTH);

      jbAdd.addActionListener(new ButtonListener());
      jbFirst.addActionListener(new ButtonListener());
      jbNext.addActionListener(new ButtonListener());
      jbPrevious.addActionListener(new ButtonListener());
      jbLast.addActionListener(new ButtonListener());

      if(!isStandAlone) host = getCodeBase().getHost();
  }

    private class ButtonListener implements ActionListener 
  {
      public void actionPerformed(ActionEvent e) 
    {
        try 
         {
            Socket socket = new Socket(host,8000);
            ObjectOutputStream toServer = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream fromServer = new ObjectInputStream(socket.getInputStream());

            if(e.getSource()==jbAdd) 
              {
                 toServer.writeObject("add");
                 String name = jtfName.getText().trim();
                 String street = jtfStreet.getText().trim();
                 String city = jtfCity.getText().trim();
                 String state = jtfState.getText().trim();
                 String zip = jtfZip.getText().trim();
                 Address s = new Address(name,street,city,state,zip);
                 toServer.writeObject(s);
              }
            else 
              {
                 if(e.getSource()==jbFirst) toServer.writeObject("first");
                 else if(e.getSource()==jbNext) toServer.writeObject("next");
                 else if(e.getSource()==jbPrevious) toServer.writeObject("previous");
                 else if(e.getSource()==jbLast) toServer.writeObject("last");
              
                 Object object = fromServer.readObject();
                 if(object instanceof String) 
                   {
                      jtfName.setText((String)object);
                      jtfStreet.setText("");
                      jtfCity.setText("");
                      jtfState.setText("");
                      jtfZip.setText("");
                   }
                 else 
                   {
                      Address address = (Address)object;
                      jtfName.setText(address.getName());
                      jtfStreet.setText(address.getStreet());
                      jtfCity.setText(address.getCity());
                      jtfState.setText(address.getState());
                      jtfZip.setText(address.getZip());
                   }
              
              }
            
            toServer.close();
            socket.close();          
         }
        catch(Exception ex) 
             {
                ex.printStackTrace();
             }
    }
  }

    public static void main(String[] args) 
  {
      JFrame frame = new JFrame("Register Student Client");

      Client applet = new Client();
      applet.isStandAlone = true;

      applet.host = "localhost";

      frame.add(applet,BorderLayout.CENTER);

      applet.init();
      applet.start();
    
      frame.pack();
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
  }
}
