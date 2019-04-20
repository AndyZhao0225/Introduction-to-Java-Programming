import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;
import javax.swing.JFileChooser;

  public class MyFrame extends JFrame
{
    private JTextField fileField = new JTextField(18);
    private JTextField numberField = new JTextField(10);
    private JLabel fileLabel = new JLabel("Enter or choose a file: ");
    private JLabel numberLabel = new JLabel("Specify the number of smaller files: ");
    private JButton browseButton = new JButton("Browse");
    private JButton startButton = new JButton("Start");
    private JTextArea area = new JTextArea("If you split a file named temp.txt into 3 smaller files, the three smaller files"
                                 + "\nare temp1.txt temp2.txt temp3.txt");
    private String fileName;
    private int numberOfPieces;
    
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      area.setEditable(false);
      this.add(area,BorderLayout.NORTH);
      JPanel panel1 = new JPanel();
      panel1.add(fileLabel);
      panel1.add(fileField);
      panel1.add(browseButton);
      JPanel panel2 = new JPanel();
      panel2.add(numberLabel);
      panel2.add(numberField);
      JPanel panel = new JPanel();
      panel.add(panel1);
      panel.add(panel2);
      this.add(panel,BorderLayout.CENTER);
      this.add(startButton,BorderLayout.SOUTH);
      
      StartButtonListener startButtonListener = new StartButtonListener();
      startButton.addActionListener(startButtonListener);
      BrowseButtonListener browseButtonListener = new BrowseButtonListener();
      browseButton.addActionListener(browseButtonListener);
  }
    
    public class StartButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {  
        fileName = fileField.getText();
        numberOfPieces = Integer.parseInt(numberField.getText());
        if(fileName!=null && numberOfPieces>=2) 
          {
             try
              {
                 SplitAFile.split(fileName,numberOfPieces);
              }
             catch(IOException ex)
              {
                 
              }
             finally
              {
                 System.exit(0);
              }
          }
    }
  } 
    
    public class BrowseButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        JFileChooser fileChooser = new JFileChooser();
        if(fileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) 
          {
             fileName = fileChooser.getSelectedFile().getName();
             fileField.setText(fileName);
          }
    }
  } 
}
