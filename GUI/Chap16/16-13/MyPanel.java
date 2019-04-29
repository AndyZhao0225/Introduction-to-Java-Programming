import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.ImageIcon;

  public class MyPanel extends JPanel
{
    private int i = 0;
    private JLabel label;
    private ImageIcon[] slides = new ImageIcon[25];
    
    public MyPanel()
  {
      for( int j=0; j<=slides.length-1; j++)
         {
            String route = "D:\\Java Projects Folder\\Accepted\\16-13\\slides\\slide" + j + ".jpg";
            slides[j] = new ImageIcon(route);
         }
      
      i = 0;
      label = new JLabel(slides[i++]);
      this.add(label);
      
      Timer timer = new Timer(2000,new MyListener());
      timer.start();
  }
    
     private class MyListener implements ActionListener
  {
       public void actionPerformed(ActionEvent e)
     {
         if(i>24) i = 0;
         label.setIcon(slides[i++]);
         
         repaint();
     }  
  }
}
