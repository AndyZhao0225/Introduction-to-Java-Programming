import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileNotFoundException;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.Color;

  public class MyFrame extends JFrame
{
    private JTextField field = new JTextField(40);
    private Histogram histogram = new Histogram();
      
    public MyFrame()
  {
      this.setLayout(new BorderLayout());
      
      Border lineBorder = new LineBorder(Color.BLACK,1);
      histogram.setBorder(lineBorder);
      
      JPanel panel = new JPanel();
      panel.add(new JLabel("Text File"));
      panel.add(field);
      
      this.add(panel,BorderLayout.SOUTH);
      this.add(histogram,BorderLayout.CENTER);
      
      MyListener listener = new MyListener();
      field.addActionListener(listener);
  }    
    
    private int[] countLetters(String text) 
  {
      int[] count = new int[26];

      for( int i=0; i<=text.length()-1; i++) 
         {
            char character = text.charAt(i);
            if((character >= 'A') && (character <= 'Z')) count[(int)character - 65]++; 
            else if ((character >= 'a') && (character <= 'z')) count[(int)character - 97]++;    
         }

      return count; 
  }

    public String readFile()
  {
      String text = "";
      String fileName = field.getText().trim();
      try
        {
           File file = new File(fileName);
           Scanner input = new Scanner(file);
           while(input.hasNext())
                 text += input.nextLine() + "\n";
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
      finally 
           {
              return text;
           }
  }    
    
    private class MyListener implements ActionListener
  {
      public void actionPerformed(ActionEvent e)
    {
        String text = readFile();
        int[] count = countLetters(text);
        histogram.showHistogram(count);
    }
  } 
}
