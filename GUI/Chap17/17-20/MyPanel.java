import javax.swing.JPanel;
import java.util.Scanner;
import java.io.File;
import javax.swing.JTextArea;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

  public class MyPanel extends JPanel
{
    private JTextArea area = new JTextArea(80,40);  
    private int i = 0;
    private File[] files = new File[10];  
      
    public MyPanel() throws Exception
  {
      area.setWrapStyleWord(true);
      area.setLineWrap(true);
      this.add(area);
      
      for( int j=0; j<=files.length-1; j++)
         {
            String route = "D:\\Java Projects Folder\\Accepted\\17-20\\text\\slide" + j + ".txt";
            files[j] = new File(route);
         }

      Scanner input = new Scanner(files[i++]);
      String str = "";
      while(input.hasNext())
           {
              str += input.nextLine();
              str += "\n";
           }
      input.close();
      area.setText(str);
      
      Timer timer = new Timer(1000,new MyListener());
      timer.start();
  }  
    
    private class MyListener implements ActionListener
  {
       public void actionPerformed(ActionEvent e) 
     {
         try
          {
             if(i>9) i = 0;
             Scanner input = new Scanner(files[i++]);
             String str = "";
             while(input.hasNext())
                  {
                     str += input.nextLine();
                     str += "\n";
                  }
             input.close();
      
             area.setText(str);
             repaint();
          }catch(Exception ex)
                {
              
                }
     }  
  }
}
