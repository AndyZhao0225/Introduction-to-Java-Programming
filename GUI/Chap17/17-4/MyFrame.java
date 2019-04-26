import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;

  public class MyFrame extends JFrame
{
    private JTextArea area = new JTextArea();
    private JTextField field = new JTextField(30);  
    private JButton button = new JButton("View");
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      Border lineBorder = new LineBorder(Color.BLACK,1);
      
      JScrollPane scrollPane = new JScrollPane(area);
      scrollPane.setBorder(lineBorder);
      
      JPanel panel = new JPanel();
      panel.add(new JLabel("Filename"));
      panel.add(field);
      panel.add(button);
      panel.setBorder(lineBorder);
      
      this.add(scrollPane,BorderLayout.CENTER);
      this.add(panel,BorderLayout.SOUTH);
      
      MyListener listener = new MyListener();
      button.addActionListener(listener);
  }    
    
    public void showText()
  {
      String fileName = field.getText().trim();
      try
        {
           File file = new File(fileName);
           Scanner input = new Scanner(file);
           while(input.hasNext())
                 area.append(input.nextLine() + "\n");
           
           input.close();
        }
      catch(FileNotFoundException e)
           {
              System.out.println("File Not Found");
           }
      catch(IOException ex) 
           {
              System.out.println(ex.getMessage());
           }
  }
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        area.setText("");
        showText();
    }
  }
}
