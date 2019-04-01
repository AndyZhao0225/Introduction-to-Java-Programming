import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

  public class MyFrame extends JFrame
{
    private JLabel label = new JLabel("Filename");
    private JButton button = new JButton("Browse");
    private JTextField field = new JTextField(60);
    private JTextArea area = new JTextArea();
    private JFileChooser fileChooser = new JFileChooser(new File("."));
      
    public MyFrame()
  {
      JPanel panel = new JPanel();
      panel.setLayout(new BorderLayout());
      panel.add(label,BorderLayout.WEST);
      panel.add(field,BorderLayout.CENTER);
      panel.add(button,BorderLayout.EAST);
      
      area.setLineWrap(true);
      this.add(new JScrollPane(area),BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
      field.addActionListener(listener);
  } 
    
    public void open()
  {
      if(fileChooser.showOpenDialog(this)==JFileChooser.APPROVE_OPTION) open(fileChooser.getSelectedFile());
  }
    
    public void open(File file)
  {
      try
        {
           area.setText("");
           BufferedInputStream in = new BufferedInputStream(new FileInputStream(file));
           byte[] b = new byte[in.available()];
           in.read(b,0,b.length);
           area.append(new String(b,0,b.length));
           in.close();
           field.setText(file.getName());
        }
      catch(IOException ex)
        {
           
        }
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button) open();
        if(e.getSource()==field) 
          {
             File file = new File(field.getText());
             open(file);
          }
    }  
  }
}
