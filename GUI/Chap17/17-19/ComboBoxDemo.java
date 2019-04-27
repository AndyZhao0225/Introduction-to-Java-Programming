import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.io.File;

  public class ComboBoxDemo extends JFrame 
{
    private String[] flagTitles = {"Canada", "China", "Denmark", "France",
                                   "Germany", "India", "Norway", "United Kingdom",
                                   "United States of America"};
    private ImageIcon[] flagImage = { new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\ca.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\china.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\denmark.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\fr.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\germany.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\india.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\norway.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\uk.gif"),
                                      new ImageIcon("D:\\Java Projects Folder\\Wrong\\17-19\\img\\us.gif") };
    private DescriptionPanel descriptionPanel = new DescriptionPanel();
    private JComboBox jcbo = new JComboBox(flagTitles);
    private File file0 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description0.txt");
    private File file1 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description1.txt");
    private File file2 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description2.txt");
    private File file3 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description3.txt");
    private File file4 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description4.txt");
    private File file5 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description5.txt");
    private File file6 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description6.txt");
    private File file7 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description7.txt");
    private File file8 = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\description8.txt");
    private File defaultFile = new File("D:\\Java Projects Folder\\Wrong\\17-19\\text\\default.txt");
    
    public static void main(String[] args) throws Exception
  {
      ComboBoxDemo frame = new ComboBoxDemo();
      frame.setTitle("ComboBoxDemo");
      frame.setSize(450,350);
      frame.setLocationRelativeTo(null); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
  }

    public ComboBoxDemo() throws Exception
  { 
      setDisplay(0);
    
      add(jcbo, BorderLayout.NORTH);
      add(descriptionPanel, BorderLayout.CENTER);

      MyListener listener = new MyListener();
      jcbo.addActionListener(listener);
  }

    public void setDisplay(int index) throws Exception
  {
      descriptionPanel.setTitle(flagTitles[index]);
      descriptionPanel.setImageIcon(flagImage[index]);
      
      Scanner input = new Scanner(defaultFile);
      switch(index)
        {
          case 0: input = new Scanner(file0); break;
          case 1: input = new Scanner(file1); break;
          case 2: input = new Scanner(file2); break;
          case 3: input = new Scanner(file3); break;
          case 4: input = new Scanner(file4); break;
          case 5: input = new Scanner(file5); break;
          case 6: input = new Scanner(file6); break;
          case 7: input = new Scanner(file7); break;
          case 8: input = new Scanner(file8);  
        }
      String text = "";
      while(input.hasNext())
            text += input.nextLine();
      input.close();
      
      descriptionPanel.setDescription(text);
  }
    
    private class MyListener implements ActionListener 
  {
      public void actionPerformed(ActionEvent e) 
    {
        try
          {
             setDisplay(jcbo.getSelectedIndex());
          }
        catch(Exception ex)
          {
           
          }
    }  
  }
}
