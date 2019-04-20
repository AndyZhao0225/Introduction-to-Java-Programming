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

  public class MyFrame extends JFrame
{
    private JTextField fileField = new JTextField(18);
    private JTextField numberField = new JTextField(10);
    private JLabel fileLabel = new JLabel("Enter a base file: ");
    private JLabel numberLabel = new JLabel("Specify the number of smaller files: ");
    private JButton startButton = new JButton("Start");
    private JTextArea area = new JTextArea("If the base file is named temp.txt with three pieces, temp1.txt temp2.txt "
                                         + "\nand temp3.txt are combined into temp.txt");
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
  }
    
    public class StartButtonListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {  
        fileName = fileField.getText();
        numberOfPieces = Integer.parseInt(numberField.getText());
        if(fileName!=null && numberOfPieces>=1) 
          {
             try
              {
                 CombineFiles.combine(fileName,numberOfPieces);
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
}
